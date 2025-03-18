package practice.interviewQuestions;

public class SecondLargest {

//    expensive memory and time complexities
    public static void expensiveSecondLargest(){
        int largest = Integer.MIN_VALUE;
        int[] list = {1,2,3,4,56,7};
        int i = 0;
        while(i < 2){
            //find first largest number, then remove from the list.
            //repeat process twice to get the second largest.
            largest = Integer.MIN_VALUE;
            for(int j: list){
                largest = Integer.max(largest, j);
            }
            for(int k=0; k<list.length; k++){
                if(list[k] == largest){
                    list[k] = Integer.MIN_VALUE;
                }
            }
            i++;
        }
        System.out.println(largest);
    }

    public static void efficientSecondLargest(){
        int[] list = {1,2,3,4,56,7};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i: list){
            if(i > largest){
                largest = i;
            }else if(i >secondLargest){
                secondLargest = i;
            }
        }
        System.out.println(secondLargest);
    }
    public static void main(String[] args){
        efficientSecondLargest();
    }
}
