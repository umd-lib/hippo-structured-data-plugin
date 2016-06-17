package nl.openweb.structured.data.tag;


import javax.servlet.jsp.JspException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nl.openweb.structured.data.utils.ContributeStructuredData;

public class StructuredDataContributionTag extends StructuredDataTagSupport {
    private static final Logger LOG = LoggerFactory.getLogger(StructuredDataContributionTag.class);

    private static final long serialVersionUID = 1535336583926691092L;
    private transient Object bean;

    @Override
    public void release() {
        super.release();
        this.bean = null;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            Object targetBean = getBean();
            ContributeStructuredData.contributeBean(targetBean, mapperId, pageContext.getRequest());
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

}
