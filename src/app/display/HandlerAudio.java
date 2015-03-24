package app.display;

import javafx.scene.Parent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

/**
 * Created by Leslie on 20/03/2015.
 */
//Class to handler the audio switch
public class HandlerAudio extends Parent {

    public HandlerAudio() {
    }

    public static void playSongStart(){
        Media testAudio = new Media(new File("music/start.mp3").toURI().toString());
        MediaPlayer mediaPlayer =  new MediaPlayer(testAudio);
        mediaPlayer.play();
    }
    public static void playSongStop(){
        Media testAudio = new Media(new File("music/over.mp3").toURI().toString());
        MediaPlayer mediaPlayer =  new MediaPlayer(testAudio);
        mediaPlayer.play();
    }
    public static void playSongElectrocution(){
        Media testAudio = new Media(new File("music/electrocution.mp3").toURI().toString());
        MediaPlayer mediaPlayer =  new MediaPlayer(testAudio);
        mediaPlayer.play();
    }
    public static void playSongObjectsOn(){
        Media testAudio = new Media(new File("music/object_on.mp3").toURI().toString());
        MediaPlayer mediaPlayer =  new MediaPlayer(testAudio);
        mediaPlayer.play();
    }
    public static void playSongObjectsOff(){
        Media testAudio = new Media(new File("music/object_off.mp3").toURI().toString());
        MediaPlayer mediaPlayer =  new MediaPlayer(testAudio);
        mediaPlayer.play();
    }
    public static void playSongSwitchMap(){
        Media testAudio = new Media(new File("music/switch.mp3").toURI().toString());
        MediaPlayer mediaPlayer =  new MediaPlayer(testAudio);
        mediaPlayer.play();
    }
}
