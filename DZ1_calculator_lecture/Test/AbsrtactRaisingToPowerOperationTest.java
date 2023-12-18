package Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import Exceptions.RaisingToDegreeException;
import OperationsWithNumbers.abstractClasses.AbsrtactRaisingToPowerOperation;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class AbsrtactRaisingToPowerOperationTest
{
    @Test
    void interfaceRasingToPawer_withAssert()
    {
        List<String> mockList = new ArrayList<>();
        /** проверка о вызов метода не приводит к выбросу исключения **/
        assertThatCode(() -> {
            new AbsrtactRaisingToPowerOperation().interfaceRasingToPawer(2.0, 3.0, mockList);
        }).doesNotThrowAnyException();


        /** Проверяем на пограничных значениях: для нулевых значений **/
        assertThatCode(() -> {
            new AbsrtactRaisingToPowerOperation().interfaceRasingToPawer(0.0, 0.0, mockList);
        }).doesNotThrowAnyException();

        /** Проверяем на пограничных значениях: для отрицательный значений **/
        assertThatCode(() -> {
            new AbsrtactRaisingToPowerOperation().interfaceRasingToPawer(2.0, -1.0, mockList);
        }).isInstanceOf(RaisingToDegreeException.class).hasMessage("степень должна быть положительной!");

        /** Проверяем на пограничных значениях: для больших значений степени **/
        assertThatCode(() -> {
            new AbsrtactRaisingToPowerOperation().interfaceRasingToPawer(5.0, 100.0, mockList);
        }).doesNotThrowAnyException();
    }
}
                // второй вариант проверки на то, что исключение не будет выброшено в случае работы метода  interfaceRasingToPawer
               // assertDoesNotThrow(() ->{new AbsrtactRaisingToPowerOperation().interfaceRasingToPawer(2.0, 3.0, mockList);});

             //  второй вариант проверки на возведение в отрицательную степень:
            //  try
           //      {
          //           new AbsrtactRaisingToPowerOperation().interfaceRasingToPawer(2.0, -1.0, mockList);
         //        }
        //          catch (RaisingToDegreeException e)
       //          {
      //                System.err.println("Ошибка: " + e.getMessage());
     //                 assertThat(e).isInstanceOf(RaisingToDegreeException.class).hasMessage("степень должна быть положительной!");
    //             }
