package CallingScanner;

import java.util.Scanner;

public  class CallingScanner
{
    /** считывает введённое пользователем число **/
    public double collingScannerNumbers()
    {
        Scanner scanner = new Scanner(System.in);
        Double number = scanner.nextDouble();
        return number;
    }
    /** считывает номер операции из меню **/
    public int collingScannerOperations()
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
}
