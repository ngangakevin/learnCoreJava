package practice.interviewQuestions;

public class LeadingTrailingWhitespace {
    public static String trimWhitespace(String str){
        return str.strip();
    }
    public static void main(String[] args){
        String str = " wertyu ";
        System.out.println(str);
        System.out.println(trimWhitespace(str));
    }
}
