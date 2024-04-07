package com.shitlime.simplepush.service;

import com.shitlime.simplepush.pojo.Email;

public interface SendEmail {
    public Boolean run(Email email);
}
