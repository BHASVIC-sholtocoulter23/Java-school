import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;System.out.println("Hello world!");Scanner scanner = new Scanner(System.in);outer:{while(true){a = Integer.valueOf(scanner.nextLine());if(a == 5){continue;}break outer;}}
    }
}