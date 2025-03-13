package practice.interviewQuestions;

public class FindFactorial {
    public static int loopFactorial(int num){
        int result = 1;
        while(num > 1){
            result = result * num;
            num --;
        }
        return result;
    }

    public static int recursive(int num){
        if(num == 1){
            return num;
        }if(num ==0){
            return 1;
        }
        return num * recursive(num-1);
    }

    public static void main(String[] args){
        System.out.println(recursive(12));
    }
}
