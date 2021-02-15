package interview.patterns.proxy;

class LazyBookProcessorProxy implements BookProcessor {

    private BookProcessor processor;


    @Override
    public String process() {
        if (processor == null) {
            processor = new HeavyBookProcessor();
        }
        return processor.process();
    }

}
