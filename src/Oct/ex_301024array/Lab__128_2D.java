package Oct.ex_301024array;

public class Lab__128_2D {
    public static void main(String[] args) {
        int[][] matrix= {{0, 1}, {0, 5}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
