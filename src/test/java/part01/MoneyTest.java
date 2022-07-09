package part01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoneyTest {

    @Test
    void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertThat(10).isEqualTo(five.amount);
    }

}
