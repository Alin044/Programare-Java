package Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class exercitiu1Lab2Judete {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputScanner = new Scanner(new File("src/Lab2/input.txt"));
        Scanner countyScan = new Scanner(System.in);
        String[] judet = new String[10];

        judet = readCountiesFromFile(inputScanner, 8);
        Arrays.sort(judet);
        printJudete(judet);

    }
    public static String[] readCountiesFromFile(Scanner scanner, int size){
        String[] counties = new String[size];
        int i = 0;
        while(scanner.hasNext()){
            counties[i] = scanner.nextLine();
            i++;
        }
        return counties;
    }
    private static void printJudete(String[] array, Scanner scanner){
        System.out.println(Arrays.toString(array));
    }
    private static String findCounty(Scanner scanner){
        System.out.println("Enter a county name to find : ");
        String county =
    }
}
