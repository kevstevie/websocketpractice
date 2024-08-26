package org.bbakaple.websocketsample.chatroom

import org.springframework.stereotype.Repository

@Repository
interface ChatRoomRepository : org.springframework.data.repository.Repository<ChatRoom, Long> {

    fun findById(id: Long): ChatRoom?

    fun save(chatRoom: ChatRoom)
}
