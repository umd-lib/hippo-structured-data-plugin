package nl.openweb.structured.data.tag;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.PageContext;
import java.util.Calendar;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import nl.openweb.structured.data.AbstractStructuredDataTest;
import nl.openweb.structured.data.domain.EventBean;
import nl.openweb.structured.data.domain.LocationBean;
import nl.openweb.structured.data.utils.StringWriter;
import nl.openweb.structured.data.utils.TextFileUtils;


import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class StructuredDataPlaceholderTagTest extends AbstractStructuredDataTest {
    private StructuredDataPlaceholderTag tag = new StructuredDataPlaceholderTag();
    private StructuredDataContributionTag contributionTag = new StructuredDataContributionTag();

    @Mock
    private PageContext pageContext;

    private ServletRequest servletRequest = createMockHstRequest();

    private StringWriter out = new StringWriter();

    @Before
    public void init() {
        super.init();
        tag.setPageContext(pageContext);
        contributionTag.setPageContext(pageContext);

        when(pageContext.getRequest()).thenReturn(servletRequest);
        when(pageContext.getOut()).thenReturn(out);

    }

    private EventBean createEvent(String name, String url, LocationBean location, Calendar calendar) {
        return new EventBean(name, url, location, calendar, null);
    }

    private Calendar createCalendar(int year, int month, int day) {
        Calendar startDate = Calendar.getInstance();
        startDate.setTimeZone(TimeZone.getTimeZone("CET"));
        startDate.set(year, month, day, 0, 0);
        return startDate;
    }

    @Test
    public void doStartTag() throws Exception {

        contributionTag.release();
        contributionTag.setBean(createEvent("Pizza Night", "http://openweb.nl/pizza-night", new LocationBean("Openweb Office", "Nevelgaarde 40, 3436 ZZ Nieuwegein"), createCalendar(2016, Calendar.FEBRUARY, 10)));
        contributionTag.doStartTag();
        contributionTag.release();
        contributionTag.setBean(createEvent("Team building", "http://openweb.nl/team-building", new LocationBean("Openweb Office", "Nevelgaarde 40, 3436 ZZ Nieuwegein"), createCalendar(2016, Calendar.JUNE, 17)));
        contributionTag.doStartTag();

        tag.doStartTag();
        String string = out.getAsString();
        Assert.assertEquals(TextFileUtils.getFileAsString("expected/StructuredDataPlaceholderTagTest.txt"), string);
    }


}