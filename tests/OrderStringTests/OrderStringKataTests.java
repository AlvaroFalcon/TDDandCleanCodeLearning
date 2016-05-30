package OrderStringTests;

import OrderStringKata.OrderString;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class OrderStringKataTests {
    @Test
    public void when_the_string_is_is2_Thi1s_T4est_3a_should_return_thi1s_is2_3a_T4st() {
        assertThat(OrderString.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
    }

    @Test
    public void should_return_Fo1r_the2_g3ood_4of_th5e_pe6ple() {
        assertThat(OrderString.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
    }

    @Test
    public void empty_emput_should_return_empty_string() {
        assertThat(OrderString.order(""), equalTo(""));
    }
}
