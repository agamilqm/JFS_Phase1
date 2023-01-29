package screens;

import features.FileFeatures;

import java.util.Scanner;

public class UserInterfaceScreen {
    public static void runUIScreen()
    {
        userInterface();
        selectOption();
    }
    private static void userInterface()
    {
        System.out.println("User Interface MENU ");
        System.out.println("==========================================  ");
        System.out.println("==========================================  ");
        System.out.println("    List all");
        System.out.println("    Add");
        System.out.println("    Search");
        System.out.println("    Delete");
        System.out.println("    Return");
    }

    private static void selectOption()
    {
        System.out.println("Enter your option: ");
        String selectedOption = new Scanner(System.in).nextLine();



        switch (selectedOption.toLowerCase()){
            case "list all":

                break;
            case "add":
                FileFeatures.addFile();
                UserInterfaceScreen.runUIScreen();
                break;
            case "search":

                UserInterfaceScreen.runUIScreen();
                break;
            case "delete":
                FileFeatures.deleteFile();
                UserInterfaceScreen.runUIScreen();
                break;
            case "return":
                WelcomeScreen.runWelcomeScreen();
                break;
            default:
                System.out.println("you have entered wrong option");
                selectOption();
        }

    }

    public static void main(String[] args)
    {
        selectOption();
    }


}
