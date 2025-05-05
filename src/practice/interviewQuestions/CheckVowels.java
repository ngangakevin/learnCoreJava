package practice.interviewQuestions;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CheckVowels {
    public static boolean checkVowel(String str){
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for(int i=0; i<str.length(); i++){
            if(vowels.contains(str.toLowerCase().charAt(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
//        String testWord = "zxcvbnm";
//        boolean result = testWord.toLowerCase().matches(".*[aeiou]*.");
//        System.out.println(result);
        System.out.println(checkVowel("aeiou"));
    }
}
