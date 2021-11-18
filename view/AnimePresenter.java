package view;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class AnimePresenter {
    private SpriteAnime spriteAnime;
    private int count = 0;
    private int running_count = 0;
    private int runningPace = 0;
    private int walkingPace = 0;

    public AnimePresenter(SpriteAnime spriteAnime) {
        this.spriteAnime = spriteAnime;
        addEventsHandlers();
        updateViews();
    }
   
    private void addEventsHandlers() {

        Timeline time = new Timeline(new KeyFrame(Duration.millis(100), a -> {

            updateViews();
            if (running_count > 6) {
                running_count = 0;
            } else {
                running_count++;
            }
            if (runningPace > spriteAnime.getCanvas().getWidth()) {
                runningPace = 0;
            } else {
                runningPace += 25;
            }
            this.spriteAnime.drawRunningImages(running_count, runningPace);

            if (count > 3) {
                count = 0;
            } else {
                count++;
            }
            if (walkingPace > spriteAnime.getCanvas().getWidth()) {
                walkingPace = 0;
            } else {
                walkingPace += 15;
            }
            this.spriteAnime.drawWalkingImages(count, walkingPace);

       }));
        time.setCycleCount(Timeline.INDEFINITE);
        time.play();


        // Timeline timeline = new Timeline(new KeyFrame(Duration.millis(100), a -> {
         
        // }));
        // timeline.setCycleCount(Timeline.INDEFINITE);
        // timeline.play();
    }

    private void updateViews() {
        spriteAnime.getCanvas().getGraphicsContext2D().clearRect(0, 0, spriteAnime.getCanvas().getWidth(),
                spriteAnime.getCanvas().getHeight());
    }

}
