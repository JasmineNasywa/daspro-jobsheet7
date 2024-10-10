import java.util.Scanner;
public class tugas1jobsheet7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int jmltiket, hargatiket = 50000, totaltiket = 0, totalharga, i = 0, jmlpengunjung;
        double diskon, hargatotal = 0, hargabayar;

        System.out.println("Masukkan total pengunjung dalam sehari : ");
        jmlpengunjung = sc.nextInt();

        while (i < jmlpengunjung) {
            System.out.println("Masukkan jumlah tiket yang akan dipesan : ");
            jmltiket = sc.nextInt();
            totaltiket += jmltiket;

            totalharga = hargatiket*jmltiket;
            

            if (jmltiket >= 10){
            diskon = 0.15;
            hargabayar = totalharga- (totalharga * diskon);
            System.out.println("Harga yang harus dibayar : Rp " + (totalharga - (totalharga * diskon)) );

            }else if (jmltiket >= 4) {
                diskon = 0.1;
                hargabayar = totalharga- (totalharga * diskon);
                System.out.println("Harga yang harus dibayar : Rp. " + (totalharga - (totalharga * diskon)));

            } else if (jmltiket >= 0) {
                diskon = 0;
                hargabayar = totalharga- (totalharga * diskon);
                System.out.println("Harga yang harus dibayar : Rp. " + (totalharga - (totalharga * diskon)));
            } else {
                diskon=0;
                hargabayar = totalharga- (totalharga * diskon);
                System.out.println("Jumlah tidak valid, masukkan lagi.");
                continue;
            } hargatotal += hargabayar;
            i++;

        }
        System.out.println("Jumlah tiket yang terjual hari ini : " + totaltiket);
        System.out.println("Jumlah harga tiket dalam sehari : Rp. " + hargatotal);

    }
}
