import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestPostmanEcho {
    @Test
    void post() {
        // Given - When - Then
        given()
                .baseUri("https://postman-echo.com")
                .body("some bla bla bla data")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("some bla bla bla data"))
        ;
    }
}
