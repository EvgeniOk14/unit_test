package Test;

import OperationsWithNumbers.DevisionOperation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import Exceptions.DivisionByNullException;
import OperationsWithNumbers.abstractClasses.AbstractDevisionOperation;

import java.util.ArrayList;
import java.util.List;

class AbstractDevisionOperationTest
{

    @Test
    void interfaceDevisionOperation() throws DivisionByNullException {
        List<String> list =  new ArrayList<>();
        AbstractDevisionOperation abstractDevisionOperation =  new DevisionOperation();

        assertThatCode(() -> abstractDevisionOperation.interfaceDevisionOperation(5, 0, list)).isInstanceOf(DivisionByNullException.class).hasMessage("деление на ноль запрещено!");

        assertThatCode(() -> abstractDevisionOperation.interfaceDevisionOperation(4, 2, list)).doesNotThrowAnyException();

    }
}