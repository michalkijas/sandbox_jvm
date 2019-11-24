package rxjava2;

import io.reactivex.Flowable;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

class SimpleOperatorsTest {

    @Test
    void delay() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        Flowable.range(0, 2)
                .doOnNext(item -> print("Emit=" + item))
                .delay(5, TimeUnit.SECONDS)
                .subscribe(
                        tick -> print("Tick=" + tick),
                        err -> print("Error=" + err),
                        () -> {
                            print("Complete");
                            latch.countDown();
                        }
                );

        latch.await();
    }


    // ???
    @Test
    void interval() {
        Flowable.interval(5, TimeUnit.SECONDS)
                .take(4)
                .subscribe(
                        item -> print("Item=" + item),
                        error -> print("Error=" + error),
                        () -> print("Complete")
                );
    }

    // foldLeft ???
    @Test
    void scan() {
        Flowable.just(3, 5, -2, 9)
                .scan(0, (totalSoFar, currentValue) -> {
                    print("TotalSoFar=" + totalSoFar + ", currentValue=" + currentValue);
                    return totalSoFar + currentValue;
                })
                .subscribe(this::print);
    }

    @Test
    void reduce() {
        Flowable.just(3, 5, -2, 9)
                .reduce(0, (totalSoFar, val) -> {
                    print("TotalSoFar=" + totalSoFar + ", emitted=" + val);
                    return totalSoFar + val;
                })
                .subscribe(this::print);
    }

    @Test
    void collect() {
        Flowable.just(3, 5, -2, 9)
                .collect(ArrayList::new, (container, value) -> {
                    print("Adding to container " + value);
                    container.add(value);
                    //notice we don't need to return anything
                })
                .subscribe(this::print);
    }

    @Test
    void defer() {
        // Wraper na kosztowną operację
        Flowable.defer(() -> Flowable.just("really blockingOperation()"))
                .subscribe(val -> print("Val " + val));
    }

    private void print(Object result) {
        System.out.println(result);
    }
}
