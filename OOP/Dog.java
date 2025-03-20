package OOP;
 //This is a class definition - a blueprint for creating Dog objects
public class Dog {

    //Attributes (also called fields or properties)

    String name;
    String breed;
    int age;

    //Constructor - special method used when creating new Dog ojects
    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;

    }
    //Method - represent 
    public void bark(){
        System.out.println(name + " Says Woof!");
    }

}