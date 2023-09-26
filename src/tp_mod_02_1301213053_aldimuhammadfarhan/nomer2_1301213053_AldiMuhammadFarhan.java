package tp_mod_02_1301213053_aldimuhammadfarhan;
import java.util.Scanner;
/**
 *
 * @author Aldi M F
 */
public class nomer2_1301213053_AldiMuhammadFarhan {
    public static void main(String[] args) {
        int n,matrix1[][],matrix2[][],matrixHasil[][],nilai;
        Scanner sc = new Scanner(System.in);
        System.out.println("Perkalian Matriks nxn");
        System.out.print("n : ");
        n = sc.nextInt();
        matrix1 = new int[n][n];
        matrix2 = new int[n][n];
        matrixHasil = new int[n][n];
        System.out.println("Isi matrix 1:");
        for(int i = 0; i < n;i++){
            for(int j = 0 ;j < n;j++){
                nilai = sc.nextInt();
                matrix1[i][j] = nilai;
                System.out.print("");
            }
            System.out.print("");
        }
        System.out.println("Isi matrix 2:");
        for(int i = 0; i < n;i++){
            for(int j = 0 ;j < n;j++){
                nilai = sc.nextInt();
                matrix2[i][j] = nilai;
                System.out.print("");
            }
            System.out.print("");
        }
        System.out.print("Hasil perkalian:");
        for(int i = 0; i < n;i++){
            for(int j = 0 ;j < n ;j++){
                for(int k = 0; k < n ; k++){
                    matrixHasil[i][j] = matrixHasil[i][j] + (matrix1[i][k]*matrix2[k][j]); 
                }
            }
            System.out.print("");
        }
        System.out.println("");
        for(int i = 0; i < n;i++){
            for(int j = 0 ;j < n;j++){
                System.out.print(matrixHasil[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
