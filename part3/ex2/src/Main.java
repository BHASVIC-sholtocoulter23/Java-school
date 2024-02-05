import com.sun.security.jgss.InquireType;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void third() {
        ArrayList<String> wordList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String buffer = "";
        do {
            buffer = scanner.nextLine();
            wordList.add(buffer);
        }while(buffer != "");
        System.out.println(wordList.get(2));
    }
    public static void twoPlusThree() {
        ArrayList<Integer> wordList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Integer buffer = 0;
        do {
            buffer = Integer.valueOf(scanner.nextLine());
            wordList.add(buffer);
        }while(buffer != 0);
        System.out.println(wordList.get(2)+wordList.get(1));
    }
    public static void smallest() {
        ArrayList<Integer> wordList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Integer buffer = 0;

        do {
            buffer = Integer.valueOf(scanner.nextLine());
            wordList.add(buffer);

        }while(buffer != 9999);
        for(int i=0;i<wordList.size()-1;i++){
            if(wordList.get(i) < buffer){
                buffer = wordList.get(i);
            }
        }
        System.out.println(buffer);
    }
    public static void main(String[] args) {
        smallest();
    }
}