import processing.core.PApplet;

/**
 * This class defines the Processing Sketch It extends PApplet, which is a
 * special processing class to represent the sketches
 * 
 * https://processing.org/reference/ is a helpful site to help you better
 * understad the built-in processing functions
 */
public class Sketch extends PApplet {
    // In these three variables, `this` is referring to the object this code
    // is inside! In this case, that is the sketch we have created.

    /** First ball is the default black ball. */
    Ball b1 = new Ball(this);

    /** Second ball customizes size and position, but not color or speed */
    Ball b2 = new Ball(this, 200, 100, 50);

    /** Third ball defines all the parameters */
    Ball b3 = new Ball(this, 300, 300, 150, color(0, 0, 255), -8, -1);

    /**
     * This function runs at the very beginning and defines the settings of the
     * sketch. Only certain methods are allowed in here!
     */
    public void settings() {
        size(500, 500);
    }

    /**
     * This function runs after setup, and initializes your code. You can put
     * whatever you want in here, but it only runs once at the beginning!
     */
    public void setup() {
        System.out.println(Integer.toHexString(color(160, 160, 160, 160)));
    }

    /**
     * This function runs over and over and over, approximately 60 times per second!
     */
    public void draw() {
        // paint the background gray
        background(100);

        // draw all three balls
        b1.drawBall();
        b2.drawBall();
        b3.drawBall();

        // tell all three balls to move so they are in a different place next time
        b1.moveBall();
        b2.moveBall();
        b3.moveBall();
    }

    /** All processing sketches have to use this main method */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
