package reactor;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.util.concurrent.TimeoutException;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

class ReactorTest {

    @Test
    void test() {
        StepVerifier
                .withVirtualTime(() ->
                        Flux
                                .never()
                                .timeout(ofMillis(100))
                )
                .expectSubscription()
                .expectNoEvent(ofMillis(99))
                .thenAwait(ofMillis(1))
                .expectError(TimeoutException.class)
                .verify(ofSeconds(1));
    }
}
