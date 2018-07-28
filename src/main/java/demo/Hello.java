package demo;


import static spark.Spark.get;

public class Hello {

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello, spark!");
        
        System.out.println("Server started, please visit:");
        System.out.println("http://localhost:4567/hello");
    }

}
