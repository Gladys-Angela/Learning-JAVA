
package OOP;

public class Main {
    public static void main(String[] args){
        //creating objects (instances) from the Dog class
        //Class objectName = new NewClassName();
        Dog myDog = new Dog("Rex", "German Shepherd", 3);
        Dog neighborDog = new Dog("Buddy", "Golden Retriever", 5);


        //using the objects
        myDog.bark();
        neighborDog.bark();

        //In this example, Dog is a class that defines hat all dogs have in common.
        // Each individual dog(like myDog and neighborDog)
        //is an objcet created from this class, with its owb unique attribute values.

        //ImprovedDog
        ImprovedDog myImprovedDog = new Dog("Kabadi", "Mwitu", 19);
        System.out.println()

    }
}