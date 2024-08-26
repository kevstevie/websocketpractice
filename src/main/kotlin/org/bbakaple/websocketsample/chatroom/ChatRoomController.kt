package org.bbakaple.websocketsample.chatroom

import org.bbakaple.websocketsample.auth.Authorization
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ChatRoomController(private val chatRoomService: ChatRoomService) {

    @Authorization
    @PostMapping("/chatrooms")
    fun create(
        @RequestBody request: ChatRoomCreateRequest
    ): ResponseEntity<Unit> {
        chatRoomService.create(request)

        return ResponseEntity.ok().build()
    }
}
