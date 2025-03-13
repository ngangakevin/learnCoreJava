package practice.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveWhitespace {
    public static void main(String[] args){
        String str = "1122 33";
        char[] characters = str.toCharArray();
        StringBuilder output = new StringBuilder();
        for(char ch: characters){
            if(!Character.isWhitespace(ch)){
                output.append(ch);
            }
        }
        System.out.println(output.toString());
    }
}
