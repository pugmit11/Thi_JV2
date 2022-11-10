
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import static  RootStage.RootStage.rootStage;
public class HomeController {
    public TableColumn idId;
    public TableColumn tdPhone;
    public TableColumn tdAddress;
    public TableColumn tdName;
    public TableView tbStudent;


    public void AddStudent(ActionEvent actionEvent) throws Exception {
        Parent addStudent = FXMLLoader.load(getClass().getResource("AddStudent/add.fxml"));
        rootStage.setTitle("AddStudent");
        rootStage.setScene(new Scene(addStudent,800,600));
    }
}