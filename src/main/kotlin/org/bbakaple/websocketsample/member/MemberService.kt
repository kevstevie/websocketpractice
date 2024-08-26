package org.bbakaple.websocketsample.member

import org.springframework.stereotype.Service

@Service
class MemberService(private val memberRepository: MemberRepository) {
}
