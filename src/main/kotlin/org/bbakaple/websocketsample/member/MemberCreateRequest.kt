package org.bbakaple.websocketsample.member

data class MemberCreateRequest(
    val userId: String,
    val password: String,
    val name: String
)
