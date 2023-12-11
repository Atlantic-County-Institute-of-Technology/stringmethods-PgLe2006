import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Takes a string of numbers and put it into an array
        String numberrrs = "89 111 117 114 32 112 114 111 103 114 97 109 32 115 104 111 117 108 100 32 102 105 114 115 116 32 100 101 99 111 100 101 32 116 104 105 115 32 98 108 111 99 107 32 111 102 32 116 101 120 116 32 97 110 100 32 100 105 115 112 108 97 121 32 105 116 46 32 84 104 101 110 44 32 112 114 111 109 112 116 32 116 104 101 32 117 115 101 114 32 102 111 114 32 97 32 110 97 109 101 46 32 84 97 107 101 32 116 104 97 116 32 110 97 109 101 32 97 110 100 32 111 117 116 112 117 116 32 116 104 101 32 102 111 108 108 111 119 105 110 103 58 32 84 104 101 32 110 97 109 101 32 105 110 32 114 101 118 101 114 115 101 44 32 116 104 101 32 82 101 118 101 114 115 101 32 111 114 100 101 114 32 105 110 32 65 76 76 32 67 65 80 73 84 65 76 83 44 32 116 104 101 32 111 114 105 103 105 110 97 108 32 115 116 114 105 110 103 32 117 115 105 110 103 32 67 97 77 101 76 32 99 65 115 69 44 32 97 110 100 32 102 105 110 97 108 108 121 32 116 104 101 32 111 114 105 103 105 110 97 108 32 115 116 114 105 110 103 32 105 110 32 65 83 67 73 73 46 32 68 79 32 78 79 84 32 85 83 69 32 65 78 89 32 83 84 82 73 78 71 32 77 65 78 73 80 85 76 65 84 73 79 78 32 77 69 84 72 79 68 83 46 13 10";
        String[] numbers = numberrrs.split(" ");
        // Goes through each index in the array and converts it into an integer then to a character
        for (String i : numbers) {
            int strToInt = Integer.parseInt(i);
            char intToStr = (char)strToInt;
            System.out.print(intToStr);
        }
        // Creates a scanner that puts the users input in a variable
        Scanner scanner = new Scanner(System.in);
        System.out.println("give name right now");
        String getUsersName = scanner.nextLine();
        // Variables used to hold the different verisions of the user's name
        String reversedCap = "";
        String reversed = "";
        String camelCase = "";
        String ascii = "";
        boolean capYes = true;
        // Goes through each letter in the name then converts the string to char then an int 
        for (String i : getUsersName.split("")) {
            char letterToChar = i.charAt(0);
            int charToInt = (int)letterToChar;
            int charToInt2 = charToInt;

            ascii = ascii + charToInt;
            // Checks if the last letter was capital the converts it lowercase if it was
            if (capYes) {
                if (charToInt2 < 123 && charToInt2 > 96) {
                    charToInt2 -= 32;
                }
            } else {
                if (charToInt2 < 91 && charToInt2 > 64) {
                    charToInt2 += 32;
                }
            }
            // Switches between true and false so it skips over a letter
            capYes = !capYes;
            // Checks if the letter is capital then makes it lowercase
            if (charToInt < 123 && charToInt > 96) {
                charToInt -= 32;
            }
            // Turns the integers back into characters 
            char nameCapital = (char)charToInt;
            char nameCamel = (char)charToInt2;
            // Adds the letter onto the variable 
            reversedCap = nameCapital + reversedCap;
            reversed = i + reversed;
            camelCase = camelCase + nameCamel;
        }
        //Prints out all the variants of the user's name
        System.out.println("Name reversed: " + reversed);
        System.out.println("Name capital reversed: " + reversedCap);
        System.out.println("Name camel case: " + camelCase);
        System.out.println("ASCII " + ascii);
    }
}
