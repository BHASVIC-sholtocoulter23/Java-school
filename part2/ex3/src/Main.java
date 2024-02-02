import java.util.Scanner;
public class Main {
    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a factorial?: ");
        Integer total =1;
        Integer num = Integer.valueOf(scanner.nextLine());
        for(int i=1;i<num+1;i++){
            total *= i;
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        factorial();
    }
}