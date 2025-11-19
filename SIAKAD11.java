import java.util.Scanner;

public class SIAKAD11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPersiswa = 0;
        System.out.print("Masukkan jumlah mahasiswa: ");
        int siswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int matkul = sc.nextInt();
        int[][] nilai = new int[siswa][matkul];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println();
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPersiswa / 3);
        }
        System.out.println("\n=====================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");

        for (int j = 0; j < matkul; j++) {
            double totalPermatkul = 0;

            for (int i = 0; i < siswa; i++) {
                totalPermatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + " : " + totalPermatkul / 4);
        }
    }
}
