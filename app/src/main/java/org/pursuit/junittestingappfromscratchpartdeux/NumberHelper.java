package org.pursuit.junittestingappfromscratchpartdeux;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NumberHelper {

    private static NumberHelper singleInstance;

    private NumberHelper() {
    }

    public static NumberHelper getSingleInstance() {
        if (singleInstance != null) {
            return singleInstance;
        }
        return singleInstance = new NumberHelper();
    }

    public String oddOrEven(int input) {
        if (input % 2 == 0) {
            return "even";
        }
        return "odd";
    }

    //best way to do even/odd aka any problem that only requires 2 states
    public boolean isEven(int input) {
        if (input % 2 == 0) {
            return true;
        }
        return false;
    }


    public boolean divisibleBy5(int input) {
        if (input % 5 == 0) {
            return true;
        }
        return false;
    }

    public int[] multiplesOfN(int baseNumber, int range) {
        if (range < 0) {
            throw new IllegalArgumentException("Range cannot be less than 0");
        }
        int[] result = new int[range];
        for (int i = 0; i < range; i++) {
            result[i] = baseNumber * (i + 1);
        }
        return result;
    }

    public int stringToNumber(String number) {
        try {
            if (number == null) {
                return 0;
            }
        }catch (NumberFormatException nfe){
            nfe.printStackTrace();
        };
        return Integer.parseInt(number.trim());
    }

    public int arraySum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) {
            sum += i;
        }
        return sum;
    }

    public int largestNumber(int[] numbers) {
        int largest = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public int[] numberSort(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }

    public int[] numberSortLongWay(int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length-1; i++) {
                if(numbers[i] > numbers[i + 1]){
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
        }
        return numbers;
    }




}
