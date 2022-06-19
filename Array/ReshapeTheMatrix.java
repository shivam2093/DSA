class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       
        int rows = mat.length;
        int cols = mat[0].length;
        
        if((rows * cols) != (r * c)) return mat;
        
        int[][] newArr = new int[r][c];
        int r_newArr = 0;
        int c_newArr = 0;
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                
                newArr[r_newArr][c_newArr] = mat[i][j];
                c_newArr++;
                if(c == c_newArr){
                    c_newArr = 0;
                    r_newArr++;
                }
            }
        }
        
        return newArr;
        
    }
}