import org.testng.annotations.Listeners;
import utils.Listener;

@Listeners(Listener.class)
public class BaseTest {
    protected Calculator calculator = new Calculator();

}
