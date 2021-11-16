package view;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class AnimePresenter {
    private SpriteAnime spriteAnime;
    private Character character;
    private int count = 0;
    private int walkingPace = 0;

    public AnimePresenter(SpriteAnime spriteAnime, Character character) {
        this.character = character;
        this.spriteAnime = spriteAnime;
        addEventsHandlers();
        updateViews();
    }
   
    private void addEventsHandlers() {

        Timeline time = new Timeline(new KeyFrame(Duration.millis(140), a -> {
            updateViews();
            if (count > 3) {
                count = 0;
            } else {
                count++;
            }
            
            if (walkingPace > spriteAnime.getCanvas().getWidth()) {
                walkingPace = 0;
            } else {
                walkingPace+=10;
            }
            this.spriteAnime.drawImages(count, walkingPace);
        }));
        time.setCycleCount(Timeline.INDEFINITE);
        time.play();
    }

    private void updateViews() {
        spriteAnime.getCanvas().getGraphicsContext2D().clearRect(0, 0, spriteAnime.getCanvas().getWidth(),
                spriteAnime.getCanvas().getHeight());
    }

}
