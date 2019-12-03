package java_13;

import org.junit.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    public void optionalOr() {
        returnEmpty()
                .or(this::returnEmpty)
                .or(this::returnEmpty)
                .or(this::returnEmpty)
                .or(this::returnValue)
                .ifPresent(value -> System.out.println("Value: " + value));
    }

    private Optional<String> returnEmpty() {
        return Optional.empty();
    }

    private Optional<String> returnValue() {
        return Optional.of("New Value");
    }
}