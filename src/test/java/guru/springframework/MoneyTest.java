package guru.springframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void testMultiplicationDollar(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assertions.assertEquals(new Dollar(10),  product);
        product = five.times(3);
        Assertions.assertEquals(new Dollar(15), product);
    }

    @Test
    void testEqualityDollar(){
        Assertions.assertEquals(new Dollar(5), new Dollar(5));
        Assertions.assertNotEquals(new Dollar(5), new Dollar(8));
    }

    @Test
    void testMultiplicationFranc(){
        Franc five = new Franc(5);
        Franc product = five.times(2);
        Assertions.assertEquals(new Franc(10),  product);
        product = five.times(3);
        Assertions.assertEquals(new Franc(15), product);
    }

    @Test
    void testEqualityFranc(){
        Assertions.assertEquals(new Franc(5), new Franc(5));
    }
}
