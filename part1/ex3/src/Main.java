import java.util.Scanner;
public class Main {
    private static void message() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a message: ");
        String message = scanner.nextLine();
        System.out.println(message);
    }
    private static void greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("whats your name?!: ");
        String message = scanner.nextLine();
        System.out.println("HI, " + message);
    }
    private static void aMessagesThree(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a message: ");
        String message = scanner.nextLine();
        for(int i=0;i<3;i++) {
            System.out.println(message);
        }
    }
    public static void main(String[] args) {


        greeting();
    }

}