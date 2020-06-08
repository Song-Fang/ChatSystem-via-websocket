package com.songfang.chatsystem.controller;

import com.songfang.chatsystem.domain.Message;
import com.songfang.chatsystem.storage.UserStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

@MessageMapping("/chat/{to}")
public void sendMessage(@DestinationVariable String to, Message message){
    boolean isExist = UserStorage.getInstance().getUsers().contains(to);
    if(!isExist) throw new RuntimeException("user not existed!");
    simpMessagingTemplate.convertAndSend("/topic/messages/"+to,message);
}
}
