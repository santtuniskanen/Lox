module com.craftinginterpreters.lox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.craftinginterpreters.lox to javafx.fxml;
    exports com.craftinginterpreters.lox;
}