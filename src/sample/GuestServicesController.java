package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class GuestServicesController {

  //maintenence request tab vars
  public Tab tabMaintenanceRequests;
  public Button buttonSubmit;
  public TextField textOther;
  public RadioButton ifLighting;
  public RadioButton ifPlumbing;
  public RadioButton ifTv;
  public RadioButton ifInternet;
  public RadioButton IfOther;
  
  
  //food servives
  public TextArea totalAmmount;
  public Button buttonSubmitOrder;
  //I created quantity fields only for the forst item in each category
  public TextField quantityCalmari;
  public TextField quantityVegetables;
  public TextField quantityChicken;
  public TextField quantityDeserts;
  public TextField roomNumber;


  //housekeeping vars
  public Button buttonSubmitRequestHouskeeping;
  public TextField towelAmount;
  public TextField toiletPaperAmount;
  public TextField shampooAmount;
  public TextField conditionerAmount;
  public TextField soapAmount;
  public CheckBox changeSheets;
  public CheckBox restockFridge;
  public CheckBox cleanRoom;
  public CheckBox makeBed;
  public TextField textOtherReqs;


  //maintanance request tub
  public void getMaintenanceRequests(Event event) {
  }

  public void submitRequests(ActionEvent actionEvent) {
  }

  public void getOtherRequests(ActionEvent actionEvent) {
  }

  
  //food services functions
  public void getTotal(MouseEvent mouseEvent) {
  }

  public void submitOrder(ActionEvent actionEvent) {
  }

  public void getRooomNumber(ActionEvent actionEvent) {
  }

  public void submitHouskeepingRequest(ActionEvent actionEvent) {
  }

  public void getOtherHouseKeppingReq(ActionEvent actionEvent) {
  }

  //housekeeping functions
  
}
