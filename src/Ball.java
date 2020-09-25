import processing.core.PApplet;

class Ball {

    private PApplet sketch;
    // instance variables with default values
    private int size = 100; // diameter of the ball
    private int x = 100; // The horizontal position of the ball (bigger => right)
    private int y = 50; // the vertical position of the ball (bigger => down)
    private int col; // set default in constructor

    /** These represent the intial movement speed of the balls **/
    private int speedY = 5;
    private int speedX = 1;

    // default constructor just leave sth edefault values
    public Ball(PApplet s) {
        sketch = s;
        col = sketch.color(255, 0, 0);
    }

    public Ball(PApplet s, int theX, int theY, int ballSize) {
        sketch = s;
        col = sketch.color(255, 0, 0);
        x = theX;
        y = theY;
        size = ballSize;
    }

    public Ball(PApplet s, int theX, int theY, int ballSize, int ballColor) {
        sketch = s;
        x = theX;
        y = theY;
        size = ballSize;
        col = ballColor;
    }

    public Ball(PApplet s, int theX, int theY, int ballSize, int ballColor, int sx, int sy) {
        sketch = s;
        x = theX;
        y = theY;
        size = ballSize;
        col = ballColor;
        speedX = sx;
        speedY = sy;
    }

    /** Draws the ball. DO NOT EDIT. */
    public void drawBall() {
        sketch.stroke(col);
        sketch.fill(col);
        sketch.ellipse(x, y, size, size);
    }

    /** Moves the balls. DO NOT EDIT. */
    public void moveBall() {
        if (x > sketch.width - size / 2 || x < size / 2) {
            speedX = -speedX;
        }
        if (y > sketch.height - size / 2 || y < size / 2) {
            speedY = -speedY;
        }

        x += speedX;
        y += speedY;
    }
}