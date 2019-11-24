package rxjava2;

import io.reactivex.Flowable;
import io.reactivex.Single;
import org.junit.jupiter.api.Test;

class Test01 {

//        Flowable.fromIterable()
//        Flowable.fromArray()

    @Test
    void Flowable_just() {
        Flowable
                .just("1", "A", "!")
                .subscribe(this::print);
    }

    @Test
    void Flowable_range() {
        Flowable
                .range(1, 10)
                .subscribe(this::print);
    }

    @Test
    void Single_just() {
        Single
                .just("one item")
                .subscribe(this::print);
    }

    private void print(Object result) {
        System.out.println(result);
    }
}
