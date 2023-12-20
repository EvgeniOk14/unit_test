package Exceptions;

public class RaisingToDegreeException extends Exception
{
    public RaisingToDegreeException(String message)
    {
        super("степень должна быть положительной!");
    }
}
