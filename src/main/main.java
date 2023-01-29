import screens.UserInterfaceScreen;
import screens.WelcomeScreen;
import utils.Vars;

public class main {

    public static void main(String[] args)
    {
          WelcomeScreen.welcomeMSG();

      while(true){
        var moveTo = WelcomeScreen.runWelcomeScreen();

        switch (moveTo){
            case USER_INTERFACE:
                  UserInterfaceScreen.enterUIScreen();
                  break;
        }
      }



    }
}
