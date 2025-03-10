package Lab2;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;


public class exercitiu1Lab2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputScanner = new Scanner(new File("src/Lab2/in.txt"));

        int[] myArray = readNumbersFromInput(inputScanner, 8);
        printArray(myArray);
        inputScanner.close();
    }

    private static int[] readNumbersFromInput(Scanner scanner, int size){
        int[] numbers = new int[size];
        for(int i = 0; i < size; i++){
            if(scanner.hasNextInt()){
                numbers[i] = scanner.nextInt();
            }

        }
        return numbers;
    }

    private static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
}

//1. Fișierul judete_in.txt, conține lista neordonată a județelor din țară. Să se încarce
//datele din fișier într-un tablou de String-uri și să se ordoneze acest tablou cu ajutorul metodei
//sort() din clasa Arrays. Să se returneze pe ce poziție se află în vectorul ordonat un județ
//introdus de la tastatură. Se va utiliza metoda de căutare binară din clasa Arrays.