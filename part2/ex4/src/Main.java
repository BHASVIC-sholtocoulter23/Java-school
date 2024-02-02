import java.util.Scanner;

public class Main {
    private static int summationerationator(int num1, int num2, int num3, int num4){
        return(num1+num2+num3+num4);

    }
    private static void sumser(){
        int num = summationerationator(1, 1, 1 ,1);
        System.out.println(num);
    }
    private static void numberUntil(Scanner scanner, Integer num){
        for(int i=0;i<num;i++){
            System.out.println(i);
        }
    }
    private static void parameters(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number: ");
        Integer message = Integer.valueOf(scanner.nextLine());
        numberUntil(scanner, message);
    }
    public static void main(String[] args) {
        sumser();
    }
}