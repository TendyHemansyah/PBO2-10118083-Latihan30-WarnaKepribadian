/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan30.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author Tendy
 * Nama     : Tendy Hermansyah
 * Kelas    : PBO2
 * Nim      : 10118083
 * Deskripsi Program : Cakep
 */
public class PBO210118083Latihan30Cakep {
    public static final String  BLACK               = "\u001B[30m";
    public static final String  RED                 = "\u001B[31m";
    public static final String  GREEN               = "\u001B[32m";
    public static final String  YELLOW              = "\u001B[33m";
    public static final String  BLUE                = "\u001B[34m";
    public static final String  MAGENTA             = "\u001B[35m";
    public static final String  CYAN                = "\u001B[36m";
    public static final String  WHITE               = "\u001B[37m";
    public static final String  RESET               = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%sKAMU %sNGERJAIN SENDIRI %sLATIHAN 17 SAMPE %sLATIHAN 30 INI?%n",
                RED, GREEN, YELLOW, MAGENTA);
        System.out.printf("Jawab %s(Yoi/Enggak)\t: %s", RED, RESET);
        
        if(scanner.next().equals("Yoi")) 
            System.out.printf("%sCakep Bener. %sGood Job%n", RED, MAGENTA);
        else
            System.out.printf("%sTetep Cakep Sih%n. %sSing penting paham konsepnya yee%n"
                    + "%sKeep the code works dude%n"
                    , RED, CYAN, RESET);
    }
}
