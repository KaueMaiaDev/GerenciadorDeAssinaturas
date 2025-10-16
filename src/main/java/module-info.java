module br.com.gerendiadordeassinaturas.gerenciadordeassinaturas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens br.com.gerendiadordeassinaturas.gerenciadordeassinaturas to javafx.fxml;
    exports br.com.gerendiadordeassinaturas.gerenciadordeassinaturas;
}