package wshw.address;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import wshw.address.model.Person;
import wshw.address.view.PersonEditDialogController;
import wshw.address.view.PersonOverviewController;

public class MainApp extends Application {
	
	
	private Stage primaryStage;
	private BorderPane rootLayout;
	
	/**
	 * The data as an observable list of Persons.
	 */
	private ObservableList<Person> personData = FXCollections.observableArrayList();

	/**
	 * Constructor
	 */
	public MainApp() {
		// Add some sample data
		personData.add(new Person("Hans", "Muster"));
		personData.add(new Person("Ruth", "Mueller"));
		personData.add(new Person("Heinz", "Kurz"));
		personData.add(new Person("Cornelia", "Meier"));
		personData.add(new Person("Werner", "Meyer"));
		personData.add(new Person("Lydia", "Kunz"));
		personData.add(new Person("Anna", "Best"));
		personData.add(new Person("Stefan", "Meier"));
		personData.add(new Person("Martin", "Mueller"));
	}
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("AddressApp");
		
		initRootLayout();

        showPersonOverview();
	}


	
	
	//
	private void initRootLayout() {	
		
		try {
			//// Load root layout from fxml file
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane)loader.load();
			
			// Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            // all the thing to be added on the stage would be changes into Scence class??
            
            primaryStage.setScene(scene);
            primaryStage.show();
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("nothing");
			e.printStackTrace();
		}
		
	}
	
	//a
	private void showPersonOverview() {
		
		try {			
		// Load root layout from fxml file
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainApp.class.getResource("view/PersonOverview.fxml"));
		System.out.println("here");
		AnchorPane personOverview = (AnchorPane) loader.load();
		
		System.out.println("here2");
		
		// Set person overview into the center of root layout.
		rootLayout.setCenter(personOverview);
		System.out.println("here3");
		
		// Give the controller access to the main app.
        PersonOverviewController controller = loader.getController();
        controller.setMainApp(this);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Dsf");
			e.printStackTrace();
		}
		
	}
	/**
	 * Returns the main stage.
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	
	public ObservableList<Person> getPersonData() {
		return personData;
	}
	
	/**
	 * Opens a dialog to edit details for the specified person. If the user
	 * clicks OK, the changes are saved into the provided person object and true
	 * is returned.
	 * 
	 * @param person the person object to be edited
	 * @return true if the user clicked OK, false otherwise.
	 */
	public boolean showPersonEditDialog(Person person) {
	    try {
	        // Load the fxml file and create a new stage for the popup dialog.
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(MainApp.class.getResource("view/PersonEditDialog.fxml"));
	        AnchorPane page = (AnchorPane) loader.load();

	        // Create the dialog Stage.
	        Stage dialogStage = new Stage();
	        dialogStage.setTitle("Edit Person");
	        dialogStage.initModality(Modality.WINDOW_MODAL);
	        dialogStage.initOwner(primaryStage);
	        Scene scene = new Scene(page);
	        dialogStage.setScene(scene);

	        // Set the person into the controller.
	        PersonEditDialogController controller = loader.getController();
	        controller.setDialogStage(dialogStage);
	        controller.setPerson(person);

	        // Show the dialog and wait until the user closes it
	        dialogStage.showAndWait();

	        return controller.isOkClicked();
	    } catch (IOException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
