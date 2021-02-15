package interview.patterns.strategy;

class Duck {

    private final FlyingStrategy flying;
    private final QuackStrategy quack;


    Duck(FlyingStrategy flying, QuackStrategy quack) {
        this.flying = flying;
        this.quack = quack;
    }


    String fly() {
        return flying.fly();
    }

    String quack() {
        return quack.quack();
    }

}
