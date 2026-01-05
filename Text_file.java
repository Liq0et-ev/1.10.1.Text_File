import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input file name:");
        String fileName = scanner.nextLine();

        try {
            System.out.println("result:");
            Counter_for_quantity_of_wordsee_in_text(fileName);
        } catch (IOException e) {
            System.out.println("Doesn't exist");
            e.printStackTrace();
        }
        scanner.close();
    }
    public static void  Counter_for_quantity_of_wordsee_in_text(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (countEE(word) >= 2) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
               public static int countEE(String word){
                    int Ecount_in_word = 0;
                    for (char c: word.toCharArray()){
                        if (c == 'e'){
                            Ecount_in_word++;
                        }
                    }
                    return Ecount_in_word;
                }
        }
