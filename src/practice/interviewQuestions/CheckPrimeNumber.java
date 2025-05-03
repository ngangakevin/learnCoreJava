package practice.interviewQuestions;

public class CheckPrimeNumber {

    public static boolean primeCheckOpt(int n){
        boolean result = n != 0 && n != 1;
        for(int i=2; i< Math.sqrt(n); i++){
            if(n%i == 0){
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean primeCheck(int n){
        boolean result = n !=0 && n !=1;
        for(int i=2; i< n/2; i++){
            if(n%i == 0){
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args){

        System.out.println(primeCheck(9));
        System.out.println(primeCheckOpt(19));
    }
}

// A number is a prime number if it is only divisible by itself and 1.