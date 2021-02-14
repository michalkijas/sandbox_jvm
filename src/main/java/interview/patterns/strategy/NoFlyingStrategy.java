package interview.patterns.strategy;

class NoFlyingStrategy implements FlyingStrategy {

    @Override
    public String fly() {
        return "Can't fly sorry";
    }

}
