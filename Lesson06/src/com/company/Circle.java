package com.company;

/**
 * Created by hackeru on 2/12/2017.
 */
public class Circle {
    //int x,y;
    Point center;
    int radius;
    int z;

    public Circle(int x,int y,int radius){
        this.radius=radius;
        this.center=new Point(x,y);
    }

    class Point{
        private int x,y;
        int z;

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getX() {

            return x;
        }

        public int getY() {
            return y;
        }

        public Point(int x, int y) {

            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
           return x+" "+y;
        }
    }

    @Override
    public String toString() {
        return "radious:"+radius;
    }
}
