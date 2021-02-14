package interview.patterns.strategy

import spock.lang.Specification

class DuckTest extends Specification {

    def "should create rubber duck"() {
        given:
           Duck sut = new Duck(new NoFlyingStrategy(), new SilentQuackStrategy())
        expect:
            sut.fly() == "Can't fly sorry"
            sut.quack() == "Can't quack :("
    }


    def "should create cloud duck"() {
        given:
            Duck sut = new Duck(new JetFlyingStrategy(), new NormalQuackStrategy())
        expect:
            sut.fly() == "Fly with engine"
            sut.quack() == "Quack, quack"
    }

}
