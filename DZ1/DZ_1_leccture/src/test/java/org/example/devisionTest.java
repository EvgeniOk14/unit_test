package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class devisionTest
{

    @Test
    void devisionByZeroUnit()
    {
        // Проверяем, что при делении на ноль выбрасывается ArithmeticException
        assertThrows(ArithmeticException.class, () ->
        {
            Devision.devisionByZero(4, 0);
        });
    }

        @Test
        void devisionByZeroAssert()
        {
            try
            {
                Devision.devisionByZero(4, 0);
                fail("Expected ArithmeticException was not thrown");
            }
            catch (ArithmeticException e)
            {
                // Expected behavior
            }
        }

    @Test
    void devisionByZeroAssertJ()
    {
        Assertions.assertThatThrownBy(() -> Devision.devisionByZero(4, 0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("На ноль делить нельзя! ");
    }
}


/** Сравнение:
 *             1) assertThrows из JUnit: Синтаксис выглядит лаконично и является стандартным для JUnit.
                                         Предоставляет некоторую стандартную функциональность для проверки исключений.

               2) С использованием assert: Менее выразительный синтаксис.
                                        Не предоставляет так много методов утверждений и возможностей для проверки,
                                        чем AssertJ.
                                        Использует try-catch блок для обработки исключения.

               3) С использованием AssertJ: Более выразительный и читаемый синтаксис.
                                            Предоставляет множество методов для удобной проверки различных условий.
                                            Не требует явного использования try-catch,
                                            так как встроен возвращаемый объект Assertions предоставляет методы
                                            для проверки исключений.

      Вывод:  Все три варианта выполнят свою задачу,
              и выбор между ними часто зависит от предпочтений команды разработки и стиля написания тестов.
             AssertJ предоставляет богатые возможности для проверки условий,
             что делает код более выразительным и поддерживаемым.
 **/