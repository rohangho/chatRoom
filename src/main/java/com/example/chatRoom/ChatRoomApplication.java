package com.example.chatRoom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatRoomApplication {

    public static void main(String[] args) {
        System.out.println("this is basic print");
        SpringApplication.run(ChatRoomApplication.class, args);
    }

}
