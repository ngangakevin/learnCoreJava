package practice.twoPointers;

public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        //"A man, a plan, a canal: Panamam
        StringBuilder res = new StringBuilder();
        for(int j=0; j< s.length(); j++){
            if(Character.isAlphabetic(s.charAt(j))){
                res.append(Character.toLowerCase(s.charAt(j)));
            }
        }
        System.out.println(res);
        int k = res.length()-1;
        for(int i=0; i<res.length()/2; i++){
            if(res.charAt(i) != res.charAt(k)){
                return false;
            }
            k--;
        }

        return true;
    }

    public static boolean isPalindromeOpt(String s){
        int i=0;
        int j= s.length()-1;

        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))) i++;
            if(!Character.isLetterOrDigit(s.charAt(j))) j--;
            if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j))){
                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args){
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindromeOpt("0p"));
    }
}
