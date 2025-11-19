import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        System.out.println();
        System.out.println("--MENU--");
        System.out.println("Menu 1: Input data penonton");
        System.out.println("Menu 2: Tampilkan daftar penonton");
        System.out.println("Menu 3: Exit");

        while (true) {
            System.out.print("Pilih 1/2/3: ");
            int menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
                while (true) {
                    System.out.println();
                    System.out.println("--Data Penonton--");
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi oleh penonton lain: " + penonton[baris - 1][kolom - 1]);
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Input data penonton berhasil!");
                        break;
                    }
                }

            } else if (menu == 2) {
                System.out.println("--Daftar Penonton--");
                for (int i = 0; i < penonton.length; i++) {
                    for(int j=0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("*** ");
                        } else {
                            System.out.print(penonton[i][j]+" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();

            } else if (menu == 3) {
                System.out.println("Exit!");
                break;
            } else {
                System.out.println("Masukkan inputan yang valid!");
            }
        }
    }
}