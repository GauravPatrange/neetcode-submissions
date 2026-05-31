class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }

    public int[] mergeSort(int[] A){
        int len = A.length;
        //Base Condition
        if(len<2){
            return A;
        }
        int mid = len/2;

        int[] left = new int[mid];
        int[] right = new int[len-mid];

        //copying A elements in left and right Array
        for(int i=0;i<mid;i++){
            left[i]=A[i];
        }

        for(int i=mid;i<len;i++){
            right[i-mid] = A[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(left,right,A);
        return A;
    }

    public void merge(int[] arrL, int[] arrR,int[] A){

        int nL = arrL.length;
        int nR = arrR.length;

        int i=0; // index of arrL
        int j=0; // index of arrR
        int k=0; // index of A

        while(i<nL && j<nR){
            if(arrL[i]<arrR[j]){
                A[k]=arrL[i];
                i++;
            }else{
                A[k]=arrR[j];
                j++;
            }
            k++;
        }

        while(i<nL){
            A[k]=arrL[i];
            i++;
            k++;
        }
        while(j<nR){
            A[k]=arrR[j];
            j++;
            k++;
        }

    }

}