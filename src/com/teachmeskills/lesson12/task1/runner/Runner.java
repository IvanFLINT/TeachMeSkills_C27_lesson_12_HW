package com.teachmeskills.lesson12.task1.runner;

import com.teachmeskills.lesson12.task1.constants.iConstants;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Runner class prints abbreviations from a string
 */
public class Runner implements iConstants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String numberDocument = sc.nextLine();
        Pattern pt = Pattern.compile(reg,Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pt.matcher(numberDocument);
while(matcher.find()){
    System.out.println(matcher.group());
        }
    }
}
