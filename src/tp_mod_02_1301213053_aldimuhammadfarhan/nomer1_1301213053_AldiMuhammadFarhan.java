/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_mod_02_1301213053_aldimuhammadfarhan;
import java.util.Scanner;
/**
 *
 * @author Aldi M F
 */
public class nomer1_1301213053_AldiMuhammadFarhan {
    public static void main(String[] args) {
        int n,bil1=1,bil2=1,bil3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n : ");
        n = sc.nextInt();
        while(n < 0){
            System.out.print("Masukkan n : ");
            n = sc.nextInt();            
        }
        System.out.print(bil1 +" "+bil2);
        n = n-1;
        while(n > 0){
            bil3 = bil1+bil2;
            System.out.print(" "+bil3);
            bil1 = bil2;
            bil2 = bil3;
            n--;
        }
    }
}
