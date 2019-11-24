package rxjava2;

import io.reactivex.Flowable;
import org.junit.jupiter.api.Test;

class NestedStreams01 {

    @Test
    void nestedStreams() {
        Flowable.range(0, 10)
                .parallel()
                .map(item -> "Connecting to id=" + item)
                .doOnNext(item -> System.out.println(item))
        ;
    }
}
