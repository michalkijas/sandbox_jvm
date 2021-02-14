package interview.patterns.proxy;

class HeavyBookProcessor implements BookProcessor {

    @Override
    public String process() {
        return "processing book for a long time";
    }

}
