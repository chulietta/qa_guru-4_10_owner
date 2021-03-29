package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${env}.properties")

public interface WebConfig extends Config {

    @Key("base.url")
    String baseUrl();

    @Key("browser.name")
    String browserName();

    @Key("browser.version")
    String browserVersion();

    @Key("remote.url")
    String remoteUrl();

    @Key("video.storage")
    String videoStorage();
}
