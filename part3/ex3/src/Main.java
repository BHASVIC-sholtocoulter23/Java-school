import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class Main {
    public static void twoPlusThree() {
        ArrayList<Integer> wordList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String buffer = "";
        ArrayList<Integer> twoSwap = new ArrayList<>();
        do {
            buffer = (scanner.nextLine());
            if(buffer != "") {
                wordList.add(Integer.valueOf(buffer));
            }
        }while(buffer != "");
        System.out.println("which two do you want to swap");
        twoSwap.add(0, Integer.valueOf(scanner.nextLine()));
        twoSwap.add(1, Integer.valueOf(scanner.nextLine()));
        buffer = String.valueOf(wordList.get(twoSwap.get(0)));
        wordList.set(twoSwap.get(0), wordList.get(1));
        wordList.set(twoSwap.get(1), Integer.valueOf(buffer));
        System.out.println(wordList);
    }
    public static void third() {
        ArrayList<String> wordList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String buffer = "";
        do {
            buffer = scanner.nextLine();
            wordList.add(buffer);
        }while(buffer != "");
        System.out.println(wordList.get(wordList.size()-1));
    }
    public static void main(String[] args) {
        third();
    }
}