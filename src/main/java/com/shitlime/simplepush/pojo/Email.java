package com.shitlime.simplepush.pojo;

import lombok.Data;

@Data
public class Email {
    // 收件人
    private String receiver;
    // 标题
    private String title;
    // 内容
    private String content;
}
