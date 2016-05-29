package SquareEveryDigitKata;

public class SquareDigit {
    public int squareDigits(int inputValue) {
        String input = Integer.toString(inputValue);
        return Integer.parseInt(processSquare(input));
    }

    private String processSquare(String input) {
        String output = "";
        for (int position = 0; position < input.length(); position++) {
            output += squareNumber(getNumber(input, position));
        }
        return output;
    }

    private int getNumber(String input, int position) {
        return Integer.parseInt(String.valueOf(input.charAt(position)));
    }

    private int squareNumber(int number) {
        return (int) Math.pow(number,2);
    }
}
