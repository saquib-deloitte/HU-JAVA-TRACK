public class Area {
    private double cat;
    private String dog;


    public Animal() {
        cat = 1.0;
        dog = "red";
    }


    public Animal(double r) {
        cat = r;
        dog = "red";
    }


    public double getval() {
        return cat;
    }


    public double getval2() {
        return cat*cat;
    }
}












public class Area1 {
    public static void main(String[] args) {

        Animal c1 = new Animal();

        System.out.println("The values are "
                + c1.getval() + " and another " + c1.getval2());

        Animal c2 = new Animal(2.0);

        System.out.println("The values are "
                + c2.getval() + " and another " + c2.getval2());

    }
}