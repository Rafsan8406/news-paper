package newsp

import news.AppUtil
import news.AuthenticationService


class MemberInterceptor {

    AuthenticationService authenticationService

    boolean before() {
        if (authenticationService.isAdministratorMember()){
            return true
        }
        flash.message = "You are not Authorized for this Action."
        redirect(controller: "news", action: "index")
        return false
    }
}
