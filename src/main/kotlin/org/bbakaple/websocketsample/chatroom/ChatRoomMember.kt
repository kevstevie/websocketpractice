package org.bbakaple.websocketsample.chatroom

import org.bbakaple.websocketsample.member.Member
import org.springframework.data.annotation.Id
import org.springframework.data.jdbc.core.mapping.AggregateReference

class ChatRoomMember(
    @Id
    val id: Long = 0,
    val memberId: AggregateReference<Member, Long>
) {
}
