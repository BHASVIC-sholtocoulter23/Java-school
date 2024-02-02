import java.util.Scanner;

public class Main {
    public static void rootSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number: ");
        Integer num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Write another number: ");
        Integer num2 = Integer.valueOf(scanner.nextLine());
        System.out.println(Math.sqrt((num1+num2)));
    }
    public static void main(String[] args) {
        rootSum();
    }
}