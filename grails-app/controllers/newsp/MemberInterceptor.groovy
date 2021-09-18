package newsp

import news.AppUtil
import news.AuthenticationService


class MemberInterceptor {

    AuthenticationService authenticationService

    boolean before() {
        if (authenticationService.isAdministratorMember()){
            return true
        }
        flash.message = AppUtil.infoMessage("You are not Authorized for this Action.", false)
        redirect(controller: "news", action: "index")
        return false
    }
}
