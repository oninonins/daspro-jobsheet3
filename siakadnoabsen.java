import java.util.Scanner;

public class siakadnoabsen {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        
        System.out.print("Masukan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukan nomor absen: ");
        absen = sc.nextByte(); 
        System.out.print("Masukan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan nilai tugas: ");
        nilaiTugas = sc.nextDouble(); 
        System.out.print("Masukan nilai ujian: ");
        nilaiUjian = sc.nextDouble();


        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) /3;
        System.out.println("Nama: " + nama);
        System.out.println("NIM " + nim);
        System.out.println("kelas: " + kelas);
        System.out.println("Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir );

      
        

    
    }

    
}