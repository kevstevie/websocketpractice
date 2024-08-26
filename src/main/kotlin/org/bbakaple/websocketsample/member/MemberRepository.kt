package org.bbakaple.websocketsample.member

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : CrudRepository<Member, Long> {

    fun findByUserIdAndPassword(userId: String, password: String): Member?
}
