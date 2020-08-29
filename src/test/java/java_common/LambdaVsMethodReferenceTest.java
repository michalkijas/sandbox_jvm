package java_common;


import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.function.IntSupplier;

/**
 * https://medium.com/pawel-urban-blog/pl-antypatterny-i-pu%C5%82apki-stream-optional-api-w-javie-e46974c307a4
 */
public class LambdaVsMethodReferenceTest {

    class DataWrapper {

        private List<String> data;

        public DataWrapper(List<String> data) {
            this.data = data;
        }

        public List<String> getData() {
            return data;
        }

        public void setData(List<String> data) {
            this.data = data;
        }

    }


    @Test
    public void methodReference() {
        DataWrapper data = new DataWrapper(List.of("Java"));

        /**
         * to co przed :: jest rozwiązywane w chwili definicji
         * data.getData() posiada referencję do oryginalnej kolekcji o rozmiarze 1
         */
        IntSupplier sizeSupplier = data.getData()::size;
        data.setData(List.of("Java", "Python"));

        Assert.assertEquals(data.getData().size(), sizeSupplier.getAsInt());
    }

    @Test
    public void lambda() {
        DataWrapper data = new DataWrapper(List.of("Java"));

        IntSupplier sizeSupplier = () -> data.getData().size();
        data.setData(List.of("Java", "Python"));

        Assert.assertEquals(data.getData().size(), sizeSupplier.getAsInt());
    }

}
