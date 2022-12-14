package videoplayer;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Bounds;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import videoplayer.VideoBar;

public class VideoPlayer extends BorderPane {
    Media media;
    MediaPlayer mediaPlayer;
    MediaView mediaView;
    Pane pane;

    public VideoPlayer(String filePath) {
        media = new Media(filePath);
        mediaPlayer = new MediaPlayer(media);
        mediaView = new MediaView(mediaPlayer);
        pane = new Pane();

        pane.getChildren().add(mediaView);

        //One more line
        setCenter(pane);
        mediaView.setPreserveRatio(true);
        mediaView.setFitHeight(1010);
        mediaView.setFitWidth(820);


        //add Video bar here

        VideoBar bar = new VideoBar(mediaPlayer);
        setBottom(bar);

        mediaPlayer.setAutoPlay(true);
        mediaPlayer.play();
    }

}
