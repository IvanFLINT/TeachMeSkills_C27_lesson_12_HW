package com.teachmeskills.lesson12.constants;

/**
 * Regular expressions
 */
public interface iConstants {
    String reg = "\\b[A-ZА-Я]{2,6}\\b";
    String numberDocument = "\\d{4}-\\d{4}-\\d{2}";
    String numberTelefon ="\\+\\(\\d{2}\\)\\d{7}";
    String email = "\\b\\w+@[a-z]+\\.[a-z]{2,3}+\\b";
}
