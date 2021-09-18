package newsp
import news.AppUtil

import news.NewsService

class NewsController {
    NewsService newsService
    def index() {
        def response = newsService.list(params);
        [newsList: response.list, total: response.count]
    }
    def create() {
        [news: flash.redirectParams]
    }

    def save() {
        def response = newsService.save(params)
        if (!response.isSuccess) {
            flash.redirectParams = response.model
            // flash.message = AppUtil.infoMessage(g.message(code: "unable.to.save"), false)
            redirect(controller: "news", action: "create")
        }else{
            // flash.message = AppUtil.infoMessage(g.message(code: "saved"))
            redirect(controller: "news", action: "index")
        }
    }

    def publish(Integer id){
        def response = newsService.getById(params.id)
        if (!response){
            // flash.message = AppUtil.infoMessage(g.message(code: "invalid.entity"), false)
            redirect(controller: "news", action: "index")
        }else{
            response = newsService.publish(response, params)
            if (!response.isSuccess){
                //flash.redirectParams = response.model
                // flash.message = AppUtil.infoMessage(g.message(code: "unable.to.update"), false)
                redirect(controller: "news", action: "index")
            }else{
                //flash.message = AppUtil.infoMessage(g.message(code: "updated"))
                redirect(controller: "news", action: "index")
            }
        }
    }

    def details(Integer id) {
        def response = newsService.getById(id)
        if (!response){
            redirect(controller: "news", action: "index")
        }else{
            [news: response]
        }
    }


    def edit(Integer id) {
        if (flash.redirectParams) {
            [news:flash.redirectParams]
        } else {
            def response = newsService.getById(id)
            if (!response) {
                // flash.message = AppUtil.infoMessage(g.message(code: "invalid.entity"), false)
                redirect(controller: "news", action: "index")
            } else {
                [news: response]
            }
        }
    }


    def update() {
        def response = newsService.getById(params.id)
        if (!response){
            // flash.message = AppUtil.infoMessage(g.message(code: "invalid.entity"), false)
            redirect(controller: "news", action: "index")
        }else{
            response = newsService.update(response, params)
            if (!response.isSuccess){
                flash.redirectParams = response.model
                // flash.message = AppUtil.infoMessage(g.message(code: "unable.to.update"), false)
                redirect(controller: "news", action: "edit")
            }else{
                //flash.message = AppUtil.infoMessage(g.message(code: "updated"))
                redirect(controller: "news", action: "index")
            }
        }
    }







    def delete(Integer id) {
        def response = newsService.getById(id)
        if (!response){
            // flash.message = AppUtil.infoMessage(g.message(code: "invalid.entity"), false)
            redirect(controller: "news", action: "index")
        }else{
            response = newsService.delete(response)
            if (!response){
                // flash.message = AppUtil.infoMessage(g.message(code: "unable.to.delete"), false)
            }else{
                //flash.message = AppUtil.infoMessage(g.message(code: "deleted"))
            }
            redirect(controller: "news", action: "index")
        }
    }




}
