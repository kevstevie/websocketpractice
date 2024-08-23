package org.bbakaple.websocketsample.websocket

import java.time.LocalDateTime

class Message(
    val from: String,
    val text: String,
    val time: LocalDateTime = LocalDateTime.now()
) {
}
