package view;


import javafx.scene.layout.Pane;


public class Character extends Pane {

    private SpriteAnime anime;

    public Character(SpriteAnime anime) {
        this.anime = anime;
    }

    public void MoveX(int x) {
        boolean right = x > 0 ? true : false;
        for (int i = 0; i < Math.abs(x); i++) {
            if (right) {
                this.setTranslateX(this.getTranslateX() + 1);
            } else {
                this.setTranslateX(this.getTranslateX() - 1);
            }
        }
    }


    public void MoveY(int y) {
        boolean right = y > 0 ? true : false;
        for (int i = 0; i < Math.abs(y); i++) {
            if (right) {
                this.setTranslateY(this.getTranslateY() + 1);
            } else {
                this.setTranslateY(this.getTranslateY() - 1);
            }
        }
    }


}
