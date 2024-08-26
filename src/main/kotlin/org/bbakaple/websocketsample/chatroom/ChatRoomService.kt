package org.bbakaple.websocketsample.chatroom

import org.springframework.stereotype.Service

@Service
class ChatRoomService(private val chatRoomRepository: ChatRoomRepository) {
    fun create(request: ChatRoomCreateRequest) {
        chatRoomRepository.save(ChatRoom(name = request.name))
    }
}
