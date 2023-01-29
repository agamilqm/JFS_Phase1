package features;

import screens.UserInterfaceScreen;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class AddFiles {
    public static void addFile(String fileName){

        File path = new File("src/main/resources/DB");
        String answer = "";

        File addedFile = new File("src/main/resources/DB/"+fileName);
        if (Arrays.stream(path.list()).toList().contains(fileName)){
            System.out.println("This File name already exist, do you want to overwrite it ? \n");
            answer = new Scanner(System.in).nextLine();

        }
        if ("yes".equalsIgnoreCase(answer)) {
            try {
                addedFile.createNewFile();
            }catch (Exception e){
                System.out.println("Failed to created file");
            }
        }
        else {
            UserInterfaceScreen.runUIScreen();
        }

    }



}
