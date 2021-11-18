package view;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;


public class SpriteAnime extends BorderPane {
    private ImageView imageView;
    private ImageView imageView1;
    private List<Image> images;
    private List<Image> images1;
    private Canvas canvas;

    public SpriteAnime() {
        initializeNodes();
        layoutNodes();
    }

    private void initializeNodes() {
        imageView = new ImageView();
        this.imageView1 = new ImageView();
        images = new ArrayList<>();
        images1 = new ArrayList<>();
        canvas = new Canvas(1000, 800);
    }

    private void layoutNodes() {
        addRunningImages();
        addImages();
        canvas.getGraphicsContext2D().fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        setCenter(canvas);
    }

    public void addImages() {
        images.add(new Image("src/resources/walking0.jpg"));
        images.add(new Image("src/resources/walking1.jpg"));
        images.add(new Image("src/resources/walking2.jpg"));
        images.add(new Image("src/resources/walking3.jpg"));
        images.add(new Image("src/resources/walking4.jpg"));
    }

    public void addRunningImages() {
        images1.add(new Image("src/resources/running0.jpg"));
        images1.add(new Image("src/resources/running1.jpg"));
        images1.add(new Image("src/resources/running2.jpg"));
        images1.add(new Image("src/resources/running3.jpg"));
        images1.add(new Image("src/resources/running4.jpg"));
        images1.add(new Image("src/resources/running5.jpg"));
        images1.add(new Image("src/resources/running6.jpg"));
        images1.add(new Image("src/resources/running7.jpg"));

    }

    public void drawWalkingImages(int index, int pace) {
        imageView.setImage(images.get(index));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        canvas.getGraphicsContext2D().drawImage(imageView.getImage(), pace, 0);
    }

    public void drawRunningImages(int index, int pace) {
        imageView1.setImage(images1.get(index));
        imageView1.setFitHeight(20);
        imageView1.setFitWidth(20);
        canvas.getGraphicsContext2D().drawImage(imageView1.getImage(), pace, 0);
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
