package practice.interviewQuestions;

public class PalindromeCheck {
    public static boolean isPalindrome(String str){
        String reverse = new StringBuffer(str).reverse().toString();
        return reverse.equals(str);
    }

    public static boolean isAPalindrome(String str){
        char [] strArray= str.toCharArray();
        int j = strArray.length-1;
        for(int i = 0; i < str.length(); i++){
            if(strArray[i] != strArray[j]){
                return false;
            }
            j--;
        }
        return true;
    }

    public static boolean isAPalindromeOptimized(String str){
        int j = str.length()-1;
        int i = 0;
        while(i <j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("abcdba"));
        System.out.println(isAPalindrome("abcdba"));
        System.out.println(isAPalindromeOptimized("abscsba"));
    }
}
