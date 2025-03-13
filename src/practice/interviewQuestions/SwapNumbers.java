package practice.interviewQuestions;

public class SwapNumbers {
    public static void main(String[] args){
        int a = 5;
        int b = 11;
        b= b + a;
        a = b -a;
        b = b-a;
        System.out.println("b: "+ b + "\na: " + a);
    }
}
