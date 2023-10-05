/*
* File: MainConsole.java
* Author: Bodnár Bence
* Copyright: 2023, Bodnár Bence
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/egonixaimgod
* Licenc: GNU GPL
*/

package models;

import java.io.FileNotFoundException;

public class MainConsole {

    public void showData() throws FileNotFoundException {

        new Filereader().LoadData();

    }
}
