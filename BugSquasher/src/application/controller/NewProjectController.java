package application.controller;

import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class NewProjectController {
	
	@FXML private VBox newProjectBox;
	@FXML private Button cancelButton;
	@FXML private Button saveButton;
	@FXML private TextField projectNameTextField;
	@FXML private TextArea projectDescTextArea;
	@FXML private DatePicker projectDatePicker;
	
	/*
	 * Perform all necessary post-processing.
	 */
	@FXML 
	public void initialize() {
		// Set the default time in the datePicker
		projectDatePicker.setValue(LocalDate.now());
	}

	/*
	 * Cancel new project and close the NewProject window.
	 */
	@FXML 
	private void cancelButtonAction() {
		// Get the Stage
		Stage stage = (Stage) cancelButton.getScene().getWindow();	
		// Close it
		stage.close();
	}

	/*
	 * Save the new project.
	 */
	@FXML 
	private void saveButtonAction() {

	}
}
