package edu.pcc.cis.conversion;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * A series of tests for the library of conversion functions.
 *
 * @author Carmen Burns
 * @version 2021.04.25
 * Finsihed testing assignment
 */

public class ConversionFunctionsTest {


    /* public class ConversionFunctionsTest { */

        // celsiusToFahrenheit tests ---------------------------------------------------------------------------
        @Test
        public void celsius0IsFahrenheit32() {
            assertEquals(32, ConversionFunctions.celsiusToFahrenheit(0));
        }

        @Test
        public void celsius16IsFahrenheit61() {
            assertEquals(61, ConversionFunctions.celsiusToFahrenheit(16));
        }

        // TODO: Write a test for a negative celsius that converts to a positive fahrenheit
        @Test
        public void celsiusNeg11toPosFahrenheit() {
            assertEquals(12, ConversionFunctions.celsiusToFahrenheit(-11));
        }

        // TODO: Write a test for a negative celsius that converts to a negative fahrenheit
        @Test
        public void celsiusNeg25toNegFahrenheit() {
            assertEquals(-31, ConversionFunctions.celsiusToFahrenheit(-25));
        }
    @Test
        // TODO: Write a test for a celsius value that converts to 0 fahrenheit
        public void celsiusToFahrenheitNeg18() {
            assertEquals(0, ConversionFunctions.celsiusToFahrenheit(-18));
        }

        // cupsToTablespoons tests ---------------------------------------------------------------------------
        // TODO: Write a test for 0 cups converts to 0 tablespoons - run the test & see that it passes
        @Test
        public void cupsToTblspoons0() {
            assertEquals(0, ConversionFunctions.cupsToTablespoons(0));
        }
       // TODO: Write a test for 1 cup converts to 16 tablespoons
       @Test
    public void cupsToTblspoons1() {
        assertEquals(16, ConversionFunctions.cupsToTablespoons(1));
    }


        // TODO: Run the test & see that it fails. Failing tests reveal bugs.
        @Test
        public void cupsToTblspoonsNeg1000() {
            assertEquals(-1000, ConversionFunctions.cupsToTablespoons(-1000));
        }
        // TODO: Fix the implementation of cupsToTablespoons so that this test passes
        @Test
        public void cupsToTblspoonsNeg1000fixed() {
            assertEquals(0, ConversionFunctions.cupsToTablespoons(-1000));
        }

        // TODO: Write one or two additional tests for cupsToTablespoons
        @Test
    public void cupsToTblspoons10() {
        assertEquals(160, ConversionFunctions.cupsToTablespoons(10));
    }
    @Test
    public void cupsToTblspoons100() {
        assertEquals(1600, ConversionFunctions.cupsToTablespoons(100));
    }

        // monthNumToMonthName tests ---------------------------------------------------------------------------
        // TODO: Complete the test below so that it tests all valid months
        @Test
        public void months1through2ForJanuaryAndFebruary() {
            assertEquals("january", ConversionFunctions.monthNumToMonthName(1).toLowerCase());
            assertEquals("february", ConversionFunctions.monthNumToMonthName(2).toLowerCase());
        }

        // TODO: Complete the test below for a variety of invalid month numbers; be sure to include bounds
        @Test
        public void monthsFictitiousTodayAndTomorrow() {
        assertEquals("", ConversionFunctions.monthNumToMonthName(22).toLowerCase());
        assertEquals("", ConversionFunctions.monthNumToMonthName(13).toLowerCase());
    }


        // TODO: Run the test and see that it fails. Failing tests reveal bugs.
        @Test
        public void months8through9ForAugustAndSeptember() {
            assertEquals("september", ConversionFunctions.monthNumToMonthName(9).toLowerCase());
            assertEquals("august", ConversionFunctions.monthNumToMonthName(8).toLowerCase());
        }
        @Test
        // TODO: Fix the implementation of monthNumToMonthName so that this test passes
        public void months10ForOctober() {
            assertEquals("october", ConversionFunctions.monthNumToMonthName(10).toLowerCase());

        }
        @Test
        public void invalidMonthReturnsEmptyString() {
            assertEquals("", ConversionFunctions.monthNumToMonthName(2200).toLowerCase());

            }
        }