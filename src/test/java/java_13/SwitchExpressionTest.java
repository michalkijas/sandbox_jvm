package java_13;

import org.junit.jupiter.api.Test;

/**
 * https://slides.codefx.org/java-x/#/switch_expression
 */
class SwitchExpressionTest {

    @Test
    void switch_as_expression() {
        System.out.println("Result = " + switch_as_expression("TEST_1"));
        System.out.println("Result = " + switch_as_expression("TEST_2"));
        System.out.println("Result = " + switch_as_expression("TEST"));
    }

    /**
     * Switch as expression
     * https://slides.codefx.org/java-x/#/arrow_vs_colon
     */
    String switch_as_expression(String value) {
        return switch (value) {
            case "TEST_1":
                yield "was test 1";
            case "TEST_2":
                yield "was test 2";
            default:
                yield "ups";
        };
    }

    @Test
    void multiple_labels() {
        System.out.println("Result = " + multiple_labels("TEST_1"));
        System.out.println("Result = " + multiple_labels("TEST_2"));
        System.out.println("Result = " + multiple_labels("TEST_3"));
        System.out.println("Result = " + multiple_labels("TEST"));
    }

    String multiple_labels(String value) {
        return switch (value) {
            case "TEST_1", "TEST_2" -> "was test 1 or 2: " + value;
            case "TEST_3" -> "was test 3";
            default -> "ups";
        };
    }

    /**
     * Whether used as statement or expression,
     * the arrow form has no fall-through:
     */
    @Test
    void no_fall_through() {
        System.out.println("Result = " + no_fall_through("TEST_1"));
        System.out.println("Result = " + no_fall_through("TEST_2"));
        System.out.println("Result = " + no_fall_through("TEST"));
    }

    String no_fall_through(String value) {
        return switch (value) {
            case "TEST_1" -> "was test 1";
            case "TEST_2" -> "was test 2";
            default -> "ups";
        };
    }
}