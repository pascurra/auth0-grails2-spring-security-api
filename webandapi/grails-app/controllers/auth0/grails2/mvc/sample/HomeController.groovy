package auth0.grails2.mvc.sample

import com.auth0.Auth0User
import com.auth0.SessionUtils
import com.auth0.spring.security.mvc.Auth0Config
import com.auth0.spring.security.mvc.Auth0UserDetails
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.context.SecurityContextHolder

class HomeController {

    static defaultAction = "home"

    @Autowired
    Auth0Config auth0Config

    def home() {
        log.info("Home page")

        Auth0UserDetails principal = (Auth0UserDetails) SecurityContextHolder.context.authentication.principal
        if (principal.authorities.any { it.authority == 'ROLE_ADMIN'}) {
            // just a simple callout to demonstrate role based authorization at service level
            // non-Admin user would be rejected trying to call this service
            log.info("Yes, admin!")
        }

        Auth0User user = SessionUtils.getAuth0User(request)
        [user: user]
    }

}

