package apache_camel;

import org.apache.camel.Component;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.junit.jupiter.api.Test;

/**
 * https://camel.apache.org/components/latest/mail-component.html
 * https://github.com/apache/camel/blob/master/components/camel-mail/src/test/java/org/apache/camel/component/mail/MailRouteTest.java
 */
class ApacheCamelTest01 {

    @Test
    void test01() throws Exception {

        var context = new DefaultCamelContext();

        Component mailComponent = new org.apache.camel.component.mail.MailComponent();

        context.addComponent("pop3", mailComponent);
        context.addComponent("imap", mailComponent);
        context.addComponent("smtp", mailComponent);

        RouteBuilder routeBuilder = new RouteBuilder() {
            @Override
            public void configure() {
                from("imap://___login___:___password___@___domain___?unseen=true&delay=60000")
                        .process(exchange -> System.out.println("Email: " + exchange.getIn()));
            }
        };

        context.addRoutes(routeBuilder);

        context.start();

        Thread.sleep(10_000);
    }
}
