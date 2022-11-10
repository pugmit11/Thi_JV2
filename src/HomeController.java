
import AddStudent.AddController;
import Entities.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

import static  RootStage.RootStage.rootStage;
public class HomeController implements Initializable {
    public TableView<Student> tbStudent;
    public TableColumn<Student, Integer> tdId;
    public TableColumn<Student, Integer> tdPhone;
    public TableColumn<Student, String> tdAddress;
    public TableColumn<Student, String> tdName;
    public static ObservableList<Student> listStudent  = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        idId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tdName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tdAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        tdPhone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        tbStudent.setItems(AddController.listStudent);
    }

    public void AddStudent(ActionEvent actionEvent) throws Exception {
        Parent addStudent = FXMLLoader.load(getClass().getResource("AddStudent/Add.fxml"));
        rootStage.setTitle("AddStudent");
        rootStage.setScene(new Scene(addStudent,800,600));
    }
}