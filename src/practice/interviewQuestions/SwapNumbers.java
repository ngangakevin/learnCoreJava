package practice.interviewQuestions;

public class SwapNumbers {
    //changes value  of a and b without creating a new variable c
    public static void main(String[] args){
        int a = 5;
        int b = 11;
        b= b + a;
        a = b -a;
        b = b-a;
        System.out.println("b: "+ b + "\na: " + a);
    }
}
