package org.bbakaple.websocketsample.message

import org.bbakaple.websocketsample.websocket.MessageResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(private val messageService: MessageService) {

    @GetMapping("/messages")
    fun viewMessagesByChatRoomId(
        @RequestParam chatRoomId: Long
    ): ResponseEntity<List<MessageResponse>> {
        return ResponseEntity.ok(messageService.findByChatRoomId(chatRoomId))
    }
}
