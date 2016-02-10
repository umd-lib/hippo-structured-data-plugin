package nl.openweb.structured.data.domain;

public class LocationBean {
    private String name;
    private String address;

    public LocationBean(String name, String address) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
