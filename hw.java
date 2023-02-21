import java.util.ArrayList;
import java.sql.Array;

//1.Реализовать алгоритм сортировки слиянием

import java.util.*;
public class hw {
    
public static void main(String[] args) {  
   int[] num = {9,5,2,3,1,10,4};
   for (int value : mergeSort(num)) {
    System.out.println(value);
   }
}

public static int[] mergeSort(int[] src) {
    if (src.length <= 1) return src;
    int[] left = Arrays.copyOfRange(src, 0, src.length / 2);
    int[] right = Arrays.copyOfRange(src, left.length, src.length);
    return merge(mergeSort(left), mergeSort(right));
   
}

private static int[] merge(int[] left, int[] right) {
    int resIn = 0, leftIn = 0, rightIn = 0;
    int[] result = new int[left.length + right.length];

    while (leftIn < left.length && rightIn < right.length)
        if (left[leftIn] < right[rightIn])
            result[resIn++] = left[leftIn++];
        else result[resIn++] = right[rightIn++];

    while (resIn < result.length)
        if (leftIn != left.length)
            result[resIn++] = left[leftIn++];
        else result[resIn++] = right[rightIn++];

    return  result;
}

}