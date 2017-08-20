package auth0.grails2.mvc.sample

import com.auth0.spring.security.mvc.Auth0Config
import org.springframework.beans.factory.annotation.Autowired

class LogoutController {

    static defaultAction = "logout"

    @Autowired
    Auth0Config auth0Config

    def logout() {
        log.info("Performing logout")
        if (request.getSession(false)) {
            request.session.invalidate()
        }
        redirect(uri: auth0Config.onLogoutRedirectTo)
    }

}
