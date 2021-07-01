public class DrawTriangle1{
    public static void main(String[] args){
        int col = 0;
        int row = 0;
        int size = 5;
        while (row < size){
            row = row + 1;
            while(col < row){
                System.out.print("*");
                col = col + 1;
            }
            System.out.println();
            col = 0;
        }
    }
}
