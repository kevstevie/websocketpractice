package org.bbakaple.websocketsample.websocket

import org.bbakaple.websocketsample.message.MessageRequest
import org.bbakaple.websocketsample.message.MessageService
import org.springframework.messaging.handler.annotation.DestinationVariable
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.web.bind.annotation.RestController

@RestController
class ChatController(private val messageService: MessageService) {

    @MessageMapping("/chat/{chat-room-id}")
    @SendTo("/topic/{chat-room-id}")
    fun send(@DestinationVariable("chat-room-id") chatRoomId: Long, request: MessageRequest): MessageResponse {
        return messageService.send(request, chatRoomId)
    }
}
