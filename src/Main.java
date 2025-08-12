import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vector = new double[n];
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextDouble();
        }

        double sum = 0.0;
        System.out.print("VALORES =");
        for (double j : vector) {
            System.out.printf(" %.1f", j);
            sum += j;
        }

        double avg = sum / vector.length;
        System.out.printf("%nSOMA: %.1f%n", sum);
        System.out.printf("MEDIA: %.1f", avg);
    }
}