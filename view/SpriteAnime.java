package view;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class SpriteAnime extends BorderPane {
    private ImageView imageView;
    private List<Image> images;
    private Canvas canvas;

    public SpriteAnime() {
        initializeNodes();
        layoutNodes();
    }

    private void initializeNodes() {
        imageView = new ImageView();
        images = new ArrayList<>();
        canvas = new Canvas(1000, 800);
    }

    private void layoutNodes() {
        addImages();
        canvas.getGraphicsContext2D().fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        setCenter(canvas);
    }

    public void addImages() {
        images.add(new Image("view/resources/walking0.jpg"));
        images.add(new Image("view/resources/walking1.jpg"));
        images.add(new Image("view/resources/walking2.jpg"));
        images.add(new Image("view/resources/walking3.jpg"));
        images.add(new Image("view/resources/walking4.jpg"));
    }

    public void drawImages(int index, int pace) {
        imageView.setImage(images.get(index));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        canvas.getGraphicsContext2D().drawImage(imageView.getImage(), pace, 10);
    }

    public List<Image> getImages() {
        return images;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public Canvas getCanvas() {
        return canvas;
    }

}
