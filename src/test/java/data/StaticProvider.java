package data;

import org.testng.annotations.DataProvider;

public class StaticProvider {
    @DataProvider(name = "dataForDivInt")
    public static Object[][] dataForDivTestInt() {
        return new Object[][]{
                {10, 2, 5},
                {-10, -2, 5},
                {-10, 2, -5}

        };
    }

    @DataProvider(name = "dataForDivDouble",parallel = true)
    public static Object[][] dataForDivTestDouble() {
        return new Object[][]{
                {10, 4, 2.5},
                {-10, -4, 2.5},
                {-10, 4, -2.5}
        };
    }
}