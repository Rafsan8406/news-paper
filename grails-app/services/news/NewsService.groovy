package news

import grails.web.servlet.mvc.GrailsParameterMap
import org.springframework.web.multipart.commons.CommonsMultipartFile

import javax.servlet.http.HttpServletRequest



class NewsService {
    AuthenticationService authenticationService
    def save(GrailsParameterMap params){
        News news = new News(params)
        news.member = authenticationService.getMember()
        def response = AppUtil.saveResponse(false, news)
       /* News news = new News()
        def file = params.image;
        news.isPublish = false;
        news.image = file.getBytes();
        news.dateCreated = params.dateCreated
        news.description = params.description
        news.title = params.title
        news.identityHash = null
        news.identityHashLastUpdate = null*/

       // def response  = AppUtil.saveResponse(false, news)
        if(news.validate()){
            news.save(flush: true)
            if(!news.hasErrors()){
                response.isSuccess = true

            }
        }
        return response

    }




    def update(News news,GrailsParameterMap params){
        news.properties = params;
        //news.isPublish = true;
        def response = AppUtil.saveResponse(false, news)
        if(news.validate()){
            news.save(flush: true)
            if(!news.hasErrors()){
                response.isSuccess = true
            }
        }
        return response
    }

    def publish(News news,GrailsParameterMap params){
        news.properties = params;
        news.isPublish = true;
        def response = AppUtil.saveResponse(false, news)
        if(news.validate()){
            news.save(flush: true)
            if(!news.hasErrors()){
                response.isSuccess = true
            }
        }
        return response
    }






    def getById(Serializable id){
        return News.get(id)
    }

    def list(GrailsParameterMap params) {
        params.max = params.max ?: GlobalConfig.itemsPerPage()
        List<News> newsList = News.createCriteria().list(params) {
            if (params?.colName && params?.colValue) {
                like(params.colName, "%" + params.colValue + "%")
            }
            if (!params.sort) {
                order("id", "desc")
            }
        }
        return [list: newsList, count: newsList.totalCount]
    }

    def delete(News news){
        try{
            news.delete(flush: true)
        }catch(Exception e){
            println(e.getMessage())
            return false
        }
        return true
    }



}
