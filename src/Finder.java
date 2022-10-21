import java.io.IOException;

public class Finder {
    public int findGreatestCommonDivisor(int firstNumber, int secondNumber ) throws IOException{
        int buffer = 0;
        while(secondNumber != 0){
            buffer = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = buffer;
        }
        return firstNumber;
    }

}
