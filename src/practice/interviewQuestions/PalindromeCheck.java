package practice.interviewQuestions;

public class PalindromeCheck {
    public static boolean isPalindrome(String str){
        String reverse = new StringBuffer(str).reverse().toString();
        return reverse.equals(str);
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("llnnl"));
    }
}
