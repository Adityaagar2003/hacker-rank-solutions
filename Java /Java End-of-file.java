Doubt hai thoda esme

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while (scanner.hasNextLine()) { // Check if there's another line
            String line = scanner.nextLine(); // Read the next line
            System.out.println(++i+" "+line); // Process the line
        }
        scanner.close();
    }
}


