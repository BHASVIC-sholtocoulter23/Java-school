import java.util.Scanner;

public class Main {


    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);
        int buffer = 0;
        Statistics total = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        buffer = Integer.valueOf(scanner.nextLine());
        while(buffer != -1){
            total.addNumber(buffer);
            if(buffer % 2 == 0){
                even.addNumber(buffer);
            }
            else{
                odd.addNumber(buffer);
            }
            buffer = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("total = " +String.valueOf(total.sum()));
        System.out.println("even total = " +String.valueOf(even.sum()));
        System.out.println("odd total = " +String.valueOf(odd.sum()));
    }
}
