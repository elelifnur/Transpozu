package Diziler;
import java.util.Scanner;
public class Transpozu {
    public static void main(String[] args){
        int column;
        int[][] matris= {
                {2,3,4},
                {5,6,4}
        };

        column=matris[0].length;
        for(int i=0; i < column;i++){
            for (int j=0; j < matris.length;j++){
                System.out.print(matris[j][i]+"\t");
            }
            System.out.println();
        }
    }
}
