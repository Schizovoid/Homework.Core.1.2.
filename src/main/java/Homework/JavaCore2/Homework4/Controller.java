package Homework.JavaCore2.Homework4;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    public ListView<String> contacts;
    @FXML
    private VBox main;
    @FXML
    private TextField userMessage;
    @FXML
    private TextArea chatArea;
    @FXML
    private Button btnSend;
    private String currentUser;

    public void mockAction(ActionEvent actionEvent) {
        System.out.println("mock");
    }

    public void closeApplication(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void sendMessage(ActionEvent actionEvent) {
        String text = userMessage.getText();
        if (text == null || text.isBlank()) {
            return;
        }

        try {
            chatArea.appendText("[" + currentUser + "]: " + text + System.lineSeparator());
            userMessage.clear();
        } catch (NullPointerException e) {

                chatArea.appendText("Broadcast: " + text + System.lineSeparator());
                userMessage.clear();

        }
//        chatArea.appendText("Broadcast: " + text + System.lineSeparator());
//        userMessage.clear();
                   }
            @Override
            public void initialize (URL location, ResourceBundle Resources){
                String[] userContacts = {"Vasya", "Masha", "Petya", "Valera", "Nastya"};

                contacts.getItems().addAll(userContacts);
                contacts.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                       currentUser = contacts.getSelectionModel().getSelectedItem();
                    }
                });
            }
        }