package oop5;

public class Main5 {
    public static void main(String[] args){
        Holiday h1 = new Holiday("Uttrayan", 14, "Jan");
        Holiday h2 = new Holiday("RDay", 26, "Jan");
        Holiday h3 = new Holiday("Holi", 10, "March");

        System.out.println(h1.inSameMonth(h2));

        Holiday[] holidays = new Holiday[3];
        holidays[0] = h1;
        holidays[1] = h2;
        holidays[2] = h3;

        System.out.println(Holiday.avgDate(holidays));
    }
}

class Holiday{
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public static double avgDate(Holiday[] holidays){
        double total = 0;
        for(int i=0; i<holidays.length; i++){
            total = total + holidays[i].day;
        }
        return total/holidays.length;
    }


    public boolean inSameMonth(Holiday h){
        if(this.month.equals(h.month)){
            return true;
        }
        return false;
    }


}