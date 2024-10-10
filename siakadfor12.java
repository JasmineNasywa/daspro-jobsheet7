import java.util.Scanner;;
public class siakadfor12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

double nilai, tertinggi = 0, terendah = 100;
int jmllulus = 0, jmltdklulus = 0; {

for (int i = 1; i <= 10; i++) {
    System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
    nilai = sc.nextDouble();
    if (nilai > tertinggi) {
        tertinggi = nilai;
    }
    if (nilai < terendah) {
        terendah = nilai;
    } 
    
    
    
    if (nilai <= 60) {
        System.out.println("Mahasiswa tidak lulus");
        jmltdklulus++;
    } else {
        System.out.println("Mahasiswa lulus");
        jmllulus++;
    }

}
 System.out.println("Nilai tertinggi = " + tertinggi);
 System.out.println("Nilai terendah = " + terendah);
 System.out.println("Jumlah mahasiswa lulus = " + jmllulus);
 System.out.println("Jumlah mahasiswa tidak lulus = " + jmltdklulus);
    
} }
    }
