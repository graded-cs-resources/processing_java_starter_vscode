import processing.core.*;

public class Sketch extends PApplet {
    Ball b1 = new Ball(this);
    Ball b2 = new Ball(this, 200, 100, 50);
    Ball b3 = new Ball(this, 50, 150, 20, color(0, 255, 0));
    Ball b4 = new Ball(this, 300, 300, 150, color(0, 0, 255), -8, -1);

    public void settings() {
        size(500, 500);
    }

    public void setup() {

    }

    public void draw() {
        background(0);

        b1.drawBall();
        b2.drawBall();
        b3.drawBall();
        b4.drawBall();

        /******************************/

        b1.moveBall();
        b2.moveBall();
        b3.moveBall();
        b4.moveBall();

    }

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
