package no.nerdschool.uglycode;


public class Hltchk {

    public static int skipper = 1;

    public static String ERROR_MESSAGE_DIVIDE_BY_ZERO = "can't divide by zero";

    /**
     * read math expression in string format and return int result
     *
     * @param input String
     * @return int
     */
    public static int parseExpression(String input) {
        //first term
        int endIndexTerm1 = 1 + input.indexOf(' ') - skipper;
        int term1 = Integer.parseInt(input.substring(0, endIndexTerm1));
        //second term
        int beginIndexTerm2 = input.indexOf(' ', 1 + input.indexOf(' '))
                + skipper;
        int endIndexTerm2 = input.length();
        int term2 = Integer.parseInt(input.substring(beginIndexTerm2, endIndexTerm2));
        // operator
        int beginIndex = skipper + input.indexOf(' ');
        int endIndex = input.indexOf(' ', input.indexOf(' ') + 1);
        String mathOperator = input.substring(beginIndex, endIndex);

        switch (mathOperator) {
            case "+":
                return term1 + term2;
            case "-":
                return term1 - term2;
            case "*":
                return term1 * term2;
            case "/":
                if (term2 != 0) {
                    return term1 / term2;
                } else {
                    throw new RuntimeException(ERROR_MESSAGE_DIVIDE_BY_ZERO);
                }
            default:
                return 0;
        }


    }


}
