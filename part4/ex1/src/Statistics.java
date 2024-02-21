public class Statistics {
    private int count;
    private int sum;

    public int getCount() {
        return count;
    }

    public Statistics(){
        count = 0;
        sum = 0;
    }
    public void addNumber(int num){
        count++;
        sum += num;

    }
    public int sum(){
        return(sum);
    }
    public double average(){
        if(count != 0) {
            return (sum / count);
        }
        return(0);
    }



}
