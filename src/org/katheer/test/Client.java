package org.katheer.test;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.util.ResourceBundle;

public class Client {
    public static void main(String[] args) {
        Locale l1 = new Locale("en", "US");
        Locale l2 = new Locale("tm", "IN");
        Locale l3 = new Locale("it", "IT");

        NumberFormat nf = NumberFormat.getInstance(l1);
        System.out.println(nf.format(12392782.986896));

        DateFormat df = DateFormat.getDateInstance(0, l2);
        System.out.println(df.format(new Date()));

        ResourceBundle res = ResourceBundle.getBundle("org/katheer/i18n" +
                "/message", l2);
        System.out.println("Hello " + res.getString("name") + ". " +
                res.getString("message"));
    }
}
