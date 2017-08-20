class UrlMappings {

	static mappings = {

        login: "/login"(controller: 'login')
        logout: "/logout"(controller: 'logout')
        callback: "/callback"(controller: 'callback')
        home: "/portal/home"(controller: 'home')

        publicapi: "/publicapi"(controller: 'api', action: 'publicapi')
        api: "/api"(controller: 'api', action: 'api')

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
