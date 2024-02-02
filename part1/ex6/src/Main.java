import java.util.Scanner;

public class Main {
    private static void password(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your password: ");
        String score = scanner.nextLine();
        if(score == "Caput Draconis"){
            System.out.println("wellllcome home >:(");
        }
        else{
            System.out.println("get lost");
        }
    }
    private static void Grades(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a score: ");
        Integer score = Integer.valueOf(scanner.nextLine());
        if(score < 0){
            System.out.println("ImPoSsIbLe!!! HIS POWER LEVEL IS UNDER 0!");
        }
        else if(score < 50){
            System.out.println("FAILURE! EMOTIONAL DAMAGE!");
        }
        else if(score < 60){
            System.out.println("1");
        }
        else if(score < 70){
            System.out.println("2");
        }
        else if(score < 80){
            System.out.println("3");
        }
        else if(score < 90){
            System.out.println("4");
        }
        else if(score < 100){
            System.out.println("5");
        }
        else{
            System.out.println("Incredible! you little suck up!");
        }
    }
    public static void main(String[] args) {

        Grades();
    }
}