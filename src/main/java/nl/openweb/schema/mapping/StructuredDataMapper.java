package nl.openweb.schema.mapping;

import org.hippoecm.hst.content.beans.standard.HippoBean;

import nl.openweb.schema.mapping.beans.StructuredData;

public interface StructuredDataMapper<T extends HippoBean> {

    public StructuredData transform(T bean);

    public Class<T> getType();

}
