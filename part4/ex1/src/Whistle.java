public class Whistle {
    public String quack = "";
    public Whistle(String quackIn){
        quack = quackIn;
    }
    public void sound(){
        System.out.println(quack);
    }
}
