import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long multiply = 1 ;



        for (long i = a; i < b; i++) {
          multiply *= i;
        }
            System.out.println( multiply);



    }
}