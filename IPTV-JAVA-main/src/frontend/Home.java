package frontend;

import iptv.Main;
import javafx.scene.CacheHint;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.WindowEvent;
import videoplayer.VideoPlayer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class Home extends Application {

    public void start(Stage stage) {
        Label label = new Label("English Channels");
        //Setting font to the label
        Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 25);
        label.setFont(font);
        //Filling color to the label
        label.setTextFill(Color.BLACK);
        //Setting the position
        label.setTranslateX(10);
        label.setTranslateY(25);

        Label label1 = new Label("Tamil Channels");
        //Setting font to the label
        label1.setFont(font);
        //Filling color to the label
        label1.setTextFill(Color.BLACK);
        //Setting the position
        label1.setTranslateX(10);
        label1.setTranslateY(250);



        Label label2 = new Label("Sports Channels");
        //Setting font to the label
        label2.setFont(font);
        //Filling color to the label
        label2.setTextFill(Color.BLACK);
        //Setting the position
        label2.setTranslateX(10);
        label2.setTranslateY(475);


        Label label3 = new Label("Movie Channels");
        //Setting font to the label
        label3.setFont(font);
        //Filling color to the label
        label3.setTextFill(Color.BLACK);
        //Setting the position
        label3.setTranslateX(10);
        label3.setTranslateY(700);





        Image img = new Image("http://sagraecdnems04.cdnsrv.jio.com/jiotv.catchup.cdn.jio.com/dare_images/images/Discovery_HD_World.png");
        ImageView view = new ImageView(img);
        view.setFitHeight(80);
        view.setPreserveRatio(true);
        Button button = new Button();
        //Setting the location of the button
        button.setTranslateX(40);
        button.setTranslateY(75);
        //Setting the size of the button
        button.setPrefSize(200, 150);
        button.setGraphic(view);

        Group root = new Group(button);

        Image[] imagearr =new Image[32];
        ImageView[] imageviewarr =new ImageView[32];
        double[] sizex =new double[]{275,510,745,980,1215,1450,1685,50,275,510,745,980,1215,1450,1685,50,275,510,745,980,1215,1450,1685,50,275,510,745,980,1215,1450,1685};
        double[] sizey =new double[]{75,75,75,75,75,75,75,300,300,300,300,300,300,300,300,525,525,525,525,525,525,525,525,750,750,750,750,750,750,750,750};
        Button[] Buttonarr =new Button[32];
        String imageurl[]=new String[]{"http://jiotv.catchup.cdn.jio.com/dare_images/images/Colors_HD.png","http://jiotv.catchup.cdn.jio.com/dare_images/images/Sony_HD.png",
                "http://jiotv.catchup.cdn.jio.com/dare_images/images/Zee_TV_HD.png","http://jiotv.catchup.cdn.jio.com/dare_images/images/Sony_BBC_Earth_HD_English.png","http://jiotv.catchup.cdn.jio.com/dare_images/images/History_HD.png",
                "http://jiotv.catchup.cdn.jio.com/dare_images/images/Times_Now_HD.png","http://jiotv.catchup.cdn.jio.com/dare_images/images/NDTV_24x7.png","https://www.smartads.in/resources/assets/uploads/product_group/Television/Sun-TV-HD-Logo.png",
                "http://jiotv.catchup.cdn.jio.com/dare_images/images/Star_Vijay.png","http://jiotv.catchup.cdn.jio.com/dare_images/images/Zee_Tamil.png","https://www.sundirect.in/Content/Uploads/Blocks/636928288240842877_sun-music-hd.png",
                "https://www.sundirect.in/Content/Uploads/Blocks/636928252044156866_k-tv-hd.png","http://jiotv.catchup.cdn.jio.com/dare_images/images/Kalaignar_TV.png","http://jiotv.catchup.cdn.jio.com/dare_images/images/Puthiya_Thalimurai.png",
                "http://jiotv.catchup.cdn.jio.com/dare_images/images/Thanthi_TV.png","http://jiotv.catchup.cdn.jio.com/dare_images/images/Star_Sports_HD_1.png","http://jiotv.catchup.cdn.jio.com/dare_images/images/Ten2_HD.png",
                "https://static.wikia.nocookie.net/logopedia/images/2/28/Star_Sports_1_Tamil_HD.png/revision/latest/scale-to-width-down/185?cb=20211017160049","https://willowcricket.live/wp-content/uploads/2020/03/guhkm.png",
                "https://e0.365dm.com/20/04/192x192/skysports-sky-sports-cricket_4967063.jpg?20200411112851","https://upload.wikimedia.org/wikipedia/en/0/0c/A_Sports_Logo.png?20211011144430",
                "https://icon2.cleanpng.com/20180508/xkw/kisspng-supersport-dstv-television-channel-5af1d57eb4d1e6.4426743415257982707407.jpg","http://jiotv.catchup.cdn.jio.com/dare_images/images/Star_Sports_Select_HD_1.png",
                "https://pluspng.com/img-png/star-movies-logo-png-star-movies-hd-star-movies-png-300.png","https://vignette.wikia.nocookie.net/logopedia/images/f/fd/Sony_Pix_HD.png/revision/latest/scale-to-width-down/340?cb=20191203075048",
                "https://www.tvchannelpricelist.com/wp-content/uploads/channels-logo-300/and-flix-hd-logo-300x300.jpg","https://vignette.wikia.nocookie.net/logopedia/images/4/4f/Movies_Now_HD.jpg/revision/latest/scale-to-width-down/340?cb=20180531123424",
                "https://i.imgur.com/SKq3sC8.png","https://i5.satexpat.com/cha/es/sundance-95x48.gif","http://jiotv.catchup.cdn.jio.com/dare_images/images/Zee_Cinema_HD.png","https://static.wikia.nocookie.net/logopedia/images/a/ae/VijaySuper.jpg/revision/latest/scale-to-width-down/220?cb=20200813073856"
        };







        // -------------------------------------------------------------------------------

    //English Channels
        for(int i=0;i<31;i++){
            imagearr[i]=new Image(imageurl[i]);
            System.out.println(imagearr[i]);
            imageviewarr[i]=new ImageView(imagearr[i]);
            System.out.println(imageviewarr[i]);
            imageviewarr[i].setFitHeight(80);
            imageviewarr[i].setPreserveRatio(true);
            imageviewarr[i].setCache(true);
            imageviewarr[i].setCacheHint(CacheHint.SPEED);
            Buttonarr[i]=new Button();
            Buttonarr[i].setTranslateX(sizex[i]);
            Buttonarr[i].setTranslateY(sizey[i]);
            Buttonarr[i].setPrefSize(200, 150);
            Buttonarr[i].setGraphic(imageviewarr[i]);
            root.getChildren().add(Buttonarr[i]);
        }






        root.getChildren().add(label);
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        root.getChildren().add(label3);
        Scene scene = new Scene(root, 595, 170, Color.BEIGE);
        stage.setTitle("Button Graphics");
        stage.setScene(scene);
        stage.show();

        // TODO: Handling the button events  (Not a Todo Just for highlighting)

        EventHandler<ActionEvent> clickEvent = actionEvent -> {
            Main obj = null;
            try {
                obj = new Main();

            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            String path=obj.getVideUrl();

            Stage stage1  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

            VideoPlayer videoPlayer = new VideoPlayer(path);
            Scene scene1 = new Scene(videoPlayer);

            stage1.setScene(scene1);
            stage1.show();

            stage1.setOnCloseRequest(windowEvent -> {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Exit");
                alert.setHeaderText("You're about to logout!");
                alert.setContentText("Do you want to continue ?");

                if(alert.showAndWait().get() == ButtonType.OK) {
                    windowEvent.consume();
                    stage1.setScene(scene);
                    stage1.show();
                }
            });
        };

        for (int i = 0; i < 31; i++) {
            Buttonarr[i].setOnAction(clickEvent);
        }


//        Buttonarr[0].setOnAction(clickEvent);
    }
    public static void main(String args[]){
        launch(args);
    }

//    public void backToHome(WindowEvent event, Scene root){
//        event.consume();
//        Stage stage = (Stage) (((Node)event.getSource()).getScene().getWindow());
//        stage.setScene(root);
//        stage.show();
//    }
}