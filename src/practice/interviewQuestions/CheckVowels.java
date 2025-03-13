package practice.interviewQuestions;

public class CheckVowels {
    public static void main(String[] args){
        String testWord = "zxcvbnm";
        boolean result = testWord.toLowerCase().matches(".*[aeiou]*.");
        System.out.println(result);
    }
}
