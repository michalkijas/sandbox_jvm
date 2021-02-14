package interview.patterns.strategy;

class JetFlyingStrategy implements FlyingStrategy {

    @Override
    public String fly() {
        return "Fly with engine";
    }

}
