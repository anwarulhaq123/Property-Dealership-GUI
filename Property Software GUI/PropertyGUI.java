/*
Assignment No.1
PropertyGUI 
Author : Muhammad Anwar Ul Haq
StudentID: L00162311
Module: Software development and Testing
Date: 01/05/2021
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.util.ArrayList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PropertyGUI extends Application 
{
    //Create ArrayList
    ArrayList<Property> propertyList = new ArrayList<>();
    //Create a object of alert class
    Alert a = new Alert(AlertType.NONE);
    //setting the text
    Text txt1;
    Text txt2;
    Text txt3;
    Text txt4;
    //setting the text Fields
    TextField txtStreet;
    TextField txtTown;
    TextField txtCounty;
    TextField txtBeds;
    TextField txtReceptions;
    TextField txtBaths;
    TextField txtPropType;
    TextField txtPrice;
    TextField txtDelete;

    //setting the Buttons
    Button btnAddProperty;
    Button btnViewProperty;
    Button btnSearchByType;
    Button btnSearchByNoBeds;
    Button btnSearchByPrice;
    Button btnFunction1;
    Button btnFunction2;
    Button btnFunction3;
    Button btnDeleteProp;
    //Setting the Text Area
    TextArea txtOutput;


    @Override
    public void start(Stage stage) 
    {
        // Creating the text
        txt1 = new Text();
        txt1.setText("***Enter Property Details****");

        //Creating All Labels
        Label lblStreet = new Label("Street");
        Label lblTown = new Label("Town");
        Label lblCounty = new Label("County");
        Label lblBeds = new Label("Beds");
        Label lblReceptions = new Label("Receptions");
        Label lblBaths = new Label("Baths");
        Label lblPropertyType = new Label("Type");
        Label lblPrice = new Label("Price");

        //Create all TextFields
        txtStreet = new TextField();
        txtStreet.setMaxWidth(120);
        txtTown = new TextField();
        txtTown.setMaxWidth(120);
        txtCounty = new TextField();
        txtCounty.setMaxWidth(120);
        txtBeds = new TextField();
        txtBeds.setMaxWidth(70);
        txtReceptions = new TextField();
        txtReceptions.setMaxWidth(70);
        txtBaths = new TextField();
        txtBaths.setMaxWidth(70);
        txtPropType = new TextField();
        txtPropType.setMaxWidth(100);
        txtPrice = new TextField();
        txtPrice.setMaxWidth(100);
        txtDelete = new TextField();
        txtDelete.setMaxWidth(100);

        //Create Button to Add the Property
        btnAddProperty = new Button("Add Property");
        btnAddProperty.setOnAction(e -> addProperty(e));
        // Heading for Property Search
        txt2 = new Text();
        txt2.setText("***Property Search****");
        
        //Setting the buttons for Property Search
        btnViewProperty = new Button("View All Properties");
        btnViewProperty.setOnAction(e -> viewProperties(e));
        btnSearchByType = new Button("Search by Type");
        btnSearchByType.setOnAction(e -> searchByType(e));
        btnSearchByNoBeds = new Button("Search by No. Beds");
        btnSearchByNoBeds.setOnAction(e -> searchByNoBeds(e));
        btnSearchByPrice = new Button("Search By Price Range");
        btnSearchByPrice.setOnAction(e -> searchByPrice(e));

        //Create TextArea for output
        txtOutput = new TextArea();
        txtOutput.setPrefHeight(200);
        txtOutput.setPrefWidth(550);
        
        // Heading for Functions
        txt3 = new Text();
        txt3.setText("***Create Your Own Functions***");

        // Buttons for Functions
        btnFunction1 = new Button("Search By County");
        btnFunction1.setOnAction(e -> searchByCounty(e));
        btnFunction2 = new Button("Low Price Properties");
        btnFunction2.setOnAction(e -> minPriceProperty(e));
        btnFunction3 = new Button(" Calculate Property Tax");
        btnFunction3.setOnAction(e -> calculateTax(e));
        btnDeleteProp = new Button("Delete Property");
        btnDeleteProp.setOnAction(e -> deleteProperty(e));
        
        // Heading for Delete Poroperty
        txt4 = new Text();
        txt4.setText("***Enter the Property Number You want to Delete.***");

        //Create HBox and add all controls for input to it
        //Adding Labels and TextBoxes across the screen

        HBox inputTxt1 = new HBox(20);
        inputTxt1.setAlignment(Pos.CENTER);
        inputTxt1.setPadding(new Insets(20));
        inputTxt1.getChildren().addAll(txt1);

        // Create the HBox for labels and text fields
        HBox input1 = new HBox(8);
        input1.setAlignment(Pos.CENTER);
        input1.getChildren().addAll(lblStreet, txtStreet, lblTown, txtTown, lblCounty, txtCounty);

        // Create the HBox for labels and text fields
        HBox input2 = new HBox(8);
        input2.setAlignment(Pos.CENTER);
        input2.getChildren().addAll(lblBeds, txtBeds, lblReceptions, txtReceptions, lblBaths, txtBaths,
                lblPropertyType, txtPropType, lblPrice, txtPrice);

        // Create VBox for AddProperty Button and Property Search txt
        VBox btnAdd = new VBox(8);
        btnAdd.setAlignment(Pos.CENTER);
        btnAdd.getChildren().addAll(btnAddProperty, txt2);

        //HBox for Buttons
        HBox buttons = new HBox(20);
        buttons.setAlignment(Pos.CENTER);
        buttons.getChildren().addAll(btnViewProperty, btnSearchByType, btnSearchByNoBeds, btnSearchByPrice);
        
        //HBox for txt area
        HBox txtArea = new HBox(8);
        txtArea.setAlignment(Pos.CENTER);
        txtArea.getChildren().addAll(txtOutput);
        
        //Vbox for function text
        VBox txtFunction = new VBox(8);
        txtFunction.setAlignment(Pos.CENTER);
        txtFunction.getChildren().addAll(txt3);

        //HBox for function Buttons
        HBox fButtons = new HBox(20);
        fButtons.setAlignment(Pos.CENTER);
        fButtons.getChildren().addAll(btnFunction1, btnFunction2, btnFunction3);
        
        //HBox for delete text
        HBox deleteTxt = new HBox(8);
        deleteTxt.setAlignment(Pos.CENTER);
        deleteTxt.getChildren().addAll(txt4);
        
        //HBox for delete button and txtfield
        HBox delete = new HBox(20);
        delete.setAlignment(Pos.CENTER);
        delete.getChildren().addAll(btnDeleteProp,txtDelete);

        //Create VBox and add  HBoxes to it and also TextArea
        VBox root = new VBox(20);
        root.getChildren().addAll(inputTxt1, input1, input2, btnAdd, buttons, txtArea,
                txtFunction, fButtons,deleteTxt,delete);

        //Create Scene and add VBox to scene
        Scene scene = new Scene(root, 800, 700);
        stage.setScene(scene);
        stage.setTitle("LYIT Estate Agent");
        stage.show();


    }//end stage


    // Method to add the Property
    public void addProperty(ActionEvent e) 
     {
        txtOutput.clear();

        //Check if the text fields are empty
        if (txtStreet.getText().isEmpty() || txtTown.getText().isEmpty() ||
                txtCounty.getText().isEmpty() || txtBeds.getText().isEmpty()
                || txtReceptions.getText().isEmpty() || txtBaths.getText().isEmpty() ||
                txtPropType.getText().isEmpty() || txtPrice.getText().isEmpty()) {
            txtOutput.setText("You must enter values for all fields");

        }

        else 
        {

            String street = txtStreet.getText();
            String town = txtTown.getText();
            String county = txtCounty.getText();
            int noBeds = Integer.parseInt((txtBeds.getText()));
            int noReception = Integer.parseInt((txtReceptions.getText()));
            int noBaths = Integer.parseInt((txtBaths.getText()));
            String type = txtPropType.getText();
            double price = Integer.parseInt(txtPrice.getText());
            if (price < 0)
             {
                txtOutput.setText("Price must contain positive numbers only ");
            } 
            else 
            {
                //Create object and add it to ArrayList PropertyList
                propertyList.add(new Property(street, town, county, noBeds, noReception, noBaths, price, type));
                //txtOutput.setText("Property Successfully Added ");
                a.setAlertType(AlertType.INFORMATION);
                a.setContentText("Property Successfully Added");
                a.show();

                // Clear the Text Fields
                txtStreet.clear();
                txtTown.clear();
                txtCounty.clear();
                txtBeds.clear();
                txtReceptions.clear();
                txtBaths.clear();
                txtPropType.clear();
                txtPrice.clear();
            }

        }


    }//end of addProperty Method

    // Method to view all Property
    public void viewProperties(ActionEvent e) 
    {
        //clear text Area
        txtOutput.clear();
        boolean isFound = false;
        for (Property property : propertyList) 
        {
            txtOutput.appendText(property + "\n");//n to put each property on new line
            isFound = true;
        }
        if(isFound == false)
        {
            txtOutput.setText("No Property found.");
        }
    }//End viewProperties method

    // Method for Searching the Property By Type
    public void searchByType(ActionEvent e) 
    {
        txtOutput.clear();
        //Get Property Type from User
        String searchType = txtPropType.getText();
        boolean isFound = false;
        //Search the entire arraylist
        for (int i = 0; i < propertyList.size(); i++) 
        {
            if (searchType.equalsIgnoreCase(propertyList.get(i).getType())) 
            {
                txtOutput.appendText(propertyList.get(i).toString() + "\n");
                isFound = true;
                txtPropType.clear();
            }
        }//Close for loop
        if (isFound == false) 
        {
          txtOutput.setText("No Property found matching that title");
          txtPropType.clear();
        }

    }//End of searchByType method

    // Method for Searching the Property By No.Beds

    public void searchByNoBeds(ActionEvent e) 
    {
        txtOutput.clear();

        try 
        {
            txtOutput.clear();
            boolean isFound = false;
            //Get No.beds from from User
            int searchNoBeds = Integer.parseInt(txtBeds.getText());
            //Search the entire arraylist
            for (int i = 0; i < propertyList.size(); i++) 
            {
                if (propertyList.get(i).getNoBeds() == searchNoBeds) {
                    txtOutput.appendText(propertyList.get(i).toString() + "\n");
                    isFound = true;
                    txtBeds.clear();

                }
            }//Close for loop

            if (isFound == false) {
                txtOutput.setText("No property found matching to that number of Beds");
                txtBeds.clear();
            }

        } 
        catch (NumberFormatException exception) 
        {
               txtOutput.setText("Exception: Please fill the Number of beds Field");
               txtBeds.clear();


        }

    }//end searchByNoBeds Method

    //Method search by price range
    public void searchByPrice(ActionEvent e) 
    {
        try 
        {
            txtOutput.clear();
            // If not found
            boolean isFound = false;
            double searchPrice = Double.parseDouble(txtPrice.getText());
            for (int i = 0; i < propertyList.size(); i++) {
                if (propertyList.get(i).getPrice() <= searchPrice) {
                    txtOutput.appendText(propertyList.get(i).toString() + "\n");
                    isFound = true;
                    txtPrice.clear();

                }
            }//end for loop

            if (isFound == false) 
            {
                txtOutput.setText("No property found matching to this price");
                txtPrice.clear();
            }
        }
        catch (NumberFormatException exception) 
        {
            txtOutput.setText("Exception: Please fill the price range");
            txtPrice.clear();
        }
    }// End searchByPrice method

    //Method SearchByCounty

    public void searchByCounty(ActionEvent e)
    {
        txtOutput.clear();
        //Get Property Type from User
        String searchCounty = txtCounty.getText();
        boolean isFound = false;
        //Search the entire arraylist
        for (int i = 0; i < propertyList.size(); i++) 
        {
            if (searchCounty.equalsIgnoreCase(propertyList.get(i).getCounty())) 
            {
                txtOutput.appendText(propertyList.get(i).toString() + "\n");
                isFound = true;
                txtCounty.clear();
            }
        }//Close for loop
        if (isFound == false) 
        {
            txtOutput.setText("No Property found matching that county");
            txtCounty.clear();
        }

    }// end searchByCounty Method


    // Minimum Price Property Method
    public void minPriceProperty(ActionEvent e) 
    {
        txtOutput.clear();

        try 
        {
            //Get the lowest price from property list
            double lowestPrice = propertyList.get(0).getPrice();
            boolean isFound = false;
            //Search the entire arraylist
            for (int i = 0; i < propertyList.size(); i++) 
            {
                if (propertyList.get(i).getPrice() < lowestPrice) 
                {
                     txtOutput.appendText(propertyList.get(i).toString()+"\n");

                    isFound = true;

                }
            }//Close for loop
            if (isFound == false) 
            {
                txtOutput.setText("No Property found. ");
            }
        } 
        catch (IndexOutOfBoundsException exception) 
        {
            txtOutput.setText("No Property found.");

        }
    }//end MinPriceProperty Method

    //Method to calculate the Tax

    public void calculateTax(ActionEvent e) 
    {
        txtOutput.clear();
        try 
        {
            double price = Double.parseDouble(txtPrice.getText());
            double tax = 0.00;
            if (price > 0.00 && price <= 100000.00) 
            {
                tax = 90.00;
            }
             else if (price >= 100001.00 && price <= 200000.00) 
            {
                tax = 225.00;
            } 
            else if (price >= 200001.00 && price <= 500000.00) 
            {
                tax = 405.00;
            } 
            else if (price >= 500001.00 && price <= 1000000.00) 
            {
                tax = 1500.00;
            } 
            else
            {
                tax = 3000.00;
            }
            txtPrice.clear();

            txtOutput.appendText("The tax of the Property is €: " + tax);
        }
        catch (NumberFormatException exception)
        {
            txtOutput.setText("Exception: Please enter the Property Price to calculate the tax.");

        }
    }//end calculateTax Method

    //deleteProperty method
    public void deleteProperty(ActionEvent e) 
    {
        try 
        {
            txtOutput.clear();
            // If not found
            boolean isFound = false;
            int propertyNum = Integer.parseInt(txtDelete.getText());
            for (int i = 0; i < propertyList.size(); i++) 
            {
                if(propertyNum == propertyList.get(i).getPropertyNo())
                {
                    //Remove that property from the arrayList at that Position
                    propertyList.remove(i);
                    isFound = true;
                    a.setAlertType(AlertType.INFORMATION);
                    a.setContentText("Property Successfully Deleted");
                    a.show();
                    txtDelete.clear();

                }
            }//end for loop

            if (isFound == false) 
            {
                txtOutput.setText("No property found matching to this Number");
                txtDelete.clear();
            }
        }
        catch (NumberFormatException exception) 
        {
            txtOutput.setText("Exception: Please fill the Property Number.");
            txtDelete.clear();
        }
    }// End deleteProperty method




    public static void main(String[] args)
    {
        launch(args);
    }
}//end Property GUI 

