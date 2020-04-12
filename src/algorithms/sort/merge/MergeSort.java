package algorithms.sort.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    static ArrayList<Integer> sort(ArrayList<Integer> list){
        if(list.isEmpty())
            return list;
        return mergeSort(list, 0, list.size());
    }

    static ArrayList<Integer> mergeSort(ArrayList<Integer> list, int from, int to){
        ArrayList<Integer> sorted = new ArrayList<>();
        if(from+1==to){
            sorted.add(list.get(from));
        }else{
            int splitPoint = (to-from)/2+(to-from)%2+from;
            ArrayList<Integer> sortedA = mergeSort(list, from, splitPoint);
            ArrayList<Integer> sortedB = mergeSort(list, splitPoint, to);
            int i=0, j=0;
            while(i<sortedA.size() && j<sortedB.size()){
                if(sortedA.get(i)<sortedB.get(j)){
                    sorted.add(sortedA.get(i++));
                }else{
                    sorted.add(sortedB.get(j++));
                }
            }
            while(i<sortedA.size())
                sorted.add(sortedA.get(i++));
            while(j<sortedB.size())
                sorted.add(sortedB.get(j++));
        }
        return sorted;
    }

     public static void testMergeSort(List<Integer> list){
        ArrayList<Integer> listToSort = new ArrayList<>();
        for(int each:list)
            listToSort.add(each);
        System.out.println("Initial List:"+listToSort);
        System.out.println("Sorted List: "+sort(listToSort));
        System.out.println();
    }

    public static void main(String[] args) {
        testMergeSort(Arrays.asList(6,5,3,4,1,2,19,-5,-7,54,-1,1,2,19)); //even list
        testMergeSort(Arrays.asList(6,5,3,4,1,2,19,-5,-7,54,-100,13,27)); //odd list
        testMergeSort(Arrays.asList(6)); //one item
        testMergeSort(Arrays.asList(6, 2)); //two items
        testMergeSort(Arrays.asList(6, 2, 7)); //three items
        testMergeSort(new ArrayList<Integer>()); //empty list
    }
}
