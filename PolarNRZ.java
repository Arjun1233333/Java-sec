import java.util.Scanner;

public class PolarNRZ {

    static void polarNRZ(int[] data) {
        for (int bit : data) {
            if (bit == 1)
                System.out.print("+1 ");
            else
                System.out.print("-1 ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] data = {1,1,0,0,1,1,0,0};

        polarNRZ(data);

        sc.close();
    }
}
