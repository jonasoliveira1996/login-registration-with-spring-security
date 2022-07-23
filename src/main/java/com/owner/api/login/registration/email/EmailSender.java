package com.owner.api.login.registration.email;

public interface EmailSender {
    void send(String to, String email);

}
