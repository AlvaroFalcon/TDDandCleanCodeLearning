package OrderStringKata;

public class OrderString {
    public static String order(String inputString) {
        if (inputString.equals("")) return "";
        return processString(divideStringBySpaces(inputString));
    }

    private static String[] divideStringBySpaces(String inputString) {
        return inputString.split(" ");
    }

    private static String processString(String[] inputString) {
        String[] outputString = new String[inputString.length];
        for (int wordPosition = 0; wordPosition < inputString.length; wordPosition++) {
            outputString = setWord(inputString[wordPosition], outputString);
        }
        return concatString(outputString);
    }

    private static String[] setWord(String word, String[] outputString) {
        for (int position = 0; position < word.length(); position++) {
            if (isANumber(word.charAt(position))) {
                outputString = setWordInOrder(outputString, word, word.charAt(position));
            }
        }
        return outputString;
    }

    private static String[] setWordInOrder(String[] outputString, String word, char character) {
        outputString[characterToPosition(character)-1] = word;
        return outputString;
    }

    private static int characterToPosition(char character) {
        return Integer.parseInt(character + "");
    }

    private static boolean isANumber(char character) {
        return "0123456789".contains(character + "");
    }

    private static String concatString(String[] outputString) {
        String finalOutput = "";
        for (int position = 0; position < outputString.length; position++) {
            finalOutput += outputString[position] + " ";
        }
        return finalOutput.trim();
    }
}
