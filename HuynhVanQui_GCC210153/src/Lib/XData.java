/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author MY LAPTOP
 */
public class XData {
    public static String pattern = "dd/MM/yyyy";
    public static SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    
    public static Object stirngToDate(String text){
        try {
            return sdf.parse(text);
        } catch (ParseException ex) {
            System.err.println("Parse Failed");
        }
        return null;
    }
    
    public static String DataToString(Object o){
        if (o!=null) {
            Date d = (Date) o;
            return sdf.format(d);
        }
        return "";
    }
}
