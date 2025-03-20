package OOP;

public class ImprovedDog {
    //Private  attributes - hidden from outside access
    private String name;
    private String breed;
    private int age;

    //Constructor - special method used when creating
    public ImprovedDog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;

    }

    //getter methods 
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }

    ///Setter method with validation
    public void setAge(int age) {
        if(age >= 0 && age <= 20){
           // Validation logic
            this.age = age;
        } else 
        System.out.println("Invalid age for a dog!");
    }

    public void bark(){
        System.out.println(name + "says: Woof!");
    
    }
}
//Now , to interact with a Dog's age, we must use the getAge() and setAge() methods,
 //which allows the class to conrol how its data is accessed and modified. 
//This is much better than allowing direct access to age, because we can validate that the age makes sense for a dog. 


// 3. Inheritance
//Inheritance allows a class (called a subclass or derived class) to inherit attributes and methods from another class
//(called a superclass or base class) This promotes code reuse and establishes a relationship between classes

//Think of inheritance like family traits: childresn inherit characteristics from their parents,
//bu they can also have teir own unique traits

//create Animal.java(super class) and cat.java (sub class)