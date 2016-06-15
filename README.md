Structured data addon for Hippo
================================
This is an hst addon to providing structured data using json-ld.

Usage
------
Add Open Web repository, and structured-data dependency to Hippo Site  
```XML
<project>
    ...
  <repositories>
    <repository>
      <id>openweb-maven-releases</id>
      <url>https://maven.open-web.nl/content/repositories/releases/</url>
      <releases>
        <enabled>true</enabled>
      </releases>
      <snapshots>
        <enabled>false</enabled>
      </snapshots>
    </repository>
  <repositories>
  ...
  <dependency>
    <groupId>nl.openweb.hippo.hst</groupId>
    <artifactId>structured-data</artifactId>
    <version>10.0.02</version>
  </dependency>
</project>
```

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
<opw-sd:ld-json bean="${bean}"/>
```
Or to map an object using a named mapper
```XML
<opw-sd:ld-json bean="${breadcrumbList}" mapper="breadcrumbList"/>
```