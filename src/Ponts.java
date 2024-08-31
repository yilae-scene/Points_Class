import java.awt.*;

public class Ponts {

    // write code here
    private int x;
    private int y;

    public Ponts (){

    }

    public Ponts (int x , int y){
        this.x = x;
        this.y = y;
    }

    public int getX (){
        return x;
    }

    public int getY (){
        return y;
    }

    public void setX (int x){
        this.x = x;
    }

    public void setY (int y){
        this.y = y;
    }

    public double distance (){
       return distance(0, 0);
    }

    public double distance (Ponts p){
        return distance (p.getX (), p.getY ());
    }

    public double distance (int x, int y){
        return  Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
}
