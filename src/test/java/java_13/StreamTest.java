package java_13;

import org.junit.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamTest {

    @Test
    public void takeWhile() {
        Stream.of("a-", "b-", "c-", "", "e-")
                .takeWhile(s -> !s.isEmpty())
                .forEach(System.out::print);
    }

    @Test
    public void dropWhile() {
        Stream.of("a-", "b-", "c-", "de-", "f-")
                .dropWhile(s -> s.length() <= 2)
                .forEach(System.out::print);
    }

    @Test
    public void teeingCollection() {
        Statistics stats = Stream
                .of(1, 2, 4, 5)
                .collect(teeing(
                        // Collector<Integer, ?, Integer>
                        summingInt(i -> i),
                        // Collector<Integer, ?, Double>
                        averagingInt(i -> i),
                        // BiFunction<Integer, Double, Statistics>
                        Statistics::of));
        System.out.println(stats);
    }

    static class Statistics {

        private Integer sum;
        private Double avg;

        public Statistics(Integer sum, Double avg) {
            this.sum = sum;
            this.avg = avg;
        }

        public static Statistics of(Integer sum, Double avg) {
            return new Statistics(sum, avg);
        }

        @Override
        public String toString() {
            return "Statistics{" +
                    "sum=" + sum +
                    ", avg=" + avg +
                    '}';
        }
    }
}
