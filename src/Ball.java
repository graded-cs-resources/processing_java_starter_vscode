import processing.core.PApplet;

class Ball {

    /** A link to the sketch that is making the balls */
    private PApplet sketch;

    /** diameter of the ball */
    private int size = 100;

    /** horizontal position of the ball */
    private int x = 100;

    /** vertical position of the ball */
    private int y = 50; // the vertical position of the ball (bigger => down)

    /** color of the ball, defaults to black */
    private int col = 0;

    /** speed of the ball in the Y direction (positive is down) */
    private int speedY = 5;

    /** speed of the ball in the X direction (positive is right) */
    private int speedX = 1;

    /**
     * Default constructor, leaves all default options
     * 
     * @param s A link to the sketch that is making the ball
     */
    public Ball(PApplet s) {
        sketch = s;
    }

    /**
     * Constructor that sets the position and size of your {@link Ball}
     * 
     * @param s        A link to the sketch that is making the ball
     * @param theX     x-coordinate of the center of the ball
     * @param theY     y-coordinate of the center of the ball
     * @param ballSize diameter of the ball
     */
    public Ball(PApplet s, int theX, int theY, int ballSize) {
        sketch = s;
        x = theX;
        y = theY;
        size = ballSize;
    }

    /**
     * Constructor that sets the position and size of your {@link Ball}
     * 
     * @param s         A link to the sketch that is making the ball
     * @param theX      x-coordinate of the center of the ball
     * @param theY      y-coordinate of the center of the ball
     * @param ballSize  diameter of the ball
     * @param ballColor color of the ball as an int - use color(red, green, blue) to
     *                  make this!
     * @param sx        speed in the x-direction (how many pixels per 60th of a
     *                  second) - positive is right
     * @param sy        speed in the y-direction - positive is down
     */
    public Ball(PApplet s, int theX, int theY, int ballSize, int ballColor, int sx, int sy) {
        sketch = s;
        x = theX;
        y = theY;
        size = ballSize;
        col = ballColor;
        speedX = sx;
        speedY = sy;
    }

    /** Draws the ball. */
    public void drawBall() {
        sketch.stroke(col);
        sketch.fill(col);
        sketch.ellipse(x, y, size, size);
    }

    /** Moves the balls. */
    public void moveBall() {
        /* If the ball is on the edge, flip the direction. Bounce! */
        if (x > sketch.width - size / 2 || x < size / 2) {
            speedX = -speedX;
        }
        if (y > sketch.height - size / 2 || y < size / 2) {
            speedY = -speedY;
        }
        /* Add the speed in both directions to move the ball */
        x += speedX;
        y += speedY;
    }
}