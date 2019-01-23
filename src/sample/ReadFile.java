package sample;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class ReadFile {
    /*
    public static void main(String[] args) {
        openFile();
        readfile();
        out();
    }
    */

    public static String[][] m = new String[20][2];
    static Scanner scn;

    public static void openFile(){
        try {
            scn = new Scanner(new File("src/sample/1.txt"));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Нет файла");
        }

    };
    public static void readfile(){
        while (scn.hasNext()){
            for (int i = 0; i < m.length ; i++) {
                for (int j = 0; j < m[i].length ; j++) {
                    m[i][j] = scn.next();
                }
            }
        }

    };
     //вывод на экран масива
     public static void out(){
        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m[i].length ; j++) {
                System.out.print(m[i][j] + " ");
            }

        }
    };

}


