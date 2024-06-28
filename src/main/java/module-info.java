module team.spirit.metromapapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens team.spirit.metromapapp to javafx.fxml;
    exports team.spirit.metromapapp;
}