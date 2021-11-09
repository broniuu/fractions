import java.io.IOException;

public class Finder {
    public int findGreatestCommonDivisor(int firstNumber, int secondNumber ) throws IOException{
        if (firstNumber == 0) {
            throw new ArithmeticException(); //wyjątek nirkontrolowany
        }
        if (secondNumber == 0) {
            throw new IOException(); // wyjątek kontrolowany
        }
        int buffer = 0;
        while(secondNumber != 0){
            buffer = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = buffer;
        }
        return firstNumber;
    }

}
