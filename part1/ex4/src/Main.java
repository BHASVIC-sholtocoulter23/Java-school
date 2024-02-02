import java.util.Scanner;
public class Main {
    public static void doubleInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a double: ");
        double message = Double.valueOf(scanner.nextLine());
        System.out.println(message);
    }
    public static void main(String[] args) {

        doubleInput();
    }
}