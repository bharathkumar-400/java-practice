class SwitchAll {

    public static void main(String[] args) {

        int day = 3;
        switch(day) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid Day");
        }


        int month = 5;
        switch(month) {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Invalid Month");
        }


        int m = 12;
        switch(m) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Summer");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Monsoon");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid Month");
        }


        int a = 10, b = 5;
        char op = '+';

        switch(op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': System.out.println(a / b); break;
            default: System.out.println("Invalid Operator");
        }

        String signal = "red";

        switch(signal) {
            case "red": System.out.println("Stop"); break;
            case "yellow": System.out.println("Get Ready"); break;
            case "green": System.out.println("Go"); break;
            default: System.out.println("Invalid Signal");
        }


        char ch = 'a';

        switch(ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }


        // 7️⃣ Grade Description
        char grade = 'A';

        switch(grade) {
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Very Good"); break;
            case 'C': System.out.println("Good"); break;
            case 'D': System.out.println("Average"); break;
            default: System.out.println("Fail");
        }


        // 8️⃣ Vehicle Type Based on Wheels
        int wheels = 2;

        switch(wheels) {
            case 2: System.out.println("Bike"); break;
            case 3: System.out.println("Auto"); break;
            case 4: System.out.println("Car"); break;
            case 6: System.out.println("Truck"); break;
            default: System.out.println("Unknown Vehicle");
        }

    }
}