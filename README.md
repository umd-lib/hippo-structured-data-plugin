Structured data addon for Hippo
================================
This is an hst addon to providing structured data using json-ld.

Usage
------
Add dependency to Hippo Site
Create mapper classes implementing the interface: _nl.openweb.structured.data.schema.mapping.StructuredDataMapper_
Register them in spring
```XML
    <bean id="breadcrumbList" class="nl.openweb.structured.data.mapper.BreadCrumbListMapper"/>
    <bean class="nl.openweb.structured.data.mapper.EventMapper"/>
```
Define the tag in your jsp
```XML 
<%@ taglib prefix="opw-sd" uri="http://open-web.nl/hippo/structured-data"%>
``` 
To map the current contentbean
```XML
<opw-sd:ld-json/>
```
Or to map a specific bean
```XML
<opw-sd:ld-json bean="${bean}/>
```
Or to map an object using a named mapper
```XML
<opw-sd:ld-json bean="${breadcrumbList} mapper="breadcrumbList"/>
```