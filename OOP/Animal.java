package OOP;
//parent clas

public class Animal {
    protected String name;
    protected int age;

    public Animal (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(name + "is eating");
    }

    public void sleep(){
        System.out.println(name + "is sleeping");
    }

    public void chock(){
        System.out.println(name + "is chocking");
    }

    public void makeSound(){
        System.out.println("Animal makes a sound.");
    }
    

}
