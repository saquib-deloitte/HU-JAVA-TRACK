public class Animal {
    private String names;

    public String getName()
    {
        return names;
    }

    public void setName(String newName)
    {
        this.names = newName;
    }
    public static void main(String[] args){
        Animal obj1=new Animal();
        Animal obj2=new Animal();
        Animal obj3=new Animal();
        obj1.setName("tiger");
        obj2.setName("giraff");
        obj3.setName("elephant");
        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
        System.out.println(obj3.getName());

    }

}
