package org.bbakaple.websocketsample.member

import org.springframework.data.annotation.Id

class Member(

    @Id
    var id: Long = 0,
    val name: String
) {
}
