import java.util.Scanner;
public class conversion {
    public static void main(String[] args) {
        System.out.println("UNIT CONVERSION TOOL");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose the category of the units you want to convert:\n" + 
        "1. Lenght/Distance\n" + 
        "2. Mass/Weight\n" + 
        "3. Volume\n" + 
        "4. Temperature\n" +
        "5. Speed\n" +
        "6. Area\n" +
        "Select the option:");
        int categoryChoice = scanner.nextInt();
        if(categoryChoice == 1)
        {
            System.out.print("Choose which conversion you want to do:\n" + 
            "1. Inches to Centimeters\n" +
            "2. Feet to Inches\n" +
            "3. Yards to Feet\n" +
            "4. Miles to Kilometers\n" +
            "5. Yard to Meters\n" + 
            "6. Miles to Feet\n" + 
            "7. Miles to Kilometer\n" +
            "Select the option:");

            int userChoiceLength = scanner.nextInt();
            System.out.print("Enter the number you want to convert:");
            double valueLength = scanner.nextDouble();

            switch(userChoiceLength){
            case 1:
                System.out.printf("%.5f inches is equal to %.5f centimeters.%n", valueLength, valueLength * 2.54);
                break;
            case 2:
                System.out.printf("%.5f feet is equal to %.5f inches.%n", valueLength, valueLength * 12);
                break;
            case 3:
                System.out.printf("%.5f yard is equal to %.5f feet.%n", valueLength, valueLength * 3);
                break;
            case 4:
                System.out.printf("%.5f miles is equal to %.5f kilometeres.%n", valueLength, valueLength * 1.60934);
                 break;
            case 5:
                System.out.printf("%.5f yard is equal to %.5f meters.%n", valueLength, valueLength * 0.9144 );
                break;
            case 6:
                System.out.printf("%.5f mile is equal to %.5f feet.%n", valueLength, valueLength * 5280);
                break;
            case 7:
                System.out.printf("%.5f killometers is equal to %.5f miles.%n", valueLength, valueLength * 1.60934);
                break;
            default:
                System.out.printf("Invalid choice");
                break;
            }

        }
        else if(categoryChoice == 2)
        {
            System.out.print("Choose the conversion you want to do:\n" + 
            "1. Ounces to Grams\n" + 
            "2. Pounds to Kilograms\n" + 
            "3. Kilograms to Pounds\n" +
            "4. Tonnes to Kilograms\n" +
            "Select the option:");
            int userChoiceMass = scanner.nextInt();
            System.out.print("Enter the number you want to convert:");
            double valueMass = scanner.nextDouble();

            switch (userChoiceMass){
            case 1:
                System.out.printf("%.5f ounces is equal to %.5f grams.%n", valueMass, valueMass * 28.3495);
                break;
            case 2:
                System.out.printf("%.5f pounds is equal to %.5f kilograms.%n", valueMass, valueMass * 0.453592);
                break;
            case 3:
                System.out.printf("%.5f kilograms is equal to %.5f pounds.%n", valueMass, valueMass * 2.20462);
                break;
            case 4:
                System.out.printf("%.5f tonnes is equal to %.5f kilograms.%n", valueMass, valueMass * 1000);
                break;
            default:
                System.out.printf("Invalid choice");
                break;
            }

        }
        else if(categoryChoice == 3)
        {
            System.out.print("Choose the conversion you want to do:\n" + 
            "1. Teaspoons to Milliliters\n" +
            "2. Tablespoons to Milliliters\n" +
            "3. Fluid Ounces to Milliliters\n" +
            "4. Cups to Milliliters\n" +
            "5. Pints to Milliliters\n" +
            "6. Quarts to Milliliters\n" +
            "7. Gallons to Liters\n" +
            "Select the option:");
            int userChoiceVolume = scanner.nextInt();
            System.out.print("Enter the number you want to convert:");
            double valueVolume = scanner.nextDouble();

            switch (userChoiceVolume){
            case 1:
                 System.out.printf("%.5f teaspoon is equal to %.5f milliliters .%n", valueVolume, valueVolume * 4.92892);
                 break;
            case 2:
                 System.out.printf("%.5f tablespoon is equal to %.5f milliliters .%n", valueVolume, valueVolume * 14.7868);
                 break;
            case 3:
                 System.out.printf("%.5f fluid ounce is equal to %.5f milliliters .%n", valueVolume, valueVolume * 29.5735);
                 break;
            case 4:
                 System.out.printf("%.5f cup is equal to %.5f milliliters .%n", valueVolume, valueVolume * 237);
                 break;
            case 5:
                 System.out.printf("%.5f pint is equal to %.5f milliliters .%n", valueVolume, valueVolume * 473.176);
                 break;
            case 6:
                 System.out.printf("%.5f quarts is equal to %.5f milliliters .%n", valueVolume, valueVolume * 946.353);
                 break;
            case 7:
                 System.out.printf("%.5f gallon is equal to %.5f liters .%n", valueVolume, valueVolume * 3.78541);
                 break;
            default:
                System.out.printf("Invalid choice");
                break; 
            }
        }
        else if(categoryChoice == 4)
        {
            System.out.print("Choose the conversion you want to do:\n" +
            "1. Celsius to Fahrenheit\n" +
            "2. Fahrenheit to Celsius\n" +
            "3. Kelvin to Celsius\n" +
            "4. Celsius to Kelvin\n" + 
            "Select the option:");
            int userChoiceTemp = scanner.nextInt();
            System.out.print("Enter the number you want to convert:");
            double valueTemp = scanner.nextDouble();

            switch(userChoiceTemp){
            case 1:
                System.out.printf("%.5f celsius is equal to %.5f fahrenheit.%n", valueTemp, (((valueTemp * 9)/5)+32));
                break;
            case 2:
                System.out.printf("%.5f fahrenheit is equal to %.5f celsius.%n", valueTemp, (((valueTemp - 32) * 5)/9));
                break;
            case 3:
                System.out.printf("%.5f kelvin is equal to %.5f celsius.%n", valueTemp, valueTemp - 273.15);
                break;
            case 4:
                System.out.printf("%.5f celsius is equal to %.5f kelvin.%n", valueTemp, valueTemp + 273.15);
                break;
            default:
                System.out.printf("Invalid choice");
                break;
            }
        }
        else if(categoryChoice == 5)
        {
            System.out.print("Choose the conversion you want to do:\n" +
            "1. Miles per Hour to Kilometers per Hour\n" +
            "2. Feet per Second to Meters per Second\n" +
            "3. Kilometers per Hour to Miles per Hour\n" +
            "Select the option:");
            int userChoiceSpeed = scanner.nextInt();
            System.out.print("Enter the number you want to convert:");
            double valueSpeed = scanner.nextDouble();

            switch (userChoiceSpeed){
            case 1:
                 System.out.printf("%.5f mile per hour (mph) is equal to %.5f mile per hour (mph).%n", valueSpeed, valueSpeed * 1.60934);
                 break;
            case 2:
                 System.out.printf("%.5f  foot per second (ft/s) is equal to %.5f meters per second (m/s).%n", valueSpeed, valueSpeed * 0.3048);
                 break;
            case 3:
                 System.out.printf("%.5f kilometer per hour (km/h) is equal to %.5f miles per hour (mph).%n", valueSpeed, valueSpeed * 0.621371);
                 break;
            }
        }
        else if(categoryChoice == 6)
        {
            System.out.print("Choose the conversion you want to do:\n" +
            "1. Square Inches to Square Centimeters\n" +
            "2. Square Feet to Square Meters\n" +
            "3. Square Yards to Square Meters\n" +
            "4. Square Miles to Square Kilometers\n" +
            "5. Hectares to Acres\n" +
            "6. Acres to Square Meters\n" +
            "Select the option:");
            int userChoiceArea = scanner.nextInt();
            System.out.print("Enter the number you want to convert:");
            double valueArea = scanner.nextDouble();

            switch (userChoiceArea){
            case 1:
                System.out.printf("%.5f square inch is equal to %.5f square centimeters.%n", valueArea, valueArea * 6.4516);
                break;
            case 2:
                System.out.printf("%.5f square feet is equal to %.5f square meters.%n", valueArea, valueArea * 0.092903);
                break;
            case 3:
                System.out.printf("%.5f square yard is equal to %.5f square meters.%n", valueArea, valueArea * 0.836127);
                break;
            case 4:
                System.out.printf("%.5f square miles is equal to %.5f square kilometers.%n", valueArea, valueArea * 2.58999);
                break;
            case 5:
                System.out.printf("%.5f hectares is equal to %.5f acres.%n", valueArea, valueArea * 2.47105);
                break;
            case 6:
                System.out.printf("%.5f acres is equal to %.5f square meters.%n", valueArea, valueArea * 4046.86);
                break;
            default:
                System.out.printf("Invalid choice");
                break;
            }
        }

        
        /*switch(userChoice) {
            case 1:
                System.out.printf("%.5f inches is equal to %.5f centimeters.%n", value, value * 2.54);
                break;
            case 2:
                System.out.printf("%.5f feet is equal to %.5f inches.%n", value, value * 12);
                break;
            case 3:
                System.out.printf("%.5f yard is equal to %.5f feet.%n", value, value * 3);
                break;
            case 4:
                System.out.printf("%.5f miles is equal to %.5f meteres.%n", value, value * 1.60934);
                 break;
            case 5:
                System.out.printf("%.5f miles is equal to %.5f feet.%n", value, value * 0.9144 );
                break;
            case 6:
                System.out.printf("%.5f feet is equal to %.5f inches.%n", value, value * 5280);
                break;
            case 7:
                System.out.printf("%.5f killometers is equal to %.5f miles.%n", value, value * 1.60934);
                break;
            case 8:
                System.out.printf("%.5f kilometers is equal to %.5f miles.%n", value, value * 0.621371);
                break;
            case 9:
                System.out.printf("%.5f ounces is equal to %.5f grams.%n", value, value * 28.3495);
                break;
            case 10:
                System.out.printf("%.5f pounds is equal to %.5f kilograms.%n", value, value * 0.453592);
                break;
            case 11:
                System.out.printf("%.5f kilograms is equal to %.5f pounds.%n", value, value * 2.20462);
                break;
            case 12:
                System.out.printf("%.5f tonnes is equal to %.5f kilograms.%n", value, value * 1000);
                break;
            case 13:
                System.out.printf("%.5f celsius is equal to %.5f fahrenheit.%n", value, (value * (9/5)+32));
                break;
            case 14:
                System.out.printf("%.5f fahrenheit is equal to %.5f celsius.%n", value, (value - 32) * (5/9));
                break;
            case 15:
                System.out.printf("%.5f kelvin is equal to %.5f celsius.%n", value, value - 273.15);
                break;
            case 16:
                System.out.printf("%.5f celsius is equal to %.5f kelvin.%n", value, value + 273.15);
                break;
            case 17:
                System.out.printf("%.5f square inch is equal to %.5f square centimeters.%n", value, value * 6.4516);
                break;
            case 18:
                System.out.printf("%.5f square feet is equal to %.5f square meters.%n", value, value * 0.092903);
                break;
            case 19:
                System.out.printf("%.5f square yard is equal to %.5f square meters.%n", value, value * 0.836127);
                break;
            case 20:
                System.out.printf("%.5f square miles is equal to %.5f square kilometers.%n", value, value * 2.58999);
                break;
            case 21:
                System.out.printf("%.5f hectares is equal to %.5f acres.%n", value, value * 2.47105);
                break;
            case 22:
                System.out.printf("%.5f acres is equal to %.5f square meters.%n", value, value * 4046.86);
                break;
            case 23:
                System.out.printf("%.5f acres is equal to %.5f square meters.%n", value, value * 4046.86);
                break;
            case 24:
                System.out.printf("%.5f acres is equal to %.5f square meters.%n", value, value * 4046.86);
                break;
            case 25:
                 System.out.printf("%.5f teaspoon is equal to %.5f milliliters .%n", value, value * 4.92892);
                 break;
            case 26:
                 System.out.printf("%.5f tablespoon is equal to %.5f milliliters .%n", value, value *14.7868);
                 break;
            case 27:
                 System.out.printf("%.5f fluid ounce is equal to %.5f milliliters .%n", value, value*29.5735);
                 break;
            case 28:
                 System.out.printf("%.5f cup is equal to %.5f milliliters .%n", value, value*237);
                 break;
            case 29:
                 System.out.printf("%.5f pint is equal to %.5f milliliters .%n", value, value*473.176);
                 break;
            case 30:
                 System.out.printf("%.5f quarts is equal to %.5f milliliters .%n", value, value*946.353);
                 break;
            case 31:
                 System.out.printf("%.5f gallon is equal to %.5f liters .%n", value, value*3.78541);
                 break;           
            default:
                System.out.printf("invalid choice");
                break;
        } */
        scanner.close();
    
}
}
