package nl.openweb.structured.data.domain;

import java.util.Calendar;

public class EventBean {

    private String name;
    private String url;
    private Calendar startDate;
    private Calendar endDate;
    private LocationBean location;

    public EventBean(String name, String url, LocationBean location, Calendar startDate, Calendar endDate) {
        this.location = location;
        this.name = name;
        this.startDate = startDate;
        this.url = url;
        this.endDate = endDate;
    }

    public LocationBean getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public String getUrl() {
        return url;
    }

    public Calendar getEndDate() {
        return endDate;
    }
}
