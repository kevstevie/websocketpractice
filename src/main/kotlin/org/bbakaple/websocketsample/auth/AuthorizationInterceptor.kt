package org.bbakaple.websocketsample.auth

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.messaging.handler.HandlerMethod
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor

@Component
class AuthorizationInterceptor(private val loginContext: LoginContext) : HandlerInterceptor {

    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        if (handler !is HandlerMethod) {
            return true
        }

        if (handler.hasMethodAnnotation(Authorization::class.java).not()) {
            return true
        }

        val id = request.session.getAttribute("id") ?: return true

        loginContext.id = id as Long

        return true
    }
}
