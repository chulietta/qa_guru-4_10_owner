package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {

    public static String getBaseUrl() {
        return getWebConfig().baseUrl();
    }

    public static String getBrowserName() {
        return getWebConfig().browserName();
    }

    public static String getBrowserVersion() {
        return getWebConfig().browserVersion();
    }

    public static String getRemoteUrl() {
        return getWebConfig().remoteUrl();
    }

    public static String getVideoStorage() {
        return getWebConfig().videoStorage();
    }

    private static WebConfig getWebConfig() {
        return ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());
    }
}
