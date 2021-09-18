package newsp

import news.AppUtil
import news.AuthenticationService


class NewsInterceptor {

    AuthenticationService authenticationService
    NewsInterceptor(){
        match(controller:"news", action:"publish")
    }
    boolean before() {
        if (authenticationService.isAdministratorMember()){
            return true
        }
        flash.message = AppUtil.infoMessage("You are not Authorized for this Action.", false)
        redirect(controller: "news", action: "index")
        return false
    }
}
