class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li=new ArrayList<>();
        int left=0,right=matrix[0].length-1,top=0,bottom=matrix.length-1;
        while(left<=right && top<=bottom){
            if(top<=bottom){
                for(int col=left;col<=right;col++){
                    li.add((matrix[top][col]));
                }top++;
            }
            if(left<=right){
                for(int row=top;row<=bottom;row++){
                    li.add((matrix[row][right]));
                }right--;
            }
            if(top<=bottom){
                for(int col=right;col>=left;col--){
                    li.add((matrix[bottom][col]));
                }bottom--;
            }
            if(left<=right){
                for(int row=bottom;row>=top;row--){
                    li.add((matrix[row][left]));
                }left++;
            }
        }
        return li;
    }
}