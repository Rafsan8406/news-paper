package newsp


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(NewsInterceptor)
class NewsInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test news interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"news")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
