package org.pursuit.junittestingappfromscratchpartdeux;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberHelperUnitTest {

    private NumberHelper numberHelper;

    @Before
    public void setUp() throws Exception{
        numberHelper = NumberHelper.getSingleInstance();
    }

    @Test
    public void check_odd_or_even(){
        int number = 11;

        String expected = "odd";
        String actual = numberHelper.oddOrEven(number);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void check_odd_or_even_with_number_zero(){
        int number = 0;

        String expected = "even";
        String actual = numberHelper.oddOrEven(number);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void check_divisible_by_5(){
        int number = 15;

        boolean expected = true;
        boolean actual = numberHelper.divisibleBy5(number);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void check_divisible_by_5_with_number_not_divisible_by_5(){
        int number = 111;

        boolean expected = false;
        boolean actual = numberHelper.divisibleBy5(number);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void check_multiples_of_N(){
        int baseNumber = 3;
        int range = 10;

        int[] expected = {3,6,9,12,15,18,21,24,27,30};
        int[] actual = numberHelper.multiplesOfN(baseNumber, range);

        Assert.assertArrayEquals(expected, actual);
    }

    //use to catch an exception
    @Test (expected = IllegalArgumentException.class)
    public void check_multiples_of_N_with_negative_range(){
        int baseNumber = 3;
        int range = -2;

        int[] expected = {3,6,9,12,15,18,21,24,27,30};
        int[] actual = numberHelper.multiplesOfN(baseNumber, range);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void check_string_to_number(){
        String number = "12";

        int expected = 12;
        int actual = numberHelper.stringToNumber(number);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_string_to_number_with_null_value(){
        String number = null;

        int expected = 0;
        int actual = numberHelper.stringToNumber(number);

        Assert.assertEquals(expected, actual);
    }

    @Test (expected = NumberFormatException.class)
    public void check_string_to_number_with_spaces_and_alphabets(){
        String number = "12 abc";

        int expected = 12;
        int actual = numberHelper.stringToNumber(number);

        Assert.assertEquals(expected, actual);
    }

    @Test (expected = NumberFormatException.class)
    public void check_string_to_number_with_only_alphabets(){
        String number = "abc";

        int expected = 0;
        int actual = numberHelper.stringToNumber(number);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_array_sum(){
        int[] nums = {1,2,3,4};

        int expected = 10;
        int actual = numberHelper.arraySum(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_largest_number(){
        int[] nums = {10,20,3,4};

        int expected = 20;
        int actual = numberHelper.largestNumber(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void check_number_sort(){
        int[] numbers = {3,11,4,12};

        int[] expected = {3,4,11,12};
        int[] actual = numberHelper.numberSort(numbers);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void check_number_sort_long_way(){
        int[] numbers = {3,11,4,12};

        int[] expected = {3,4,11,12};
        int[] actual = numberHelper.numberSortLongWay(numbers);

        Assert.assertArrayEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception{
        numberHelper = null;
    }
}
