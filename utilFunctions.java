package com.match.date;
import java.util.*;  

class UtilFunctions {

static int lengthNumber (int number) {
    int length = 0;
    long temp = 1;
    while (temp <= number) {
        length++;
        temp *= 10;
    }
    return length;
}

}