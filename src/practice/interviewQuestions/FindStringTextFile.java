package practice.interviewQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindStringTextFile {
    public static boolean findStringInFile(String filePath, String str) throws FileNotFoundException{

        try {
            File file = new File(filePath);
            Scanner scanner= new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.contains(str)){
                    scanner.close();
                    return true;
                }
            }
            scanner.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public static void main(String[] args){
        boolean result;
        try{
            result = findStringInFile("/Users/ngangakingori/IdeaProjects/LearnCoreJava/resources/test.txt",
                    "12323232");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(result);
    }
}
