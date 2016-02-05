package nl.openweb.schema.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Place")
@XmlAccessorType(XmlAccessType.NONE)
public class Place {
    private static final String type = "@place";
    private PostalAddress address;

}
