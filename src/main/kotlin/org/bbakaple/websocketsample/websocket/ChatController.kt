package org.bbakaple.websocketsample.websocket

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.web.bind.annotation.RestController

@RestController
class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    fun send(message: Message): Message {
        return message
    }
}
