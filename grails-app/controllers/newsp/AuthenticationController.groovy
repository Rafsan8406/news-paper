package newsp

import news.AuthenticationService
import news.Member
import org.grails.web.util.WebUtils

class AuthenticationController {

    AuthenticationService authenticationService
    def login(){

    }
    def doLogin(){

            if (authenticationService.doLogin(params.email, params.password)) {
                redirect(controller: "news", action: "index")
            } else {
               // flash.message = AppUtil.infoMessage("Email Address or Password not Valid.", false)
                redirect(controller: "authentication", action: "login")
            }

    }
    def logout() {
        //session.invalidate()
        WebUtils.retrieveGrailsWebRequest().session.invalidate()
        redirect(controller: "authentication", action: "login")

    }
}
