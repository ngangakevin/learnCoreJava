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

    public static int dynamicFib(int count){
        if(count <=2){
            return 1;
        }
        int firstTerm = 0;
        int secondTerm = 1;
        int fib = 1;
        for(int i = 1; i<= count; i++){
            System.out.println(firstTerm);
            fib = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = fib;
        }

        return fib;
    }

    public static void main(String[] args){
        dynamicFib(7);
        System.out.println(dynamicFib(7));
    }
}
