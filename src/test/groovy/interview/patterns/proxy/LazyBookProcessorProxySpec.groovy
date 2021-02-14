package interview.patterns.proxy

import spock.lang.Specification

class LazyBookProcessorProxySpec extends Specification {

    def "should use proxy to run heavy method"() {
        given:
            BookProcessor sut = new LazyBookProcessorProxy()
        expect:
            sut.process() == "processing book for a long time"
    }

}
