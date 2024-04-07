package com.shitlime.simplepush.service;

import com.shitlime.simplepush.config.SendEmailProperties;
import com.shitlime.simplepush.pojo.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SendEmailByCMD implements SendEmail{
    @Autowired
    SendEmailProperties sendEmailProperties;

    @Override
    public Boolean run(Email email) {
        try {
            // 执行命令
            // 命令中的 {title} {content} {receiver} 将被替换成Email对象中对应的属性
            String cmd = sendEmailProperties.cmd
                    .replace("{title}", email.getTitle())
                    .replace("{content}", email.getContent())
                    .replace("{receiver}", email.getReceiver());
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
