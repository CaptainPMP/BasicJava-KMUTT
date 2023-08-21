public class StringsTest {
    public static void main(String[] args) {
        String questions = "Sabay Dee Mai?";
        String answer = "Sabay Dee Kha!";

        int k = questions.length();
        System.out.println("Total length of questions = " + k);

        String upQuestions = questions.toUpperCase();
        String lowQuestions = questions.toLowerCase();
        System.out.println("Uppercase of question = " + upQuestions);
        System.out.println("Lowercase of question = " + lowQuestions);

        int index_a = questions.indexOf('a');
        System.out.println("index of a = " + index_a);

        String combines = questions.concat(answer);
        System.out.println("Concatenate strings = " + combines);

        String example1 = "\'a\' is a char.";
        String example2 = "Are you hungry? \nYes, I am.";
        System.out.println("Add quotes in string : " + example1);
        System.out.println("Add enter in string : " + example2);

    }
}
