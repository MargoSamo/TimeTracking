package com.mariia.timetracking.datainput;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class DataInput {

    public static void main(String[] args) {

        ArrayList<Date> dates = new ArrayList<Date>();

        Scanner console = new Scanner(System.in);
        while(console.hasNext()) {
        String name = console.nextLine();
            try {
                Date newDate = new SimpleDateFormat("dd.MM.yyyy").parse(name);
                // System.out.println(date);
                dates.add(newDate);
                for (Date date : dates) {
                    System.out.println(date);
                }

            } catch (ParseException e) {
                System.out.println("Вы ввели неверный формат даты");
            }
        }
    }
}
