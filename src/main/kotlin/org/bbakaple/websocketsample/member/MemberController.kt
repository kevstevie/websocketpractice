package org.bbakaple.websocketsample.member

import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController(private val memberService: MemberService) {
}
