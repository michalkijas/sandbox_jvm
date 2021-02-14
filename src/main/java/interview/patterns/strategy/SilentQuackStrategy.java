package interview.patterns.strategy;

class SilentQuackStrategy implements QuackStrategy {

    @Override
    public String quack() {
        return "Can't quack :(";
    }

}
