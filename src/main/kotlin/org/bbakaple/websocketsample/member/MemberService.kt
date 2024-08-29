package org.bbakaple.websocketsample.member

import org.bbakaple.websocketsample.auth.LoginContext
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class MemberService(
    private val memberRepository: MemberRepository,
    private val loginContext: LoginContext
) {

    fun create(request: MemberCreateRequest) {
        memberRepository.save(Member(name = request.name))
    }

    fun login(request: LoginRequest) {
        val id = (memberRepository.findByName(request.name)?.id
            ?: throw IllegalArgumentException())

        loginContext.id = id
    }
}
