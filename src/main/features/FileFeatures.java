package features;

import screens.UserInterfaceScreen;
import utils.FileHandlerUtils;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FileFeatures {
    private static Scanner scanner = new Scanner(System.in);
    private static File rootPath = new File("src/main/resources/DB");
    public static void addFile(){
        System.out.println("Enter file name or 'return': ");
        String fileName = scanner.nextLine();
        if (fileName.equalsIgnoreCase("return")) return;
        String answer = "";

        File addedFile = new File("src/main/resources/DB/"+fileName);
        if (Arrays.stream(rootPath.list()).toList().contains(fileName)){
            System.out.println("This File name already exist, do you want to overwrite it ? \n");
            answer = scanner.nextLine();
            if ("yes".equalsIgnoreCase(answer)) {
                try {
                    addedFile.createNewFile();
                    return;
                }catch (Exception e){
                    System.out.println("Failed to created file");
                }
            }
            else {
                UserInterfaceScreen.runUIScreen();
            }

        }

        try {
            addedFile.createNewFile();
        }catch (Exception e){
            System.out.println("Failed to created file");
        }

    }


    public static void deleteFile ()
    {
        System.out.println("Enter the file you want to delete or 'return' : ");
        String fileName = scanner.nextLine();
        if (fileName.equalsIgnoreCase("return")) return;
        if (!Arrays.stream(rootPath.list()).toList().contains(fileName)) {
            System.out.println("File Not Found ");
            return ;

        } else {
            File deleteThisFile = new File(rootPath.getAbsoluteFile().toString()+"\\"+fileName);
            deleteThisFile.delete();
            System.out.println("File Deleted Successfully");
        }

    }

    public static void listFiles()
    {
        var list = rootPath.list();
        FileHandlerUtils.bubbleSortStringsAscending(list);
        for (var i : list){
            System.out.println(i);
        }
    }

    public static void searchFile()
    {
        System.out.println("Enter the file name or 'return' : ");
        String fileName = scanner.nextLine();
        if(fileName.equalsIgnoreCase("return")) return;
        System.out.println(FileHandlerUtils.linerSearchStrings(rootPath.list(), fileName));
    }

}
