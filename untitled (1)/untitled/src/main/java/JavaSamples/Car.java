package JavaSamples;

public class Car {
    String color,model;
    int speed;
    public Car(String color,String model,int speed){
        this.color=color;
        this.model=model;
        this.speed=speed;
        System.out.println("my car val");
    }

    public void myValue(){
        System.out.println(color);
        System.out.println(model);
        System.out.println(speed);
    }
}
