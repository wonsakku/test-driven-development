package part01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoneyTest {

    @Test
    void testMultiplication(){
        Money five = Money.dollar(5);
        assertThat(Money.dollar(10)).isEqualTo(five.times(2));
        assertThat(Money.dollar(15)).isEqualTo(five.times(3));
    }

    @Test
    void testEquality(){
        assertThat(Money.dollar(5).equals(Money.dollar(5))).isTrue();
        assertThat(Money.dollar(5).equals(Money.dollar(6))).isFalse();
        assertThat(Money.franc(5).equals(Money.dollar(5))).isFalse();
    }

    @Test
    void testFrancMultiplication(){
        Money five = Money.franc(5);
        assertThat(Money.franc(10)).isEqualTo(five.times(2));
        assertThat(Money.franc(15)).isEqualTo(five.times(3));
    }


    @Test
    void testCurrency(){
        assertThat("USD").isEqualTo(Money.dollar(1).currency());
        assertThat("CHF").isEqualTo(Money.franc(1).currency());
    }


    @Test
    void testSimpleAddition(){
//        Money sum = Money.dollar(5).plus(Money.dollar(5));
//        assertThat(Money.dollar(10).equals(sum)).isTrue();
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertThat(Money.dollar(10)).isEqualTo(reduced);
    }



}





















