package PracticeOOP;

public class Hdd {
    int size;
    int speed;
    public Hdd (int size, int speed){
        this.size = size;
        this.speed = speed;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSize(){
        return size;
    }
    public int getSpeed(){
        return speed;
    }
}
