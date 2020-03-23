import java.util.Scanner;

public class SumOfMainDiagonalOfSquareMatrix {
    public static void main(String[] args) {
        int[][] array;
        int size;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size of Square Matrix: ");
            size = scanner.nextInt();
            if (size > 5){
                System.out.println("Too Large. Enter again");
            }
        } while ((size > 5));
        array = new int[size][size];
        System.out.println("Enter Elements's Value: ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Your Square Matrix: ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < array.length; i++){
            sum+= array[i][i];
        }
        System.out.println("Sum of Main Diagonal: " + sum);
    }
}
