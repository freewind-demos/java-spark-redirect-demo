package demo;

import static spark.Spark.get;
import static spark.Spark.redirect;

public class Hello {

    public static void main(String[] args) {
        redirect.get("/", "/hello");
        get("/hello", (req, res) -> "Hello, spark! (from /hello)");

        System.out.println("Server started, please visit:");
        System.out.println("http://localhost:4567");
    }

}
