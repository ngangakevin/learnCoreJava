package practice.interviewQuestions;

public class CheckPrimeNumber {
    public static void main(String[] args){
        int n = 12;
        boolean result = true;
        if(n == 0 || n==1){
            result = false;
        }
        for(int i=2; i<=n/2; i++){
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
