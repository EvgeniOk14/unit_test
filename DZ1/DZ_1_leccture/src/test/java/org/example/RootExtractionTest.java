package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.offset; // импортируем offset
import static org.assertj.core.api.Assertions.assertThat; // Импортируем assertThat из AssertJ


class RootExtractionTest
{
    /** использование метода assert **/
    @Test
    void sqrtOfNumber1()
    {

        // Пограничный случай: извлечение корня из 0 должно быть равно 0
        assertEquals(0, RootExtraction.sqrtOfNumber(0), 0.0001);

        // Пограничный случай: извлечение корня из 1 должно быть равно 1
        assertEquals(1, RootExtraction.sqrtOfNumber(1), 0.0001);

        // Тест с положительным числом
        assertEquals(2, RootExtraction.sqrtOfNumber(4), 0.0001);

        // Тест с отрицательным числом, ожидаем исключение
        assertThrows(IllegalArgumentException.class, () -> {
            RootExtraction.sqrtOfNumber(-1);
        });
    }

    /** использование метода assertj **/
    @Test
    void sqrtOfNumber2() {
        // Пограничный случай: извлечение корня из 0 должно быть равно 0
        assertThat(RootExtraction.sqrtOfNumber(0)).isEqualTo(0).isCloseTo(0, offset(0.0001));

        // Пограничный случай: извлечение корня из 1 должно быть равно 1
        assertThat(RootExtraction.sqrtOfNumber(1)).isEqualTo(1).isCloseTo(1, offset(0.0001));

        // Тест с положительным числом
        assertThat(RootExtraction.sqrtOfNumber(4)).isEqualTo(2).isCloseTo(2, offset(0.0001));

        // Тест с отрицательным числом, ожидаем исключение
        assertThatThrownBy(() -> RootExtraction.sqrtOfNumber(-1))
                .isInstanceOf(IllegalArgumentException.class);
    }
}