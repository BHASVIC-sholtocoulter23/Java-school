import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static void printOnDifferentLines(){
        ArrayList<Integer> wordList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String buffer = "";
        buffer = scanner.nextLine();
        for(int i=0;i<buffer.length();i++){
            if(buffer.charAt(i) != ' '){
                System.out.print(buffer.charAt(i));
            }
            else{
                System.out.println();
            }
        }
    }
    private static void password2electricbooagloo() {
        Scanner scanner = new Scanner(System.in);
        String[] userList = {"alex", "emma"};
        String[] passList = {"sunshine", "helltaker"};
        Integer userPos = -1;

        String username = "";
        System.out.println("enter the password:");
        username = scanner.nextLine();
        String password = "";
        System.out.println("enter the password:");
        password = scanner.nextLine();
        for(int i=0;i<2;i++){
            if(Arrays.stream(userList).anyMatch(username::equals)){
                userPos = i;
                break;
            }
        }
        for(int i=0;i<2;i++){
            if(Arrays.stream(passList).anyMatch(password::equals)){
                if(userPos == i){
                    System.out.println("access granted");
                    return;
                }
                break;
            }
        }
        System.out.println("wrong password prepare to die");
    }
    private static void password() {
        Scanner scanner = new Scanner(System.in);
        String buffer = "";
        System.out.println("enter the password:");
        buffer = scanner.nextLine();
        if(buffer.equals("true")){
            System.out.println("access granted");
        }
        else{
            System.out.println("wrong password prepare to die");
        }

    }
    private static void printThrice(){
        Scanner scanner = new Scanner(System.in);
        String buffer = "";
        buffer = scanner.nextLine();
        System.out.println(buffer+buffer+buffer);
    }
    public static void main(String[] args) {
        printOnDifferentLines();
    }
}