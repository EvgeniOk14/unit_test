package Exceptions;

public class DivisionByNullException extends Exception
{
    public DivisionByNullException(String message) {
        super("деление на ноль запрещено!");
    }
}
