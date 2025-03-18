package practice.interviewQuestions;

public class PyramidPattern {
    public static void printPattern1(int rows){
        for(int i = 1; i<= rows; i++){
            int numWhiteSpace = (rows - i);
            printString(" ", numWhiteSpace);
            printString(i + " ", i);
            System.out.println(" ");
        }
    }
    private static void printString(String s, int times){
        for(int j = 0; j< times; j++){
            System.out.print(s);
        }
    }

    public static void main(String[] args){
        printPattern1(9);
    }
}
