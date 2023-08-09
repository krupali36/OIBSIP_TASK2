package numberguessinggame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class NumberGuessingGame extends Application {
     int guess,unum;
     int counter=0,maxGuesses=3;
     
    @Override
    public void start(Stage stage) {
        
        Label l=new Label("Enter a number");
        TextField textfield=new TextField();
        
        Button b = new Button();
        b.setText("Guess the number");
        guess=(int)(Math.random()*100);
        System.out.println(guess);
        
        
        b.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            
            public void handle(ActionEvent event) {
                
                try
                {
                    unum = Integer.parseInt(textfield.getText());
                }  
                catch(NumberFormatException ex)
                {
                   ex.printStackTrace();
                }
                    if(unum==guess)
                    {
                        counter++;
                    System.out.println("Value is Equal");
                    }
                    else if(unum>guess)
                    {
                        counter++;
                    System.out.println("Value is Higher");
                    }
                    else
                    {
                      counter++;  
                    System.out.println("Value is Lower");
                    }
                    if (counter == maxGuesses) {
                    System.out.println("\nGame Over...");
                    }
                }
                
            
        });
        
        VBox pane = new VBox(10);
        pane.setPadding(new Insets(50, 150, 50, 60));
        pane.getChildren().addAll(l,textfield,b);
        
        Scene scene = new Scene(new Group(pane), 595, 250,Color.LAVENDER);
        
        stage.setTitle("Number Guessing Game");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
