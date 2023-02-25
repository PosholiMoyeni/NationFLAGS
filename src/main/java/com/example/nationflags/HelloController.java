package com.example.nationflags;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ComboBox<String> Country;
    @FXML
    private Rectangle Rec1;

    @FXML
    private Rectangle Rec3;

    @FXML
    private Rectangle Rec2;
    @FXML
    private Label NAME;

    @FXML
    private Label ABOUT;
    @FXML

    ObservableList<String> list = FXCollections.observableArrayList("Armenia","Gabon","Germany","Lesotho","Netherlands","Russia");

    @FXML

    void Clear(ActionEvent event) {
        try {
            Country.setValue(null);
            Rec1.setFill(null);
            Rec2.setFill(null);
            Rec3.setFill(null);
            NAME.setText(" ");
            ABOUT.setText(" ");
            Country.setPromptText("SELECT COUNTRY");
           // Country.setPromptText("");
        }catch (Exception x){
            System.out.println(x);
        }

    }

    @FXML
    void Country(ActionEvent event) {
        try {
            
            if ("Armenia".equals(Country.getValue())) {
                Rec1.setFill(Color.RED);
                Rec2.setFill(Color.BLUE);
                Rec3.setFill(Color.YELLOW);
                NAME.setText("ARMENIA");
                ABOUT.setText("Armenia , officially the Republic of Armenia, " +"\n"+
                        "is a landlocked country in the Armenian " +"\n"+
                        "Highlands of Western Asia." +"\n"+
                        "It is a part of the Caucasus region; " +"\n"+
                        "and is bordered by Turkey to the west, " +"\n"+
                        "Georgia to the north, the Lachin corridor " +"\n"+
                        "(under a Russian peacekeeping force) " +"\n"+
                        "and Azerbaijan to the east, " +"\n"+
                        "and Iran and the Azerbaijani exclave of"+"\n"+
                        "Nakhchivan to the south.");
            }
            if ("Gabon".equals(Country.getValue())) {
                Rec1.setFill(Color.GREEN);
                Rec2.setFill(Color.YELLOW);
                Rec3.setFill(Color.BLUE);
                NAME.setText("GABON");
                ABOUT.setText("Gabon, officially the Gabonese Republic ," +"\n"+
                        "is a country on the west coast of Central Africa. " +"\n"+
                        "Located on the equator, it is bordered by " +"\n"+
                        "Equatorial Guinea to the northwest," +"\n"+
                        "Cameroon to the north, " +"\n"+
                        "the Republic of the Congo on the east and south," +"\n"+
                        "and the Gulf of Guinea to the west.");

            }
            if ("Germany".equals(Country.getValue())) {
                Rec1.setFill(Color.BLACK);
                Rec2.setFill(Color.RED);
                Rec3.setFill(Color.YELLOW);
                NAME.setText("GERMANY");
                ABOUT.setText("The Federal Republic of Germany lies " +
                        "in the heart of Europe and is a cosmopolitan," +"\n"+
                        "democratic country with a great tradition " +"\n"+
                        "and a lively present. Facts and figures at a glance." +"\n"+
                        "Germany is one of the founding members of the EU. " +"\n"+
                        "Today it works to strengthen and develop the " +"\n"+
                        "EU as a guarantor of peace, security and prosperity.");

            }
            if ("Netherlands".equals(Country.getValue())) {
                Rec1.setFill(Color.RED);
                Rec2.setFill(Color.WHITE);
                Rec3.setFill(Color.BLUE);
                NAME.setText("NETHERLANDS");
                ABOUT.setText("The Netherlands is a small country sandwiched " +"\n"+
                        "between Belgium and Germany in Western Europe. " +"\n"+
                        "The North Sea, located to the north " +"\n"+
                        "and west of the Netherlands, " +"\n"+
                        "is continually battering the land. " +"\n"+
                        "The Netherlands is larger than the state of Maryland," +"\n"+
                        "but smaller than West Virginia.");

            }
            if ("Russia".equals(Country.getValue())) {
                Rec1.setFill(Color.WHITE);
                Rec2.setFill(Color.BLUE);
                Rec3.setFill(Color.RED);
                NAME.setText("RUSSIA");
                ABOUT.setText("Russia, or the Russian Federation, " +"\n"+
                        "is a transcontinental country spanning " +"\n"+
                        "Eastern Europe and Northern Asia." +"\n"+
                        "It is the largest country in the world, " +"\n"+
                        "with its internationally recognised territory covering" +"\n"+
                        "17,098,246 square kilometres (6,601,670 sq mi)," +"\n"+
                        "and encompassing one-eighth of Earth's inhabitable " +"\n"+
                        "landmass. Russia extends across eleven time zones " +"\n"+
                        "and shares land boundaries with " +"\n"+
                        "fourteen countries.");

            }
            if ("Lesotho".equals(Country.getValue())) {
                Rec1.setFill(Color.BLUE);
                Rec2.setFill(Color.WHITE);
                Rec3.setFill(Color.GREEN);
                NAME.setText("LESOTHO");
                ABOUT.setText("Lesotho, officially the Kingdom of Lesotho, " +"\n"+
                        "is a country landlocked as an enclave in South Africa. " +"\n"+
                        "It is situated in the Maloti Mountains " +"\n"+
                        "and contains the highest mountains in Southern Africa." +"\n"+
                        "It has an area of over 30,000 km 2 (11,600 sq mi) " +"\n"+
                        "and has a population of about 2 million.");

            }
        }catch (Exception except){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("PLEASE SELECT COUNTRY");
            alert.showAndWait();
            System.out.println("The error is in Country method "+except);

        }
    }
    @FXML
    void Exit(ActionEvent event) {
        try {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setContentText("Are you sure you want to exit the program?");
            alert.setHeaderText("EXIT?");


            Optional<ButtonType> option = alert.showAndWait();
            if(option.isPresent() && option.get()==ButtonType.OK){
                Platform.exit();
            }
            else {
                return ;
            }
            return;

        }catch (Exception r){

            System.out.println(r);
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Country.setItems(list);
    }
}