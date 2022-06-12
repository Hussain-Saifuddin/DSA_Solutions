package com.hussainsaifuddin.Solutions;

public class AbstractDemo {
    public static void main(String[] args) {
        Maruti c = new Maruti();
        c.setPosX(100);
        c.setPosY(300);
        System.out.println(c.getPosition());
        ShowWriter w = new ShowWriter();
        Pencil p = new Pencil();
        Marker m = new Marker();
        w.show(m);
    }
}

// abstract classes may or may not contain abstract method and if an abstract method is defined then the class must be abstract. Objects of abstract classes cannot be created.
abstract class Car {

    public abstract void accelerate();

    public abstract String getPosition();

}

//
class Maruti extends Car{

    private Integer posX;
    private Integer posY;

    public Integer getPosX() {
        return posX;
    }

    public void setPosX(Integer posX) {
        this.posX = posX;
    }

    public Integer getPosY() {
        return posY;
    }

    public void setPosY(Integer posY) {
        this.posY = posY;
    }

    public void accelerate() {
    }

    public String getPosition() {
        return posX + "," + posY;
    }
}

abstract class Writer {
    void show(){}
}

class Pen extends Writer {
    void show(){
        System.out.println("Inside Pen");
    }
}

class Pencil extends Writer {
    void show(){
        System.out.println("Inside Pencil");
    }
}

class ShowWriter {
    void show(Writer w){
        w.show();
    }
}

class Marker extends Writer {
    void show(){
        System.out.println("Inside Marker");
    }
}

