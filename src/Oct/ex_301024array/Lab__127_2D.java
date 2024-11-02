package Oct.ex_301024array;
public class Lab__127_2D {
    public static void main(String[] args) {
        int[][] matrix= {{0, 1}, {0, 5}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println( );
        }
    }
}//First Iteration (i = 0):
//Outer Loop: i = 0
//
//Inner Loop: j = 0
//
//Print: matrix[0][0] (which is 0)
//
//Output: 0
//
//Inner Loop: j = 1
//
//Print: matrix[0][1] (which is 1)
//
//Output: 0 1
//
//Outer Loop: i = 0 finishes, prints a newline System.out.println();
//
//Output: 0 1\n
//
//Second Iteration (i = 1):
//Outer Loop: i = 1
//
//Inner Loop: j = 0
//
//Print: matrix[1][0] (which is 0)
//
//Output: 0 1\n0
//
//Inner Loop: j = 1
//
//Print: matrix[1][1] (which is 5)
//
//Output: 0 1\n0 5
//
//Outer Loop: i = 1 finishes, prints a newline System.out.println();
//
//Output: 0 1\n0 5\n
//
//So, at each step:
//
//j = 0 prints the first element of the row.
//
//j = 1 prints the second element of the row.
//
//The loops do not overlap; they execute sequentially, ensuring each element is printed in order.