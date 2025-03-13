package practice.interviewQuestions;
//TODO: practice recursion and the fibonacci sequence. Concept seems to be fuzzy.
public class FibonacciRecursion {
//    Will return the count'th fibonacci term
    public static int recursiveFib(int count){
        if(count == 0){
            return 0;
        }else if(count ==1){
            return 1;
        }
        return recursiveFib(count -1) + recursiveFib(count-2);
    }

    public static void main(String[] args){
        System.out.println(recursiveFib(7));
    }
}
