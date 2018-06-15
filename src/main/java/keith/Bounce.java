package keith;

import java.util.Random;

import processing.core.PApplet;

public class Bounce extends PApplet {

    float x, y, dx, dy, r, speed;

    public Bounce() {
        r = 25;
        speed = 2;
        x = 320;
        y = 240;
        double th = (new Random()).nextFloat() * 2 * Math.PI;
        dx = (float) (speed * Math.cos(th));
        dy = (float) (speed * Math.sin(th));
    }

    public void settings() {
        size(640, 480);
    }

    public void setup() {
        background(128);
    }

    public void draw() {
        background(128);
        x += dx;
        y += dy;
        if ((x + r) > width) {
            dx = -1 * dx;
            x = width - r;
        }
        if ((x - r) < 0) {
            dx = -1 * dx;
            x = r;
        }
        if ((y + r) > height) {
            dy = -1 * dy;
            y = height - r;
        }
        if ((y - r) < 0) {
            dy = -1 * dy;
            y = r;
        }
        ellipse(x, y, r*2, r*2);
    }

    public static void main(String[] arg) {
        PApplet.main("keith.Bounce");
    }
}
