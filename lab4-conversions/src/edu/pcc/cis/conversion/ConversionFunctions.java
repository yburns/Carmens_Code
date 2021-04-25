package edu.pcc.cis.conversion;

/**
 * A library of conversion functions
 * CB Added a series of corrections to the existing methods & added a new method of fahrenheitToCelsius.
 * @author Cara Tang, and Carmen Burns
 * @version 2021.04.25
 */

public class ConversionFunctions {


    //  public class ConversionFunctions {
    private static final String[] MONTH_NAMES = {"", "January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October", "November", "December"};

    /**
     * Convert a temperature from celsius to fahrenheit
     *
     * @param celsius temperature in degrees celsius
     * @return the fahrenheit equivalent of the given celsius temp
     */
    public static int celsiusToFahrenheit(int celsius) {
        return (int) (Math.round(9.0 * celsius / 5) + 32);
    }

    /**
     * Convert a temperature from fahrenheit to celsius
     *
     * @param fahrenheit temperature in degrees fahrenheit
     * @return the celsius equivalent of the given fahrenheit temp
     */

    public static int fahrenheitToCelsius(int fahrenheit) {
            return ((fahrenheit -32)*5/9);
    }
    /**
     * Convert cups to tablespoons. There are 16 tablespoons in a cup.
     *
     * @param cups the number of cups to convert
     * @return the number of tablespoons in the given number of cups
     */
    public static int cupsToTablespoons(int cups) {
        // This method does not work correctly. You will fix it as you work through the tests.
        // Remove these comments once it is implemented correctly.
        int tblSpoon = 0;
         if (cups > 0) {
            tblSpoon = cups * 16;
            return tblSpoon;
           }
        return tblSpoon;
    }

       /**
         * Convert a month number to the string name of the month
         * @param monthNum a month number, from 1 to 12
         * @return the name of the given month, or empty string if the month number is invalid
        */
        public static String monthNumToMonthName(int monthNum) {
            // This method does not work correctly. You will fix it as you work through the tests.
            // Remove these comments once it is implemented correctly.
            int size = MONTH_NAMES.length;
            if((monthNum <= size) && (monthNum < 13)){
               return MONTH_NAMES[monthNum];
        }
            return "";
    }
}

