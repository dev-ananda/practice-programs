package dev.ananda.efficient;

public class MultipleOfNumber {

    //Write an Efficient Method to Check if a Number is Multiple of 3

    //reference
    // https://www.geeksforgeeks.org/write-an-efficient-method-to-check-if-a-number-is-multiple-of-3/

    public static int isMultipleOf3(int num) {

        System.out.println("[ isMultipleOf3() ] Number >> " + num);

        int odd_count = 0, even_count = 0;
        num = Math.abs(num);

        if (num == 0) {
            return 1;
        }
        if (num == 1) {
            return 0;
        }

        while (0 != num) {
            /* If odd bit is set then
        increment odd counter */
            if ((num & 1) != 0) {
                odd_count++;
            }
            if ((num & 2) != 0) {
                even_count++;
            }
            num >>= 2;
        }
        return isMultipleOf3(odd_count - even_count);
    }

    public static void main(String[] args) {
        int num = 367423582;

        boolean isMultipleOf3 = isMultipleOf3(num) != 0;
        if (isMultipleOf3) {
            System.out.println(num + " is multiple of 3");
        } else {
            System.out.println(num + " is not multiple of 3");
        }
    }

}
