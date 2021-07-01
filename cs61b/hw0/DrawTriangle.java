public class DrawTriangle{
    public static void DrawTriangle(int size){
        int col = 0;
        int row = 0;
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
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        DrawTriangle(n);
    }
}
