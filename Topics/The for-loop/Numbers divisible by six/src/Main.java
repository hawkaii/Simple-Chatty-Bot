import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < a; i++){
            int num = scanner.nextInt();
            if (num % 6 == 0){
            sum += num;
            }
        }
        System.out.println(sum);

    }
}