module br.com.joaocarloslima {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.dianalinaemidio to javafx.fxml;
    exports br.com.dianalinaemidio;
}
