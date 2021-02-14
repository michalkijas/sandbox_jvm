package interview.patterns.decorator

import spock.lang.Specification

class GraphicPostcardTest extends Specification {

    def "should create Birthday postcard"() {
        given:
            BirthdayPostcard postcard = new BirthdayPostcard();
            Postcard sut = new CandleDecorator(new RibbonDecorator(new BalloonDecorator(postcard)))
        when:
            String result = sut.draw()
        then:
            result == "Birthday card with balloon with ribbon with candle"
    }


    def "should create Anniversary postcard"() {
        given:
            AnniversaryPostcard postcard = new AnniversaryPostcard();
            Postcard sut = new RibbonDecorator(new BalloonDecorator(postcard))
        when:
            String result = sut.draw()
        then:
            result == "Anniversary card with balloon with ribbon"
    }

}
