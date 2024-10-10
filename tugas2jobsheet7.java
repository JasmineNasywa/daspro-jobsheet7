import java.util.Scanner;
public class tugas2jobsheet7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;


       do {
        System.out.println("Masukkan jenis kendaraan \n 1.Mobil \n 2.Motor \n 0.Kembali");
        jenis = sc.nextInt();

        if (jenis == 1|| jenis == 2){
            System.out.println("Masukkan durasi : ");
            durasi = sc.nextInt();

            if(durasi > 5) {
                total += 12500;
            } if (jenis == 1) {
                total += durasi * 3000;
            } if (jenis == 2) {
                total += durasi * 2000;
            }
        }
       } while (jenis != 0);

       System.out.println("Total biaya parkir = Rp. " + total);

        
    }
}
