package com.mariia.timetracking.datainput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DataInput {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        try {
            Date date = new SimpleDateFormat("dd.MM.yyyy").parse(name);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Вы ввели неверный формат даты");
        }

    }
}
