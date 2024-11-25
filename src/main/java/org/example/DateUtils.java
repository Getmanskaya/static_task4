package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static Date getCurrentDate() {
        Date current = new Date();
        return current;
    }

    public static int addDaysToDate(int days) {
        int dayYouWishToAdd = 2;
        Date yoursDate = new Date();
        int resultDaysAdding = yoursDate.getDate() + dayYouWishToAdd;
        return resultDaysAdding;
    }

    public static String formatDate(Date date) {
        Date current = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMMMMM-YYYY");
        String dateToString = formatter.format(current);
        return dateToString;
    }

    public static void main(String[] args) {
        System.out.println(getCurrentDate());
        System.out.println(addDaysToDate(2));
        System.out.println(formatDate(new Date()));
    }
}