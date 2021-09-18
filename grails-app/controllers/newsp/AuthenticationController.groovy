package newsp

import news.AuthenticationService
import news.Member
import news.MemberService
import org.grails.web.util.WebUtils

class AuthenticationController {

    AuthenticationService authenticationService
    MemberService memberService
    def index(){

    }
    def login(){
        if(authenticationService.authenticated){
            redirect(controller: "news", action: "index");
        }
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
        session.invalidate()
        //WebUtils.retrieveGrailsWebRequest().session.invalidate()
        redirect(controller: "authentication", action: "login")

    }
    def register(){

            [member: flash.redirectParams]

    }
    def doRegister(){
        def response = memberService.save(params)
        if (!response.isSuccess) {
            flash.redirectParams = response.model
            // flash.message = AppUtil.infoMessage(g.message(code: "unable.to.save"), false)
            redirect(controller: "authentication", action: "index")
        }else{
            // flash.message = AppUtil.infoMessage(g.message(code: "saved"))
            redirect(controller: "Authentication", action: "dologin")
        }
    }
}
