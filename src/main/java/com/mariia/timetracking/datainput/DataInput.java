package com.mariia.timetracking.datainput;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DataInput {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        HashMap<String, List<Date>> nameToDatesMap = new HashMap<>();

        System.out.println("Enter name");

        while(console.hasNext()) {

        String name = console.nextLine();

        System.out.println("Enter date");

        String textFromConsole = console.nextLine();

            try {
                Date newDate = new SimpleDateFormat("dd.MM.yyyy").parse(textFromConsole);
                var existedList = nameToDatesMap.get(name);
                if (existedList != null) {
                    existedList.add(newDate);

                    System.out.println("Name: " + name);
                    for (Date date : existedList) {
                        System.out.println(date);
                    }

                } else {
                    var list = new ArrayList<Date>();
                    list.add(newDate);
                    nameToDatesMap.put(name, list);

                    System.out.println("Name: " + name);
                    for (Date date : list) {
                        System.out.println(date);
                }

            }

            } catch (ParseException e) {
                System.out.println("Вы ввели неверный формат даты");
            }

            System.out.println("Enter name");

        }

    }
}
