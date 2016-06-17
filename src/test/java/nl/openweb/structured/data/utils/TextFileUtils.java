package nl.openweb.structured.data.utils;


import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

public class TextFileUtils {
    private TextFileUtils() {
    }

    public static String getFileAsString(String name) throws IOException {
        return getFileAsString(name, TextFileUtils.class.getClassLoader());
    }

    public static String getFileAsString(String name, ClassLoader classLoader) throws IOException {
        try (InputStream stream = classLoader.getResourceAsStream(name)) {
            return IOUtils.toString(stream, "UTF-8");
        }

    }
}
