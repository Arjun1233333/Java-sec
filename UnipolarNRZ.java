import java.util.Scanner;
public class UnipolarNRZ {
    static void unipolarNRZ(int[] data) {
        for (int bit : data) {
            if (bit == 1)
                System.out.print("+1 ");
            else
                System.out.print("0 ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        unipolarNRZ(data);
        sc.close();
    }
}
