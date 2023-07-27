public class oops {
    public static void main(String[] args){

        Student s1 = new Student(1, "Dakshit", 95, 89, 91);




    }
}

class Student{
    int rollNum;
    String studName;
    int mark1;
    int mark2;
    int mark3;
    int totalMarks;

    public Student(int rollNum, String studName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }



}
