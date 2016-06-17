package nl.openweb.structured.data.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.request.HstRequestContext;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import nl.openweb.structured.data.AbstractStructuredDataTest;
import nl.openweb.structured.data.mock.MockRequest;


import static nl.openweb.structured.data.tag.StructuredDataPlaceholderTag.STRUCTURED_DATA_AS_JSON;

@RunWith(MockitoJUnitRunner.class)
public class ContributeStructuredDataTest extends AbstractStructuredDataTest {


    private HstRequest hstRequest;
    private HttpServletRequest servletRequest = new MockRequest();

    @Before
    public void init() {
        super.init();
        hstRequest = Mockito.mock(HstRequest.class);
        HstRequestContext requestContext = Mockito.mock(HstRequestContext.class);
        Mockito.when(hstRequest.getRequestContext()).thenReturn(requestContext);
        Mockito.when(requestContext.getServletRequest()).thenReturn(servletRequest);
    }

    @Test
    public void test() {
        ContributeStructuredData.contributeJson("First Bean", hstRequest);
        ContributeStructuredData.contributeJson("Second Bean", servletRequest);

        Object attribute = servletRequest.getAttribute(STRUCTURED_DATA_AS_JSON);
        Assert.assertTrue(attribute instanceof List);
        Assert.assertArrayEquals(new String[]{"First Bean", "Second Bean"}, ((List) attribute).toArray());
    }

}