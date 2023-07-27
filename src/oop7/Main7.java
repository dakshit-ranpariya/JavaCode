package oop7;
public class Main7 {
    public static void main(String[] args){
        Bicycle bicycle = new Bicycle();
        Vehicles vehicles = new Vehicles();
        System.out.println(bicycle.maxGearChange());

    }
}
class Vehicles{

    public int maxGearChange(){
        return 0;
    }
}

class Bicycle extends Vehicles{
    public int maxGearChange(){
       return 2;
    }
}

class Bike extends Vehicles{
    public int maxGearChange(){
       return 5;
    }
}

class Car extends Vehicles{
    public int maxGearChange(){
       return 7;
    }
}
