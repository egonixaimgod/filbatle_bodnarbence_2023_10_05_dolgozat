/*
* File: Filereader.java
* Author: Bodnár Bence
* Copyright: 2023, Bodnár Bence
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/egonixaimgod
* Licenc: GNU GPL
*/

package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {

    String faljnev = "filbt.txt";
    ArrayList<Employee> emplist = new ArrayList<>();

    public void LoadData() throws FileNotFoundException {

        File file = new File(faljnev);
        Scanner sc = new Scanner(file, "utf-8");

        while (sc.hasNext()) {

            String line = sc.nextLine();
            String[] lineArray = line.split(":");
            Employee emp = new Employee();

            emp.setNev(lineArray[0]);
            emp.setTelepules(lineArray[1]);
            emp.setCim(lineArray[2]);
            emp.setSzuletes(lineArray[3]);
            emp.setFizetes(Integer.parseInt(lineArray[4]));
            this.emplist.add(emp);
            System.out.println(line);
        }
        sc.close();
    }
}
