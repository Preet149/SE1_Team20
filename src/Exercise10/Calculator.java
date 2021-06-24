package Exercise10;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    int total = 0;
    List<Integer> digits = new ArrayList<>();
    List<Character> operations = new ArrayList<>();
    int index = 0;


    public int calculation(char operand, int digit)throws IllegalArgumentException {

        index++;

        switch (operand) {

            case '+':
                total += digit;
                digits.add(digit);
                operations.add(operand);

                break;

            case '-':
                total -= digit;
                digits.add(digit);
                operations.add(operand);


                break;

            case '*':
                total *= digit;
                digits.add(digit);
                operations.add(operand);

                break;

            case '/':
                total /= digit;
                digits.add(digit);
                operations.add(operand);

                break;

            default: throw new IllegalArgumentException();

        };

        return total;


    }

    public int redo() {

        switch (operations.get(index)) {

            case '+':
                total += digits.get(index);
                break;


            case '-':
                total -= digits.get(index);
                break;


            case '/':
                total /= digits.get(index);
                break;


            case '*':
                total *= digits.get(index);
                break;
        }

        index++;

        return total;
    }

    public int undo() {

        index--;

        switch (operations.get(index)) {

            case '+':
                total -= digits.get(index);
                break;


            case '-':
                total += digits.get(index);
                break;


            case '/':
                total *= digits.get(index);
                break;


            case '*':
                total /= digits.get(index);
                break;
        }

        return total;
    }
}