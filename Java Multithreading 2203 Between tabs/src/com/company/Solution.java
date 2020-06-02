package com.company;

/*
2203 Between tabs
The getPartOfString method should return a substring between the first and second tabs.
Throw TooShortStringException on invalid data.
The TooShortStringException class does not change.

Requirements:
1. The TooShortStringException class must be a descendant of the Exception class.
2. The getPartOfString method should take a string as a parameter.
3. In the event that the string passed to the getPartOfString method contains less than 2 tabs, a TooShortStringException will be thrown.
4. The getPartOfString method should return a substring between the first and second tabs.

*/

import java.util.TooManyListenersException;

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException{
        if (string == null || string.isEmpty())
            throw new TooShortStringException();

        String[] strs = string.split("\t");
        if (strs.length<3)
            throw new TooShortStringException();

        return strs[1];
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
