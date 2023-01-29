package screens;

import utils.Vars;

import java.util.Scanner;

public class WelcomeScreen {

    public static void welcomeMSG(){
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
        System.out.println("==========================================  ");
        System.out.println("==========================================  ");
        System.out.println("MAIN MENU");
        System.out.println("        User Interface : list all files, search files, add files, delete files");
        System.out.println("        Exit ");
    }
     private static String takeUserOption(){
        System.out.println("Enter your option: ");
        Scanner scan = new Scanner(System.in);
        String selectedOption = scan.nextLine();
        return selectedOption;
    }


    static private boolean assertSelectedOption(String selectedOption){
        if (selectedOption.equalsIgnoreCase(Vars.USER_INTERFACE.toString().replace("_"," ")))
        {
            return true;
        }
        if (selectedOption.equalsIgnoreCase(Vars.EXIT.toString()))
        {
            return true;
        }
        else{
            return false ;
        }
    }
    static private void selectOption(String selectedOption)
    {
        Vars var = null;
        switch (selectedOption.toLowerCase()){
            case "user interface":
                var = Vars.USER_INTERFACE;
                break;
            case "exit":
                var = Vars.EXIT;
                break;
        }

        switch (var){
            case USER_INTERFACE:
                UserInterfaceScreen.runUIScreen();
                break;
            case EXIT:
                System.out.println("Thank you for using me!!" );
                System.exit(0);

        }

    }
    static public void runWelcomeScreen()
    {
        String selectedOption = "" ;
        do {

            listOfOptions();
            selectedOption = takeUserOption();

        }while(!assertSelectedOption(selectedOption));


       selectOption(selectedOption);

    }


}
