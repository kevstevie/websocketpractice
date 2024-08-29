package org.bbakaple.websocketsample.websocket

import java.time.LocalDateTime

data class MessageResponse(val writer: String, val text: String, val time: LocalDateTime) {
}
