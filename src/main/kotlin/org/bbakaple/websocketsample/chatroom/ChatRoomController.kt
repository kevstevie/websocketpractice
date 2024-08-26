package org.bbakaple.websocketsample.chatroom

import org.springframework.web.bind.annotation.RestController

@RestController
class ChatRoomController(private val chatRoomService: ChatRoomService) {

}
