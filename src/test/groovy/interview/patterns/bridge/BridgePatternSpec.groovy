package interview.patterns.bridge

import spock.lang.Specification

/**
 * https://www.youtube.com/watch?v=F1YQ7YRjttI
 */
class BridgePatternSpec extends Specification {

    def "should create book long view"() {
        given:
            View sut = new LongView(new BookResource())
        expect:
            sut.show() == "Long view: Book title"
    }

    def "should create book short view"() {
        given:
            View sut = new ShortView(new BookResource())
        expect:
            sut.show() == "Short view: Book title"
    }

    def "should create Song long view"() {
        given:
            View sut = new LongView(new SongResource())
        expect:
            sut.show() == "Long view: Song title"
    }

    def "should create song short view"() {
        given:
            View sut = new ShortView(new SongResource())
        expect:
            sut.show() == "Short view: Song title"
    }

}
