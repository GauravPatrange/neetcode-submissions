class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int top=0,botton=ROWS-1;
        while(top<=botton){
            int row = top+(botton-top)/2;
            if(target > matrix[row][COLS-1]){ // rows last element
                top=row+1;
            }else if(target < matrix[row][0]){ //rows first element
                botton=row-1;
            }else{
                break;
            }
        }

        if(!(top<=botton)){
            return false;
        }

        int row = (top+botton)/2; // get row
        int l=0, r=COLS-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(target > matrix[row][mid]){
                l=mid+1;
            }else if(target < matrix[row][mid]){
                r = mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}
