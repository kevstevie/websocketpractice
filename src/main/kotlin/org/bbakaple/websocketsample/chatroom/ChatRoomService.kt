package org.bbakaple.websocketsample.chatroom

import org.springframework.data.jdbc.core.mapping.AggregateReference
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class ChatRoomService(private val chatRoomRepository: ChatRoomRepository) {
    fun create(request: ChatRoomCreateRequest) {
        chatRoomRepository.save(ChatRoom(name = request.name))
    }

    fun join(id: Long, memberId: Long) {
        val chatRoom = chatRoomRepository.findById(id) ?: throw IllegalArgumentException()

        chatRoom.add(ChatRoomMember(memberId = AggregateReference.to(memberId)))
        chatRoomRepository.save(chatRoom)
    }

    fun list(): List<ChatRoomResponse> {
        return chatRoomRepository.findAll().map { ChatRoomResponse(it.id, it.name) }
    }
}
