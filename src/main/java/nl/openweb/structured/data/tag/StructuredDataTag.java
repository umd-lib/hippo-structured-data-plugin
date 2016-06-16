package nl.openweb.structured.data.tag;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nl.openweb.structured.data.processing.StructuredDataProcessor;

public class StructuredDataTag extends TagSupport {
    private static final Logger LOG = LoggerFactory.getLogger(StructuredDataTag.class);

    private static final long serialVersionUID = -4685336583926691092L;
    private transient Object bean;
    private transient String mapperId;

    @Override
    public void release() {
        this.bean = null;
        this.mapperId = null;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            Object targetBean = getBean();
            if (targetBean != null) {
                StructuredDataProcessor processor = StructuredDataProcessor.get();
                String result = processor.getStructuredDataAsJsonString(targetBean, mapperId);
                if (!result.isEmpty()) {
                    JspWriter out = pageContext.getOut();
                    out.write("<script type=\"application/ld+json\">\n");
                    out.write(result);
                    out.write("</script>");
                }

            }
        } catch (Exception e) {
            LOG.error("Error mapping a bean to JSON: " + e.getMessage(), e);
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

    public String getMapper() {
        return mapperId;
    }

    public void setMapper(String mapperName) {
        this.mapperId = mapperName;
    }
}
