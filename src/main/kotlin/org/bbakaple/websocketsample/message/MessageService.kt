package org.bbakaple.websocketsample.message

import org.bbakaple.websocketsample.websocket.MessageResponse
import org.springframework.data.jdbc.core.mapping.AggregateReference
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class MessageService(private val messageRepository: MessageRepository) {

    fun send(request: MessageRequest, chatRoomId: Long): MessageResponse {
        messageRepository.save(
            Message(
                memberId = AggregateReference.to(request.memberId),
                text = request.text,
                chatRoomId = AggregateReference.to(chatRoomId)
            )
        )
        return messageRepository.findWithWriter(request.memberId) ?: throw IllegalArgumentException()
    }

    fun findByChatRoomId(chatRoomId: Long): List<MessageResponse> {
        return messageRepository.findByChatRoomId(chatRoomId)
    }
}
