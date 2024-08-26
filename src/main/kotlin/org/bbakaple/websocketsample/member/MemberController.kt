package org.bbakaple.websocketsample.member

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController(private val memberService: MemberService) {

    @PostMapping("/members")
    fun create(request: MemberCreateRequest): ResponseEntity<Unit> {
        memberService.create(request)
        return ResponseEntity.ok().build()
    }

    @PostMapping("/login")
    fun login(request: LoginRequest): ResponseEntity<Unit> {
        memberService.login(request)
        return ResponseEntity.ok().build()
    }
}
