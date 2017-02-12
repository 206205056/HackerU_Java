package com.company;

/**
 * Created by hackeru on 2/12/2017.
 */
public class Shape {

    private Color color=new Color(1,2,3);

    //מחלקה מקוננת סטטית
    public static class Color{
        private int r,g,b;
        public Color(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }
        public int getR() {
            return r;
        }
        public int getG() {
            return g;
        }
        public int getB() {
            return b;
        }
    }

}
