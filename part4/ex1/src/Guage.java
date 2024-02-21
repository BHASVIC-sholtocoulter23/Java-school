public class Guage{
    private int value;
    public Guage(){
        value = 0;
    }
    public void increase(){
        if (value < 5){
            value++;
        }
    }
    public void decrease(){
        if(value > 0){
            value--;
        }
    }
    public int value(){
        return(value);
    }
    public boolean full(){
        if(value != 5){
            return(false);
        }
        return(true);
    }


}
