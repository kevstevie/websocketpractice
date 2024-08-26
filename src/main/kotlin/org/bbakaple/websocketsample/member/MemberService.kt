package org.bbakaple.websocketsample.member

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class MemberService(private val memberRepository: MemberRepository) {

    fun create(request: MemberCreateRequest) {
        memberRepository.save(Member(name = request.name, userId = request.userId, password = request.password))
    }
}
