module sample.snake_n_ladder {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.snake_n_ladder to javafx.fxml;
    exports sample.snake_n_ladder;
}