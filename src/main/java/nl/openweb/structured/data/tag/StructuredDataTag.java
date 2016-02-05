package nl.openweb.structured.data.tag;

import nl.openweb.structured.data.schema.mapping.StructuredDataMapper;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.site.HstServices;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.tagext.TagSupport;

public class StructuredDataTag extends TagSupport {
    private HippoBean bean;


    public void release() {
        this.bean = null;
    }

    @Override
    public int doStartTag() {
        HippoBean bean = getBean();
        if (bean != null) {
            HstServices.getComponentManager().getComponentsOfType(StructuredDataMapper.class);
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
