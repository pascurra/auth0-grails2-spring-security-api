package auth0.grails2.mvc.sample


class ApiController {

    def publicapi() {
        log.info("Home page")
        render "Public page"
    }

    def api() {
        log.info("Home page")
        render "secured api"
    }

}
