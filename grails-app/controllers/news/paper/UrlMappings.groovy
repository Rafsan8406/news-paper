package news.paper

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:"news",action: 'index')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
