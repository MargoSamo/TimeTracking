package com.mariia.timetracking.datainput;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Test {

    public static void main(String[] args) throws ParseException {

        Date date = new SimpleDateFormat("dd.MM.yyyy").parse("12.12.2022");
        Date date2 = new SimpleDateFormat("dd.MM.yyyy").parse("13.12.2022");
        Date date3 = new SimpleDateFormat("dd.MM.yyyy").parse("14.12.2022");

        HashMap<String, List<Date>> nameToDatesMap = new HashMap<>();

        var name = "Vasy";
        var existedList = nameToDatesMap.get(name);
        if (existedList != null) {
            existedList.add(date);
        } else {
            var list = new ArrayList<Date>();
            list.add(date);
            nameToDatesMap.put(name, list);
        }

         name = "Vasy";
         existedList = nameToDatesMap.get(name);
        if (existedList != null) {
            existedList.add(date2);
        } else {
            var list = new ArrayList<Date>();
            list.add(date2);
            nameToDatesMap.put(name, list);
        }

         name = "Vasy";
         existedList = nameToDatesMap.get(name);
        if (existedList != null) {
            existedList.add(date3);
        } else {
            var list = new ArrayList<Date>();
            list.add(date3);
            nameToDatesMap.put(name, list);
        }


        System.out.println(nameToDatesMap);

    }
}
