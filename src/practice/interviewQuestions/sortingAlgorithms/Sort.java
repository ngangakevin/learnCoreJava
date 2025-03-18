package practice.interviewQuestions.sortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Sort <T extends Comparable<T>> {
    public List<T> mergeTwoLists(List<T> first, List<T> second){
        int i = 0; int j = 0; int k=0;
        List<T> result = new ArrayList<>();
        while(i< first.size() && j< second.size()){
            if(first.get(i).compareTo(second.get(j)) < 0){
                result.add(k, first.get(i));
                k++;
                i++;
            }else{
                result.add(k, second.get(j));
                k++;
                j++;
            }
        }
        // Back-fill
        if(i < first.size()){
            while(i<first.size()){
                result.add(k, first.get(i));
                k++;
                i++;
            }
        }

        if(j < second.size()){
            while(j < second.size()){
                result.add(k,second.get(j));
                k++;
                j++;
            }
        }
        return result;
    }

    public List<T> mergeSort(List<T> list){
        int start = 0;
        int stop = list.size() -1;
        return mergeSort(list, start, stop);
    }

    private List<T> mergeSort(List<T> list, int start, int stop){
        if(start == stop){
            List<T> result = new ArrayList<>();
            result.add(list.get(start));
            return result;
        }else{
            int mid = start + (stop - start)/2;
            List<T> first = mergeSort(list, start, mid);
            List<T> second = mergeSort(list, mid +1, stop);
            return mergeTwoLists(first, second);
        }
    }
}
