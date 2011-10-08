package com.hendrysuwanda.algorithm.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendarAddNDay {

	/**
     * @param args
     */
    public static void main(String[] args) {
         // TODO Auto-generated method stub
         SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
         Date date = new Date();
         int addDay = 30; //134 hari
         System.out.println("Sekarang tanggal : " + format.format(date));

         Calendar c = Calendar.getInstance();
         c.setTime(date);

         c.add(Calendar.DAY_OF_WEEK, addDay);
         System.out.println("Setelah di tambah " + addDay + " hari menjadi : " + format.format(c.getTime()));
    }
}
