public class ControlFlow {
    //Control flow in java

    //Control flow is how we guide our program to make decisions and repeat actions,
    // much like giving instructions to someone following a recipe or navigating a city

    //Lets break this down into key concepts
    //Decision Making conditional statements
    // First, lets understand how java profgrams make decision using if statement
    //IF statement
    //if (condition){
       //code to execute
    //}



    public static void main(String[] args){
        //lets create a simple temperature advisor system
    double temperature = 75;
    int humidity = 65;

    System.out.println("Weather advisory system");
    System.out.println("==================");

    //Simple if statement
    //helps your program choose which path to take based on certain condition 

        if (temperature > 90){
            System.out.println("It's very hot today! Remember to stay hydrated");

        }
        //if-- else statement
        //syntax
        // if (condition){
        //     block of code
        // } else  {
        //     block of code 
        // }
        if (temperature > 80 ){
            System.out.println("It's quite warm = consider staying in the shade. ");

        }else {
            System.out.println("The temperature is moderate today. ");
        
        }
        //Else ...if 
        //multiple conditions
        //syntax
        // if (condition1 is true){
        //     block of code
        // } else if(condition2){
        // code to execute if condition 1 is false  and condition2 is true
        // }else  {
        //  code to execute when both condition 1 and 2 are false and caondition3 is true 
        // }
        //temp 75 hum 65 f && T = f
        if (temperature > 85 && humidity > 60 ){
            System.out.println("High heat and humidity - se caution outdoors");

        }else if (temperature > 85){
            System.out.println("It's hot, but humidity is manageable");

        } else if (humidity > 60) {
            System.out.println("Humidity is high, but temperature is moderate ");
        
        } else {
            System.out.println("weather condition is comfortable ");
        
        } 
        //Switch statement
        //syntax
        // switch(args){
        //     case value1:
        //     executes if value 1 is equal to args
        //         break;
        //     case value2:
        //     executes if value2 is equal to args
        //         break;
        //     case value3:
        //     executes if value3 is equal to args
        //         break;
        //     default:
        //         break;

        // }
        //swtch example
        //grade analysis program
        char grade = 'B';

        System.out.println("Grade Analysis");
        System.out.println("================");

        switch(grade){
            case 'A':
                System.out.println("Excellent performance!");
                System.out.println("Keep up the great work!");
            break;
            case 'B':
                System.out.println("Good performance!");
                System.out.println("Consider aiming even higher next time!");
            break;
            case 'C':
                System.out.println("Satisfactory performance!");
                System.out.println("There is room for improvement!");
            break;
            default:
            System.out.println("Grade needs improvement!");
            System.out.println("Please seek help!");
            break;

        }

        int daysOftheWeek = 7;
        switch(daysOftheWeek){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("invalid day of the week");
            break;
        }
        //next  loops -repeating action



    }


}
