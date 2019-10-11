
package StringScanner;
import java.util.Scanner;

public class TutorialScanner {
    
    public static void main(String[] args){
    
       Scanner input = new Scanner (System.in);
       
        System.out.println("apakah warna kesukaan saya");
        System.out.println("berapa hasil penjumlahan 3+6");
        System.out.println("berapakah umur saya");
        
        
        String warnakesukaan = input.next();
        int hasilnya = input.nextInt();
        int umursaya = input.nextInt();
        
        System.out.println("apakah warna kesukaan saya = " + warnakesukaan );
        System.out.println("berapa hasil penjumlahan 3+6 = " + hasilnya);
        System.out.println("berapakah umur saya = " + umursaya);
    }
 }
