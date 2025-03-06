package dataTypes;

public class HarmonicSum {

    static float leftToRightHarmonic(){
        int lowerBound = 1;
        int upperBound = 50000;
        float LTRHarmonic = 1.0f;
        for(int i=lowerBound; i <=upperBound; i++){
            LTRHarmonic += 1/i;
            lowerBound = i;
        }
        return LTRHarmonic;
    }
    static float rightToLeftHarmonic(){
        int lowerBound = 1;
        int upperBound = 50000;
        float RTLHarmonic = 1.0f;
        for (int i=upperBound; i>=lowerBound; --i){
            RTLHarmonic += 1/i;
            upperBound = i;
        }
        return RTLHarmonic;
    }
    public static void main(String args[]) {
        float RTLHarmonic = rightToLeftHarmonic();
        float LTRHarmonic = leftToRightHarmonic();
        if (RTLHarmonic > LTRHarmonic)
            System.out.println(RTLHarmonic - LTRHarmonic);
        else
            System.out.println(LTRHarmonic - RTLHarmonic);
    }
    }
