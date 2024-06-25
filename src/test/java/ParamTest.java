import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
    @Parameters({"numerator", "denominator"})

    @Test
    public void paramTest(@Optional("10") double a, @Optional("4.0") double b) {
        System.out.println(a/b);

    }
}
