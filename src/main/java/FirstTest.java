import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FirstTest {

    @Test
    @DisplayName("проверка кода 200")
    public void yaRuApiTest() {
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
