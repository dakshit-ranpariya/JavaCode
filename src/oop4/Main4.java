package oop4;

public class Main4 {
    public static void main(String[] args){
        Student s2 = new Student(102, "Yash", 20, 20, 20, 20, 20);
        Student s3 = new Student(103, "Kevin", 30, 30, 30, 30, 30);
        Student s4 = new Student(104, "ABC", 7, 9, 5, 8, 5);
        Student s5 = new Student(105, "DEF", 8, 5, 9, 3, 2);
        Student s1 = new Student(101, "Dakshit", 10, 10, 10, 10, 10);
        Student s6 = new Student(106, "GHI", 8, 1, 3, 7, 0);

        Student[] students = new Student[6];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;
        students[5] = s6;

        Student.getTop3Student(students);
    }
}

class Student{
    private int rollNo;
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;
    private int mark4;
    private int mark5;
    private int perc;

    public Student(int rollNo, String name, int mark1, int mark2, int mark3, int mark4, int mark5) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;
        perc = (mark1+mark2+mark3+mark4+mark5)/5;
    }

    public static void getTop3Student(Student[] students){
        for(int i=0; i< students.length; i++){
            for(int j=0; j< students.length-i-1; j++){
                if(students[j].perc < students[j+1].perc){
                    Student temp = students[j+1];
                    students[j+1] = students[j];
                    students[j] = temp;
                }
            }
        }
        Student max1 = students[0];
        Student max2 = students[1];
        Student max3 = students[2];
        
//        for(int i=3; i< students.length; i++){
//            if(students[i].perc > max1.perc){
//                max3 = max2;
//                max2 = max1;
//                max1 = students[i];
//            } else if (students[i].perc > max2.perc && students[i].perc != max1.perc) {
//                max3 = max2;
//                max2 = students[i];
//            } else if (students[i].perc > max3.perc && students[i].perc != max2.perc && students[i].perc != max1.perc){
//                max3 = students[i];
//            }
//        }


        System.out.println(max1.rollNo + " " + max1.name + " " + max1.perc);
        System.out.println(max2.rollNo + " " + max2.name + " " + max2.perc);
        System.out.println(max3.rollNo + " " + max3.name + " " + max3.perc);
    }
}
