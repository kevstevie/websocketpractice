package org.bbakaple.websocketsample.message

import org.bbakaple.websocketsample.chatroom.ChatRoom
import org.bbakaple.websocketsample.member.Member
import org.springframework.data.annotation.Id
import org.springframework.data.jdbc.core.mapping.AggregateReference
import java.time.LocalDateTime

class Message(
    @Id
    var id: Long = 0,
    val memberId: AggregateReference<Member, Long>,
    val text: String,
    val chatRoomId: AggregateReference<ChatRoom, Long>,
    val time: LocalDateTime = LocalDateTime.now()
) {
}
