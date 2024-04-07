package com.shitlime.simplepush.controller;

import com.shitlime.simplepush.service.SendEmail;
import com.shitlime.simplepush.pojo.Email;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MainController {
    @Autowired
    SendEmail sendEmail;

    /**
     * 测试接口
     * @return
     */
    @GetMapping("/")
    public String hello() {
        return "Wellcome to simple push server.";
    }

    /**
     * 发送邮件接口
     * @param email
     * @return
     */
    @PostMapping("/sendEmail")
    public Boolean sendEmail(@RequestBody Email email) {
        log.info("send email: {}", email);
        sendEmail.run(email);
        return true;
    }
}
