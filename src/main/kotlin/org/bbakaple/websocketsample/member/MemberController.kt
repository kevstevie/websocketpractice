package org.bbakaple.websocketsample.member

import jakarta.servlet.http.HttpSession
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
    fun login(request: LoginRequest, session: HttpSession): ResponseEntity<Unit> {
        val id = memberService.login(request)
        session.setAttribute("id", id)
        return ResponseEntity.ok().build()
    }
}
