public class Animal {
    private double cat;
    private String dog;


    public void Animal() {
        cat = 1.0;
        dog = "red";
    }


    public void Animal(double r) {
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












public class TestAnimal {
    public static void main(String[] args) {

        Animal c1 = new Animal();

        System.out.println("The values are "
                + c1.getval() + " and another " + c1.getval2());

        Animal c2 = new Animal(2.0);
    //Add
        System.out.println("The values are "
                + c2.getval() + " and another " + c2.getval2());

    }
}