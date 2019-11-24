package rxjava2;

import io.reactivex.Flowable;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

class MergingStreamsTest {


    @Test
    void zip() {
//		Single<Boolean> isUserBlockedStream =
//				  Single.fromFuture(CompletableFuture.supplyAsync(() -> {
////					  Helpers.sleepMillis(200);
//					  return Boolean.FALSE;
//				  }));
//
//		Single<Integer> userCreditScoreStream =
//				  Single.fromFuture(CompletableFuture.supplyAsync(() -> {
////					  Helpers.sleepMillis(2300);
//					  return 5;
//				  }));
//
//		Single<Pair<Boolean, Integer>> userCheckStream = Single.zip(isUserBlockedStream, userCreditScoreStream,
//				  (blocked, creditScore) -> new Pair<Boolean, Integer>(blocked, creditScore));
//
//		userCheckStream.subscribe(pair -> log.info("Received " + pair));
    }

    @Test
    void zip2() {
        // slowdown stream
        Flowable<String> colors = Flowable.just("red", "green", "blue");
        Flowable<Long> timer = Flowable.interval(2, TimeUnit.SECONDS);

        Flowable<String> periodicEmitter = Flowable.zip(colors, timer, (key, val) -> key);

        periodicEmitter.subscribe(this::print);
    }


    @Test
    void merge() {
        Flowable<Integer> numbers = Flowable.just(1, 2, 3, 4, 5);
        Flowable<String> colors = Flowable.just("red", "green", "blue");

        Flowable.merge(colors, numbers)
                .subscribe(this::print);
    }

    @Test
    void concat() {
        Flowable<Integer> numbers = Flowable.just(1, 2, 3, 4, 5);
        Flowable<String> colors = Flowable.just("red", "green", "blue");

        Flowable.concat(numbers, colors)
                .subscribe(this::print);
    }

    private void print(Object result) {
        System.out.println(result);
    }
}
