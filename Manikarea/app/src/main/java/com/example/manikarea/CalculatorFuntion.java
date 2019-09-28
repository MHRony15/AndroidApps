package com.example.manikarea;

public class CalculatorFuntion {
    public static String add(String val1,String val2){
        double a= Double.parseDouble(val1);
        double b= Double.parseDouble(val2);
        double ans = a+b;
        String result =String.format("%.2f",ans);
        return result;
    }
    public static String sub(String val1,String val2){
        double a= Double.parseDouble(val1);
        double b= Double.parseDouble(val2);
        double ans = a-b;
        String result =String.format("%.2f",ans);
        return result;
    }
    public static String mul(String val1,String val2){
        double a= Double.parseDouble(val1);
        double b= Double.parseDouble(val2);
        double ans = a*b;
        String result =String.format("%.2f",ans);
        return result;
    }
    public static String div(String val1,String val2){
        double a= Double.parseDouble(val1);
        double b= Double.parseDouble(val2);
        double ans = a/b;
        String result =String.format("%.2f",ans);
        return result;
    }
}
