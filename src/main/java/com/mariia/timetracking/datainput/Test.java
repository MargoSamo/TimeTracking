package com.mariia.timetracking.datainput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {

        String stringDate = "0121995";
        try {
            Date date = new SimpleDateFormat("dd.MM.yyyy").parse(stringDate);
            System.out.println("Date is : " + date);
        } catch (ParseException e) {
            System.out.println("Вы ввели неверный формат даты");
        }
    }
}
