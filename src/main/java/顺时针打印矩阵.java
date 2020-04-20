import java.util.ArrayList;

public class 顺时针打印矩阵 {
    public class Solution {
        public  ArrayList<Integer> printMatrix(int[][] matrix) {
            ArrayList<Integer> result =new ArrayList<>();
            //定义四个方向
            int[][] r = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
            int x = matrix.length + 2;
            int y = matrix[0].length + 2;
            int[][] arr = new int[x][y];
            /**
             * 形成下面方式的矩阵
             *  -1-1-1-1-1-1-1-1-1-1
             *  -1    00000000    -1
             *  -1    00000000    -1
             *  -1    00000000    -1
             *  -1-1-1-1-1-1-1-1-1-1
             */
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (i == 0 || j == 0 || i == x - 1 || j == y - 1) {
                        arr[i][j] = -1;
                    } else {
                        arr[i][j] = matrix[i - 1][j - 1];
                    }
                }
            }
            int pos = 0;
            int i = 1;
            int j = 0;
            while(true){
                int [] rx = r[pos%4];
                i = i+rx[0];
                j = j+rx[1];
                //碰到墙转向
                if (arr[i][j] == -1) {
                    pos = pos+1;
                    if(1==rx[1]){
                        j--;
                    }else if(1==rx[0]){
                        i--;
                    }else if(-1==rx[1]){
                        j++;
                    }else if(-1==rx[0]){
                        i++;
                    }
                    //转向之后仍然是墙，则结束
                    rx = r[pos%4];
                    if(arr[i+rx[0]][j+rx[1]] == -1){
                        break;
                    }
                    continue;
                }
                result.add(arr[i][j]);
                arr[i][j] = -1;

            }
            return result;
        }
    }
}
