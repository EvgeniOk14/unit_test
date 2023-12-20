package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;
import org.example.CalculatorDiscount;

class CalculatorDiscountTest {

    @Test
    void calculatorDiscount()
    {
        /** использование библиотеки AssertJ для проверки на получение конкреного ожидаемого результата **/
        assertThat(CalculatorDiscount.calculatorDiscount(7, 2)).isEqualTo(5).isCloseTo(5, offset(0.0001));

        /** использование библиотеки Unit для проверки на получение конкретного результата **/
        assertEquals(3, CalculatorDiscount.calculatorDiscount(7,4), 0.0001);

        /** использование библиотеки AssertJ для проверки на то, что не будет выбрашенно исключение при валидных данных **/
        Assertions.assertDoesNotThrow(()-> CalculatorDiscount.calculatorDiscount(7, 0), String.valueOf(0.0001));

        /** проверка на отрицательное значение цены **/
        assertThrows(ArithmeticException.class, ()-> CalculatorDiscount.calculatorDiscount(-1, 5));

        /** проверка на то что будет выброшено исключение в случае есл скидка больше цены **/
        Assertions.assertThrowsExactly(ArithmeticException.class, ()-> CalculatorDiscount.calculatorDiscount(1, 5));
    }
}