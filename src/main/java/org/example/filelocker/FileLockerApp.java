package org.example.filelocker;
import org.example.filelocker.screens.WelcomeScreen;

public class FileLockerApp {

    public static void main(String[] args) {

        WelcomeScreen welcome = new WelcomeScreen();
        welcome.introWS();
        welcome.GetUserInput();


    }
}
