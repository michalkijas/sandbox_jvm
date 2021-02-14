package interview.patterns.strategy;

class NormalQuackStrategy implements QuackStrategy {

    @Override
    public String quack() {
        return "Quack, quack";
    }

}
