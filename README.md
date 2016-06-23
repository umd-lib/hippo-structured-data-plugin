# Structured data addon for Hippo
This is an hst addon to providing structured data using json-ld.

## Usage
  * Add Open Web repository, and structured-data dependency to Hippo Site  
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

  * Create mapper classes implementing the interface: *nl.openweb.structured.data.schema.mapping.StructuredDataMapper*

  * Register them in spring
  ```XML
  <bean id="breadcrumbList" class="nl.openweb.structured.data.mapper.BreadCrumbListMapper" />
  <bean class="nl.openweb.structured.data.mapper.EventMapper" />
  ```
  * Define the tag in your jsp  
  ```JSP 
  <%@ taglib prefix="sd" uri="http://open-web.nl/hippo/structured-data"% > 
  ```
  
  *or freemarker:*  
  ```FTL
  <#assign sd=JspTaglibs ["http://open-web.nl/hippo/structured-data"] >
  ```
  
## Tags to use for immediate rendering
To map the current contentbean in your jsp
```JSP
<sd:ldJson />
```
or freemarker:
```FTL 
<@sd.ldJson /> 
```
*It's also possible to define the object and use a named mapper in your jsp*
```JSP
<sd:ldJson bean="${breadcrumbList}" mapper="breadcrumbList"/>
```
or freemarker:
```FTL
<@sd.ldJson bean=breadcrumbList mapper=breadcrumbList/>
```

### Tags for Asynchronous rendering
To use this plugin in an asynchronous matter, as headContributions of hippo, use these tags.  
*As with the original tag, the bean and mapper attributes are optional.*  

for JSP:
```JSP
<sd:ldJsonContribution bean="${bean}" mapper="${myBeanMapper}"/> 
<sd:structuredDataPlaceholder/>
```
for freemarker:
```FTL
<@sd.ldJsonContribution bean=bean mapper=myBeanMapper/> 
<@sd.structuredDataPlaceholder/>
```