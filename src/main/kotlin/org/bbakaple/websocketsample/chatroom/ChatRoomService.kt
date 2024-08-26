package org.bbakaple.websocketsample.chatroom

import org.springframework.stereotype.Service

@Service
class ChatRoomService(private val chatRoomRepository: ChatRoomRepository) {
}
