package org.bbakaple.websocketsample.chatroom

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.MappedCollection

class ChatRoom(
    @Id
    var id: Long = 0,
    val name: String,
    @MappedCollection(idColumn = "CHAT_ROOM_ID")
    val chatRoomMembers: MutableSet<ChatRoomMember> = mutableSetOf()
) {
    fun add(chatRoomMember: ChatRoomMember) {
        chatRoomMembers.add(chatRoomMember)
    }
}
