package org.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
    public static String generateLog(String message) {
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss:SSSSSS");
        return "[" + sdf.format(Calendar.getInstance().getTime()) +
                "][log] " + message + "\n";
    }
}
