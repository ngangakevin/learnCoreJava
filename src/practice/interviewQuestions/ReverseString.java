package practice.interviewQuestions;

public class ReverseString {

    public static void main (String[] args){
        String name = "Kevin";
        StringBuilder reverse = new StringBuilder(name).reverse();
        String result = new String(reverse);
        System.out.println(result);
    }
}
