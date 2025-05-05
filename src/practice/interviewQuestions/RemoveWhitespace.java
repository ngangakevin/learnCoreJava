package practice.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveWhitespace {
    public static String removeFromString(String str){
        StringBuilder result = new StringBuilder();
        for(int i=0; i< str.length(); i++){
            if(!Character.isWhitespace(str.charAt(i))){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        String str = "1122 333";
//        char[] characters = str.toCharArray();
//        StringBuilder output = new StringBuilder();
//        for(char ch: characters){
//            if(!Character.isWhitespace(ch)){
//                output.append(ch);
//            }
//        }
        System.out.println(removeFromString(str));


    }
}
