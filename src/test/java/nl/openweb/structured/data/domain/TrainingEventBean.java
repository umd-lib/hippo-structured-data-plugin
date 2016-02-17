package nl.openweb.structured.data.domain;

import java.util.Calendar;

public class TrainingEventBean extends EventBean {

    public TrainingEventBean(String name, String url, LocationBean location, Calendar startDate, Calendar endDate) {
        super(name, url, location, startDate, endDate);
    }
}
