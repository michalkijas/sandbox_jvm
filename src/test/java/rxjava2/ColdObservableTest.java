package rxjava2;

import io.reactivex.Observable;
import org.junit.jupiter.api.Test;

class ColdObservableTest {

    // obaj subskrybenci dostają te same wartości
    @Test
    void coldObservable() {
        Observable<Integer> observable = Observable.create(subscriber -> {
            print("Started emitting");

            print("Emitting 1st event");
            subscriber.onNext(1);

            print("Emitting 2nd event");
            subscriber.onNext(2);

            subscriber.onComplete();
        });

        print("Subscribing 1st subscriber");
        observable.subscribe(val -> print("First Subscriber received: " + val));

        print("=======================");

        print("Subscribing 2nd subscriber");
        observable.subscribe(val -> print("Second Subscriber received: " + val));
    }

    private void print(Object result) {
        System.out.println(result);
    }
}
