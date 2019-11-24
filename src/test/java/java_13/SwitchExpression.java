package java_13;

import org.junit.jupiter.api.Test;

/**
 * https://slides.codefx.org/java-x/#/switch_expression
 */
class SwitchExpression {

    @Test
    void switch1() {
        System.out.println("Result = " + run("TEST_1"));
        System.out.println("Result = " + run("TEST_2"));
        System.out.println("Result = " + run("TEST"));
    }

    String run(String value) {
        return switch (value) {
            case "TEST_1":
                yield "was test 1";
            case "TEST_2":
                yield "was test 2";
            default:
                yield "ups";
        };
    }
}