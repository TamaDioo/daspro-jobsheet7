import java.util.Scanner;
public class LatihanMandiria09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jenisKelamin;
        int i;

        for (i = 1; i <= 30; i++) {
            System.out.print("Masukkan nama mahasiswa ke " + i + ": ");
            nama = input.nextLine();
            System.out.print("Masukkan jenis kelamin mahasiswa " + i + " (Laki-laki/Perempuan): ");
            jenisKelamin = input.nextLine();

            if (jenisKelamin.equalsIgnoreCase("perempuan")) {
                System.out.println(nama);
            }
        }
    }
}