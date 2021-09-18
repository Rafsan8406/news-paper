package newsp


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(MemberInterceptor)
class MemberInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test member interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"member")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
