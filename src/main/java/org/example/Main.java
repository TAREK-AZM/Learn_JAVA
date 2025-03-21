package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        float []notes;
        notes = new float[10];
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        notes[i -1] = sc.nextFloat();
        }
        for (int i = 1; i <= 5; i++) {
            System.out.print(notes[i - 1] + " ");
        }
    }
}