import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.AnimePresenter;
import view.SpriteAnime;
import view.Character;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        SpriteAnime spriteAnime = new SpriteAnime();
        Character character = new Character(spriteAnime);
        new AnimePresenter(spriteAnime, character);
        stage.setTitle("");
        stage.setScene(new Scene(spriteAnime));
        stage.centerOnScreen();
        stage.show();
    }

}
