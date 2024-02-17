package com.teachmeskills.lesson12.task2.runner;

import com.teachmeskills.lesson12.constants.iConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Runner class displays information from the line about the document number, phone number and email.
 */
public class Runner implements iConstants {
    public static void main(String[] args) {
        String st = "My name is Ivan, I have a document number 4573-8954-23. " +
                "My phone is +(29)7652390. My email: Groviton_12@mail.ru";


        Pattern ptNumber = Pattern.compile(numberDocument);
        Matcher matNumber = ptNumber.matcher(st);

        Pattern ptTelefon = Pattern.compile(numberTelefon);
        Matcher matTelefon = ptTelefon.matcher(st);

        Pattern ptEmail = Pattern.compile(email);
        Matcher matEmail = ptEmail.matcher(st);

        while(matNumber.find()&&matTelefon.find()&&matEmail.find()){
            System.out.println("№ документа: " + matNumber.group());
            System.out.println("Телевон: " + matTelefon.group());
            System.out.println("Email: "+ matEmail.group());
        }
    }
}

