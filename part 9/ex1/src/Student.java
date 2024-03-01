public class Student extends Person {
    private int studyPoints;

    public Student(String name, String address, int studyPoints) {
        super(name, address);
        this.studyPoints = studyPoints;
    }
    public void study(){
        studyPoints++;
    }
    public int credits() {
        return (studyPoints);
    }

    @Override
    public String toString() {
        return super.toString() + "\n    " + studyPoints;
    }
}
