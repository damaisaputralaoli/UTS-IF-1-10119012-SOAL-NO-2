
package utsif.pkg110119012damaisaputralaolino2;
import java.util.Scanner;

/**
 *    NAMA   : DAMAI SAPUTRA LAOLI
 *    KELAS  : IF-1
 *    NIM    : 10119012
 * 
 * @author damai
 */
public class UTSIF110119012DAMAISAPUTRALAOLINo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldo, jumlah;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Program Penarikan Uang=====");
        System.out.print("Masukkan Saldo Awal\t\t\t: ");
        saldo = scanner.nextInt();
        System.out.print("Jumlah uang yang diambil\t: ");
        jumlah = scanner.nextInt();
        Tabungan tabung = new Tabungan(saldo);
        System.out.println("Saldo Anda Sekarang\t\t\t: "+tabung.ambilUang(jumlah));
    }
}