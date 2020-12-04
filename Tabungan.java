

/**
 *  NAMA   : DAMAI SAPUTRA LAOLI
 *  KELAS  : IF-1
 *  NIM    : 10119012
 * @author damai
 */
public class Tabungan {
    private int saldo;

    public Tabungan (int saldo){
        this.saldo = saldo;
    }

    public int ambilUang(int jumlah){
        return this.saldo - jumlah;
    }
}