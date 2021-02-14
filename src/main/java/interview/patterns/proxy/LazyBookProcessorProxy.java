package interview.patterns.proxy;

/**
 * https://www.youtube.com/watch?v=NwaabHqPHeM
 */
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
