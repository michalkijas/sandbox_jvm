package interview;

import org.junit.Test;

/**
 * https://stormit.pl/fizzbuzz/
 * https://github.com/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition
 */
public class FizzBuzzTest {

    @Test
    public void v1() {
        for (int interaction = 1; interaction <= 100; interaction++) {
            if (interaction % 3 == 0) {
                if (interaction % 5 == 0) {
                    System.out.println("FizzBuzz: " + interaction);
                } else {
                    System.out.println("Fizz: " + interaction);
                }
            } else if (interaction % 5 == 0) {
                System.out.println("Buzz: " + interaction);
            } else {
                System.out.println(interaction);
            }
        }
    }

    @Test
    public void v2() {
        for (int interaction = 1; interaction <= 100; interaction++) {
            if (interaction % 15 == 0) {
                System.out.println("FizzBuzz: " + interaction);
            } else if (interaction % 3 == 0) {
                System.out.println("Fizz: " + interaction);
            } else if (interaction % 5 == 0) {
                System.out.println("Buzz: " + interaction);
            } else {
                System.out.println(interaction);
            }
        }
    }

}
