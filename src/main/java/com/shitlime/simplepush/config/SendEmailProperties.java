package com.shitlime.simplepush.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "com.shitlime.simplepush.sendemail")
public class SendEmailProperties {
    public String cmd;
}
