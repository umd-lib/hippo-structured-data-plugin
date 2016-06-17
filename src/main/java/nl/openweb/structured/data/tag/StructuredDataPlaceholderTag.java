package nl.openweb.structured.data.tag;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import java.io.IOException;
import java.util.List;

import org.hippoecm.hst.core.component.HstRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StructuredDataPlaceholderTag extends StructuredDataTagSupport {
    private static final Logger LOG = LoggerFactory.getLogger(StructuredDataTag.class);
    private static final long serialVersionUID = -4685336583226421092L;
    public static final String STRUCTURED_DATA_AS_JSON = "STRUCTURED_DATA_AS_JSON";

    @Override
    public int doStartTag() throws JspException {
        try {
            ServletRequest servletRequest = pageContext.getRequest();
            ServletRequest request = servletRequest instanceof HstRequest ? ((HstRequest) servletRequest).getRequestContext().getServletRequest() : servletRequest;
            Object jsonList =  request.getAttribute(STRUCTURED_DATA_AS_JSON);
            if (jsonList instanceof List) {
                printList((List) jsonList);
            }
        } catch (Exception e) {
            LOG.error("Error printing the JSON's: " + e.getMessage(), e);
        }
        return SKIP_BODY;
    }

    private void printList(List jsonList) throws IOException {
        for (Object obj : jsonList) {
            if (obj instanceof String) {
                printString((String) obj);
            } else {
                LOG.error("a non String object was find in the list.");
            }
        }
    }


}
