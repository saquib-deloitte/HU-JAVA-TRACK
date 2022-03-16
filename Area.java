public class Area {

    void calAreaSquare(float a) {
        System.out.println("Area of Square is: " + a * a + " sq unit");
    }

    void calAreaRectangle(float a, float b) {
        System.out.println("Area of Rectangle is: " + a * b + " sq unit");
    }

    void calAreaTriangle(float a, float b) {
        float tri =(float) a * b * 1 / 2;
        System.out.println("Area of Triangle is: " + tri + " sq unit");
    }

    void calAreaCircle(float a) {
        float ar = (float)3.142 * a * a;
        System.out.println("Area of Circle is: " + ar + " sq unit");
    }

    public static void main(String[] args) {
        Area calc = new Area();
        calc.calAreaSquare(4);
        calc.calAreaRectangle(4, 9);
        calc.calAreaTriangle(5, 8);
        calc.calAreaCircle(7);

    }

}
