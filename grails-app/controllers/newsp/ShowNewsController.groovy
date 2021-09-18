package newsp

import news.News
import news.NewsService

class ShowNewsController {
    NewsService newsService
    def index() {
        params.max=300;
        def response = newsService.list(params);
        [newsList: response.list, total: response.count]
    }

    def readMore(Long id){
        def response = newsService.getById(id)
        if (!response){
            redirect(controller: "ShowNews", action: "index")
        }else{
            [news: response]
        }

    }
    def showCover(){

        def news = News.get(params.id)
        response.outputStream << news.image
        response.outputStream.flush()
    }


}
