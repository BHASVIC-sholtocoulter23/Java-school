import java.util.Scanner;
public class Main {
    public static void addition(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println(first+second);
    }
    public static void main(String[] args) {

        addition();
    }
}