package nl.openweb.structured.data.tag;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.site.HstServices;

import nl.openweb.structured.data.processing.StructuredDataProcessor;

public class StructuredDataTag extends TagSupport {
    private HippoBean bean;


    public void release() {
        this.bean = null;
    }

    @Override
    public int doStartTag() throws JspException {
        HippoBean bean = getBean();
        if (bean != null) {
            StructuredDataProcessor processor = HstServices.getComponentManager().getComponent("structuredDataProcessor", "nl.openweb.structured.data");
            String result = processor.getStructuredDataAsJsonString(bean);
            try {
                if (!result.isEmpty()) {
                    JspWriter out = pageContext.getOut();
                    out.write("<script type=\"application/ld+json\">\n");
                    out.write(result);
                    out.write("</script>");
                }
            } catch (IOException e) {
                throw new JspException(e);
            }
        }
        return SKIP_BODY;
    }

    public HippoBean getBean() {
        return bean != null ? bean : getBeanFromContext();
    }

    public void setBean(HippoBean bean) {
        this.bean = bean;
    }

    private HippoBean getBeanFromContext() {
        HippoBean bean = null;
        ServletRequest request = pageContext.getRequest();
        if (request instanceof HstRequest) {
            bean = ((HstRequest) request).getRequestContext().getContentBean();
        }
        return bean;
    }
}
