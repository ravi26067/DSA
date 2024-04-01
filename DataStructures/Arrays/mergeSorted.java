import java.util.*;

class CheckMergeArray {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int resSize = arr1.length + arr2.length;
        int[] result = new int[resSize];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]){
                result[k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }
        if (i==arr1.length){
            while(j<arr2.length)
                result[k++]=arr2[j++];
        }
        if (j==arr2.length){
            while(i<arr1.length)
                result[k++]=arr1[i++];
        }

        //Optimal appraoch
        /*
        * i=arr1.length-1,j=0
        * Compare if arr1[i]>arr2[j] then swap and i--,j++ else break;
        */
        return result;
    }
}
