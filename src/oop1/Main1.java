package oop1;

public class Main1 {
    public static void main(String[] args){
        Student s1 = new Student(101, "Dakshit", 79, 89, 99);
        Student s2 = new Student(102, "Yash", 89, 72, 79);

        s1.displayStudDetails();
    }
}

class Student{
    private int rollNum;
    private String studName;
    private int mark1;
    private int mark2;
    private int mark3;
    private int totalMarks;

    public Student(int rollNum, String studName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        calculateTotal();
    }

    public int calculateTotal(){
        totalMarks = mark1+mark2+mark3;
        return totalMarks;
    }

    public void displayStudDetails(){
        System.out.println(rollNum + " " + studName + " " + totalMarks);
    }
}
