package practice.DynamicPrograming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class NthFibonacci {
    private List<Integer> results = new ArrayList<Integer>();
    public int fibRecurssion(int nthTerm){
        //To find the next term, use the sum of the previous 2.
        //using nthTerm-1 and nthTerm will always return the n-1th term
        if(nthTerm <=2){
            results.set(nthTerm, 1);
        }else{
            if(results.get(nthTerm) == null){
                results.set(nthTerm, fibRecurssion(nthTerm-1) + fibRecurssion(nthTerm-2));
            }else{
                return results.get(nthTerm);
            }
        }
        return results.get(nthTerm);
    }

    public int bottomUpFib(int nthTerm){
        if(nthTerm <= 2) return 1;
        int a = 1, b= 1, fib=0;
        for(int i=3; i < nthTerm; i++){
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
}
