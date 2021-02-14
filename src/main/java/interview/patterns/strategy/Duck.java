package interview.patterns.strategy;

/**
 * https://www.youtube.com/watch?v=v9ejT8FO-7I
 */
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
