import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String endWord = scanner.nextLine();

        boolean endsWith = endWord.endsWith("burg");
        System.out.println(endsWith);
    }
}