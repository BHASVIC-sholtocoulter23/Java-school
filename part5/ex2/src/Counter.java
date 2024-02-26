public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public Counter(int initalCount) {
        count = initalCount;
    }

    public void increment() {
        count++;
    }
    public void increment(int increaseBy){
        count += increaseBy;
    }
    public void decrement(){
        count--;
    }
    public void decrement(int decreaseBy){
        count -= decreaseBy;
    }
    public int getCount(){
        return (count);
    }
}

