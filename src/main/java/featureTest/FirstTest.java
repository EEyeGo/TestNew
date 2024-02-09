package featureTest;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.testng.TestNGAntTask.Mode.junit;

@Epic("MainTest")
@Feature("Ticket")
@Story("OK")


public class FirstTest {

    @Test
    @DisplayName("SU")
    public void aeroflotStandardAdtChdInfTest() {
        System.out.println("hello !");
    }
}
