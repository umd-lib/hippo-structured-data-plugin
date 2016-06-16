package nl.openweb.structured.data.mock;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import java.util.EventObject;
import java.util.Map;

import org.hippoecm.hst.core.container.ComponentManager;
import org.hippoecm.hst.core.container.ComponentsException;
import org.hippoecm.hst.core.container.ContainerConfiguration;
import org.springframework.context.ApplicationContext;

public class MockComponentManager implements ComponentManager {

    private ApplicationContext applicationContext;

    public MockComponentManager(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setConfigurationResources(String[] strings) {

    }

    @Override
    public String[] getConfigurationResources() {
        return new String[0];
    }

    @Override
    public void setServletConfig(ServletConfig servletConfig) {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {

    }

    @Override
    public ServletContext getServletContext() {
        return null;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void start() {

    }

    @Override
    public <T> T getComponent(String s) {
        return (T) applicationContext.getBean(s);
    }

    @Override
    public <T> T getComponent(Class<T> aClass) throws ComponentsException {
        return applicationContext.getBean(aClass);
    }

    @Override
    public <T> Map<String, T> getComponentsOfType(Class<T> aClass) {
        return applicationContext.getBeansOfType(aClass);
    }

    @Override
    public <T> T getComponent(String s, String... strings) {
        return (T) applicationContext.getBean(s);
    }

    @Override
    public <T> T getComponent(Class<T> aClass, String... strings) throws ComponentsException {
        return null;
    }

    @Override
    public <T> Map<String, T> getComponentsOfType(Class<T> aClass, String... strings) {
        return applicationContext.getBeansOfType(aClass);
    }

    @Override
    public void publishEvent(EventObject eventObject) {

    }

    @Override
    public void registerEventSubscriber(Object o) {

    }

    @Override
    public void unregisterEventSubscriber(Object o) {

    }

    @Override
    public void stop() {

    }

    @Override
    public void close() {

    }

    @Override
    public ContainerConfiguration getContainerConfiguration() {
        return null;
    }
}
