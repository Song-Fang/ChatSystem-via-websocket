package com.songfang.chatsystem.domain;

public class Message {

    private String message;
    private String fromOrigin;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFromOrigin() {
        return fromOrigin;
    }

    public void setFromOrigin(String fromOrigin) {
        this.fromOrigin = fromOrigin;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", fromOrigin='" + fromOrigin + '\'' +
                '}';
    }
}
