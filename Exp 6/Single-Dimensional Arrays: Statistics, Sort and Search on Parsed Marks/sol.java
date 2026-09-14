import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] tokens = input.split(",");
        int[] values = new int[tokens.length];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < tokens.length; i++) {
            values[i] = Integer.parseInt(tokens[i].trim());
            sum += values[i];

            if (values[i] > max) {
                max = values[i];
            }

            if (values[i] < min) {
                min = values[i];
            }
        }

        int[] sorted = Arrays.copyOf(values, values.length);
        Arrays.sort(sorted);

        int target = Integer.parseInt(sc.nextLine().trim());

        int foundIndex = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                foundIndex = i;
                break;
            }
        }

        double average = (double) sum / values.length;

        System.out.println("Original: " + Arrays.toString(values));
        System.out.println("Sorted: " + Arrays.toString(sorted));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.printf("Average: %.2f%n", average);

        if (foundIndex != -1) {
            System.out.println(target + " found at index " + foundIndex);
        } else {
            System.out.println(target + " not found");
        }
    }
}
