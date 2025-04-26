package practice.DynamicPrograming;

// The least amount of string operations that would be needed to convert str1 to str2;
public class MinStrOperations {
    private int minFunction(int insert, int delete, int update){
        return Integer.min(insert, Integer.min(delete, update));
    }

    public static int editDistance(String str1, String str2, int N, int M){
//        Need to use stringBuilder because Java.
        char[] listStr1 = str1.toCharArray();
        char[] listStr2 = str2.toCharArray();
//        if str1 is empty, then insert all characters of str2
        if(N==0){
            return M;
        }

        if(M==0){
            return M;
        }
//        if last characters are same, simply ignore
        if(listStr1[N-1] == listStr2[M-1]){
            return editDistance(str1, str2, N-1, M-1);
        }

        return 1+ Math.min(editDistance(str1, str2, N, M-1),
                Math.min(editDistance(str1, str2, N-1, M), editDistance(str1, str2, N-1, M-1)));
    }

    public static int bottomUp(String str1, String str2){
        int[][] minDistance = new int[str1.length() + 1][str2.length() +1];
        char[] listStr1 = str1.toCharArray();
        char[] listStr2 = str2.toCharArray();
        for(int i=0; i<= str1.length(); i++){
            for(int j=0; j<= str2.length(); j++){
                if(i==0){
                    minDistance[i][j]=j;
                } else if (j==0) {
                    minDistance[i][j]=i;
                } else if (listStr1[i-1] == listStr2[j-1]) {
                    minDistance[i][j] = minDistance[i-1][j-1];
                }else{
                    minDistance[i][j] = 1 + Integer.min(minDistance[i][j-1],
                            Integer.min(minDistance[i-1][j], minDistance[i-1][j-1]));
                }
            }
        }
        return minDistance[str1.length()][str2.length()];
    }
    public static void main(String[] args){
        String str1 = "Sunday";
        String str2 = "Saturday";
//        System.out.println(editDistance(str1, str2, str1.length(), str2.length()));
        System.out.println(bottomUp(str1, str2));


    }
}
