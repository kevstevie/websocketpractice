package org.bbakaple.websocketsample.chatroom

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ChatRoomRepository : CrudRepository<ChatRoom, Long> {
}
