package nl.openweb.structured.data.domain;

import nl.openweb.structured.data.schema.entities.Place;

import java.util.Calendar;

public class EventBean {

    private String name;
    private String url;
    private Calendar startDate;
    private Place location;

    public EventBean(Place location, String name, Calendar startDate, String url) {
        this.location = location;
        this.name = name;
        this.startDate = startDate;
        this.url = url;
    }

    public Place getLocation() {
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
}
