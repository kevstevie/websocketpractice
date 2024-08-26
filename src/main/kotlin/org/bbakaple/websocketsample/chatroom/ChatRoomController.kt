package org.bbakaple.websocketsample.chatroom

import org.bbakaple.websocketsample.auth.Authorization
import org.bbakaple.websocketsample.auth.MemberId
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
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

    @Authorization
    @PostMapping("/chatrooms/{id}/chatroom-members")
    fun join(
        @PathVariable id: Long,
        @MemberId memberId: Long
    ): ResponseEntity<Unit> {
        chatRoomService.join(id, memberId)
        return ResponseEntity.ok().build()
    }
}
