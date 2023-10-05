/*
* File: MainController.java
* Author: Bodnár Bence
* Copyright: 2023, Bodnár Bence
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/egonixaimgod
* Licenc: GNU GPL
*/

package controllers;

import java.io.FileNotFoundException;

import models.MainConsole;

public class MainController {

    public MainController() throws FileNotFoundException {
        new MainConsole().showData();

    }

}
