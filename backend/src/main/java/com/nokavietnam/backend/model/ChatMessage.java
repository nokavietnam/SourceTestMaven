package com.nokavietnam.backend.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
}
