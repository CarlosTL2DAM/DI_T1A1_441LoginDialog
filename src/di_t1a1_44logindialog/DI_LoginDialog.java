/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a1_44logindialog;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 2ºDam DI
 * @author Carlos Torres Liñán
 * 06/10/21
 */
public class DI_LoginDialog extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Añadimos el titulo de la ventana
        primaryStage.setTitle("Controls Layout ");
        //Añadimos una layout de nodo principal Group
        Group root = new Group();
        //Añadimos una escena
        Scene scene = new Scene(root, 380, 118, Color.WHITE);

        //Añadimos un segundo Layout, en este caso GridPane
        GridPane gridpane = new GridPane();
        //Al GridPane le damos un padding = separacion con el resto
        gridpane.setPadding(new Insets(5));
        //Dentro del GidPane, la separacion entre componentes será 5
        //Horizontalmente (H) y verticalmente (V)
        gridpane.setHgap(5);
        gridpane.setVgap(5);

        //Añadimos una label 
        Label fNameLbl = new Label("First Name");
        //Añadimos un campo de texto
        TextField fNameFld = new TextField();
        //Añadimos una segunda label
        Label lNameLbl = new Label("Last Name");
        //Añadimos un segundo campo de texto
        TextField lNameFld = new TextField();
        //Añadimos un botón
        Button saveButt = new Button("Save");

        //Damos la posición que queremos a cada uno de los componentes
        //setHaligment es un método que permite seleccionar la posicion horizontal que tendrá
        //nuestro componente, HPos.Right --> Derecha HPos.Center --> Centro HPos.Left --> Izquierda
        // First name label
        GridPane.setHalignment(fNameLbl, HPos.RIGHT);
        gridpane.add(fNameLbl, 0, 0);

        // Last name label
        GridPane.setHalignment(lNameLbl, HPos.RIGHT);
        gridpane.add(lNameLbl, 0, 1);

        // First name field
        GridPane.setHalignment(fNameFld, HPos.LEFT);
        gridpane.add(fNameFld, 1, 0);

        // Last name field
        GridPane.setHalignment(lNameFld, HPos.LEFT);
        gridpane.add(lNameFld, 1, 1);

        // Save button
        GridPane.setHalignment(saveButt, HPos.RIGHT);
        gridpane.add(saveButt, 1, 2);

        //Añadimos el GridPane al Layout principal (Group)
        root.getChildren().add(gridpane);

        //Seleccionamos la escena principal 
        primaryStage.setScene(scene);
        
        //Mostramos la ventana
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
