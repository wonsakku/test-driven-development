package part01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoneyTest {

    @Test
    void testMultiplication(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(10).isEqualTo(product.amount);
        product = five.times(3);
        assertThat(15).isEqualTo(product.amount);
    }

}
