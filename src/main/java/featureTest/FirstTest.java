package featureTest;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FirstTest {

    @Test
    public void testYaRuApi() {
        // Установка базового URL
        RestAssured.baseURI = "https://ya.ru";

        // Отправка GET-запроса
        int statusCode = given()
                .when()
                .get()
                .then()
                .extract()
                .statusCode();

        // Проверка кода ответа
        assertEquals(200, statusCode, "Код ответа не является 200");
    }
}
