package features;

import java.util.Scanner;

public class WelcomeScreen {

    private static void welcome(){
        System.out.println("Hello ! hope you enjoy using me, i am file Handler Application i will be at your Service :D ");
        System.out.println("-------------------------    ---------    -----------------------------");
        System.out.println("-------------------------    ---------    -----------------------------");
        System.out.println("This Application is used to handle files");
        System.out.println("-------------------------    ---------    -----------------------------");
        System.out.println("-------------------------    ---------    -----------------------------");
        System.out.println("I was made by Ahmed Mabrouk SW testing engineer from the IoT _Vois Egypt");
        System.out.println("-------------------------    ---------    -----------------------------");
        System.out.println("Ready ???? Lets Start !!! ");
    }

     private static void listOfOptions (){
        System.out.println("-------------------------    ---------    -----------------------------");
        System.out.println("-------------------------    ---------    -----------------------------");
        System.out.println("MAIN MENU");
        System.out.println("        User Interface : list all files, search files, add files, delete files");
        System.out.println("        Exit Program");
    }
     private static String takeUserOption(){
        System.out.println("Enter your option: ");
        Scanner scan = new Scanner(System.in);
        String selectedOption = scan.nextLine();
        return selectedOption;
    }

    static public void runWelcomeScreen()
    {
        welcome();
        listOfOptions();
        takeUserOption();
    }
}
