package practice.interviewQuestions;

public class ReverseString {

    public static void main (String[] args){
        String name = "Kevin";
        String reverse = new StringBuilder(name).reverse().toString();
//        String result = new String(reverse);
        System.out.println(reverse);
    }
}
