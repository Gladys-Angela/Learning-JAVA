package OOP;
//child/ subclass that inherits from Animal
public class Dog1 extends Animal {
    private String breed;
    public Dog1(String name, int age, String breed) {
        super(name,age);
        //call the parent class constructor
        this.breed = breed;
    }

    public void bark(){
        System.out.println(name + "says woof!");
    }
    @Override
    public void eat(){
        System.out.println(name + "the dog is chomping on kibble");
    }

    //Here, Dog inherits the name, age and sleep() method from animal, but it also adds its own breed attribute and bark()method. 
    //Additionally, it overrides the eat()method to provide a dog specific implementation 
}
