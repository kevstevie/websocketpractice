package org.bbakaple.websocketsample.chatroom

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor

@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@SpringBootTest
class ChatRoomServiceTest(private val chatRoomService: ChatRoomService) {

    @Test
    fun join() {
        chatRoomService.create(ChatRoomCreateRequest("chatrrr"))
        chatRoomService.join(1, 1)
    }
}
