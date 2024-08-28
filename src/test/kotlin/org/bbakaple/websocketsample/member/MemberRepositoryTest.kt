package org.bbakaple.websocketsample.member

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor

@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@SpringBootTest
class MemberRepositoryTest(private val memberRepository: MemberRepository) {

    @Test
    fun id_generated() {
        memberRepository.save(Member(name = "name", userId = "idid"))
        memberRepository.save(Member(name = "name", userId = "idid"))
        memberRepository.findAll().map { it.id }.forEach { println(it) }
    }
}
