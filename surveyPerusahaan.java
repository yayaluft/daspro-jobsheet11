import java.util.Scanner;

public class surveyPerusahaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survei = new int[10][6];

        System.out.println("--HASIL SURVEI PERUSAHAAN--");

        for (int i = 0; i < survei.length; i++) {
            System.out.println();
            System.out.println("Responden ke-" + (i + 1));
            int total = 0;
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Nilai pertanyaan ke-" + (j + 1) + " (1-5): ");
                survei[i][j] = sc.nextInt();
                while (survei[i][j] < 1 || survei[i][j] > 5) {
                    System.out.println("Masukkan nilai yang valid! (1-5)");
                    System.out.print("Nilai pertanyaan ke-" + (j + 1) + "(1-5): ");
                    survei[i][j] = sc.nextInt();
                }
                total += survei[i][j];
            }
            double rataResponden = total / 6;
            System.out.print("Nilai rata-rata responden ke-" + (i + 1) + ": " + rataResponden);
            System.out.println();
        }
        System.out.println();
        for (int j = 0; j <survei[0].length; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < survei.length; i++) {
                totalPertanyaan += survei[i][j];
            }
            double rataPertanyaan = totalPertanyaan / survei.length;
            System.out.println("Rata-rata pertanyaan ke-" + (j + 1) + ": " + rataPertanyaan);
        }
        int totalKeseluruhan = 0;

        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[i].length; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }

        System.out.println();
        double rata2 = totalKeseluruhan / (survei.length* survei[0].length);
        System.out.println("Rata-rata keseluruhan: " + rata2);
    }
}