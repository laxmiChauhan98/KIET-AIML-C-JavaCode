package com.example.websocket;

import jakarta.websocket.OnClose;
import jakarta.websocket.OnError;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint("/chat")
public class ChatSocket {

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("Connected: " + session.getId());
    }

    @OnMessage
    public String onMessage(String msg, Session session) {
        System.out.println("Message from " + session.getId() + ": " + msg);
        return "Server received: " + msg;
    }

    @OnClose
    public void onClose(Session session) {
        System.out.println("Closed: " + session.getId());
    }

    @OnError
    public void onError(Session session, Throwable err) {
        err.printStackTrace();
    }
}
