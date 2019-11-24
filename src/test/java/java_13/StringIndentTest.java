package java_13;

import org.junit.jupiter.api.Test;

/**
 * https://slides.codefx.org/java-x/#/indentation
 * https://blog.codefx.org/java/text-blocks/
 * http://cr.openjdk.java.net/~jlaskey/Strings/TextBlocksGuide_v9.html
 */
class StringIndentTest {

    @Test
    void test0() {
        String text = """
            {
                greeting: "hello",
                audience: "text blocks",
            }
            """;
        print(text);
    }

    @Test
    void test1() {
        var text0 = """
        worker bees can leave
         even drones can fly away
          the queen is their slave""";
        print(text0);
        var text1 = """
                worker bees can leave
                 even drones can fly away
                  the queen is their slave
        """;
        print(text1);
        var text2 = """
                worker bees can leave
                 even drones can fly away
                  the queen is their slave
                """;
        print(text2);
        var text3 = """
                worker bees can leave
                 even drones can fly away
                  the queen is their slave
                        """;
        print(text3);
    }

    private void print(String text) {
        System.out.println("\n - - - - - - >");
        System.out.println(text);
        System.out.println("> - - - - - - \n");
    }
}