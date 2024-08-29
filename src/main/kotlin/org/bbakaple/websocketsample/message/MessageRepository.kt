package org.bbakaple.websocketsample.message

import org.bbakaple.websocketsample.websocket.MessageResponse
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository : CrudRepository<Message, Long> {

    @Query(
        """
        select m.name writer, me.text text, me.time time
        from Message me
        join Member m
        on me.member_id = m.id
        where me.id = :id
    """
    )
    fun findWithWriter(@Param("id") id: Long): MessageResponse?
}
