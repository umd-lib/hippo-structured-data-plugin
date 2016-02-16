package nl.openweb.structured.data.tag;

import nl.openweb.structured.data.processing.StructuredDataProcessor;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.site.HstServices;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class StructuredDataTag extends TagSupport {

    private static final long serialVersionUID = -4685336583926691092L;
    private transient Object bean;

    @Override
    public void release() {
        this.bean = null;
    }

    @Override
    public int doStartTag() throws JspException {
        Object targetBean = getBean();
        if (targetBean != null) {
            StructuredDataProcessor processor = HstServices.getComponentManager().getComponent("structuredDataProcessor", "nl.openweb.structured.data");
            String result = processor.getStructuredDataAsJsonString(targetBean);
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

    public Object getBean() {
        return bean != null ? bean : getBeanFromContext();
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    private HippoBean getBeanFromContext() {
        HippoBean result = null;
        ServletRequest request = pageContext.getRequest();
        if (request instanceof HstRequest) {
            result = ((HstRequest) request).getRequestContext().getContentBean();
        }
        return result;
    }
}
