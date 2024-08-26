package org.bbakaple.websocketsample.auth

import org.springframework.stereotype.Component
import org.springframework.web.context.annotation.RequestScope

@RequestScope
@Component
class LoginContext() {

    var id: Long = 0
}
