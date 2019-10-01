import java.util.Scanner;

public class sumValuesInColumn {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        int row;
        int column;
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of row : ");
        row = scanner.nextInt();
        System.out.print("Enter size of column : ");
        column = scanner.nextInt();
        array = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("array [" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }

        System.out.print("Number of column do you want to count sum :");
        num = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j == num) {
                    sum += array[i][num];
                }
            }
            }
        System.out.print("Sum of column " + num + " = " + sum);
        }
    }
