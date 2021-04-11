//Sai Abbavaram
//3-28-21
//CPSC 24500
//This program demonstrates the use and implementation of Java GUI. 

//all the imports used for the GUI component
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//root class to initiate the application
public class HW10 extends Application {

	//text area to print the output
	private TextArea output = new TextArea("");

	//main program to start the execution
	public static void main(String[] args) {
        launch(args);
    }

	//start method from Application class 
    @Override
    public void start(Stage primaryStage) throws Exception {

    	//label to print the prime interest rate message
        Label primeInterestRate=new Label("prime interest rate");
        //text field to hold the value of prime interest rate
        TextField tf1=new TextField();
        //limiting the width of text field to 30 px
        tf1.setMaxWidth(30);

        //labels to show to relevant field text
        Label loanType = new Label("Loan Type");
        Label loanNumber = new Label("Loan Number");
        Label lastName = new Label("Last Name");
        Label loanAmount = new Label("Loan Amount");
        Label loanTerm = new Label("Loan Term");


        //comboBox to make the loan type with their prompt text embedded in the drop down itself        
        ComboBox comboBox1 = new ComboBox();
        comboBox1.getItems().add("Personal loan");
        comboBox1.getItems().add("Business Loan");
        comboBox1.setPromptText("Loan Type");


        ComboBox comboBox2 = new ComboBox();
        comboBox2.getItems().add("Personal loan");
        comboBox2.getItems().add("Business Loan");
        comboBox2.setPromptText("Loan Type");
        comboBox2.getItems().addAll("personal","business");

        ComboBox comboBox3 = new ComboBox();
        comboBox3.getItems().add("Personal loan");
        comboBox3.getItems().add("Business Loan");
        comboBox3.setPromptText("Loan Type");

        ComboBox comboBox4 = new ComboBox();
        comboBox4.getItems().add("Personal loan");
        comboBox4.getItems().add("Business Loan");
        comboBox4.setPromptText("Loan Type");

        ComboBox comboBox5 = new ComboBox();
        comboBox5.getItems().add("Personal loan");
        comboBox5.getItems().add("Business Loan");
        comboBox5.setPromptText("Loan Type");

        //array to hold the 5 combobox
        ComboBox[] loanTypeArr = new ComboBox[]{comboBox1,comboBox2,comboBox3,comboBox4,comboBox5};

        //5 text fields to hold the loan numbers
        TextField loanNumber1=new TextField();
        loanNumber1.setMaxWidth(115);
        TextField loanNumber2=new TextField();
        loanNumber2.setMaxWidth(115);
        TextField loanNumber3=new TextField();
        loanNumber3.setMaxWidth(115);
        TextField loanNumber4=new TextField();
        loanNumber4.setMaxWidth(115);
        TextField loanNumber5=new TextField();
        loanNumber5.setMaxWidth(115);
        //array to hold all 5 text fields for loan number
        TextField[] loanNumberArr = new TextField[]{loanNumber1,loanNumber2,loanNumber3,loanNumber4,loanNumber5};

        //text fields for last name
        TextField lastName1=new TextField();
        TextField lastName2=new TextField();
        TextField lastName3=new TextField();
        TextField lastName4=new TextField();
        TextField lastName5=new TextField();
        //array to hold 5 text field from last name
        TextField[] lastNameArr = new TextField[]{lastName1,lastName2,lastName3,lastName4,lastName5};

        //text field for loan amount
        TextField loanAmount1=new TextField();
        TextField loanAmount2=new TextField();
        TextField loanAmount3=new TextField();
        TextField loanAmount4=new TextField();
        TextField loanAmount5=new TextField();
        //array to hold all 5 text field from loan amount
        TextField[] loanAmountArr = new TextField[]{loanAmount1,loanAmount2,loanAmount3,loanAmount4,loanAmount5};

        //text field for loan term
        TextField loanTerm1=new TextField();
        //setting maximum width to 40 px
        loanTerm1.setMaxWidth(40);
        TextField loanTerm2=new TextField();
        loanTerm2.setMaxWidth(40);
        TextField loanTerm3=new TextField();
        loanTerm3.setMaxWidth(40);
        TextField loanTerm4=new TextField();
        loanTerm4.setMaxWidth(40);
        TextField loanTerm5=new TextField();
        loanTerm5.setMaxWidth(40);

        //array to hold 5 object for loan term
        TextField[] loanTermArr = new TextField[]{loanTerm1,loanTerm2,loanTerm3,loanTerm4,loanTerm5};

        //submit button
        Button b = new Button("Submit");

        //making a grid pane to put all the component created above
        GridPane root = new GridPane();
        //setting padding and gaps between each component
        root.setPadding(new Insets(5, 5, 5, 5));
        root.setHgap(5);
        root.setVgap(5);
        //putting prime interest rate component in first row
        root.addRow(0, primeInterestRate, tf1);
        //putting comboBox for loan type, loan number, last name, amount, term in each row 5 times
        root.addRow(1, comboBox1,loanNumber,loanNumber1,lastName,lastName1,loanAmount,loanAmount1,loanTerm,loanTerm1);
        root.addRow(2, comboBox2,new Label("Loan Number"),loanNumber2,new Label("Last Name"),lastName2,new Label("Loan Amount"),loanAmount2,new Label("Loan Term"),loanTerm2);
        root.addRow(3, comboBox3,new Label("Loan Number"),loanNumber3,new Label("Last Name"),lastName3,new Label("Loan Amount"),loanAmount3,new Label("Loan Term"),loanTerm3);
        root.addRow(4, comboBox4,new Label("Loan Number"),loanNumber4,new Label("Last Name"),lastName4,new Label("Loan Amount"),loanAmount4,new Label("Loan Term"),loanTerm4);
        root.addRow(5, comboBox5,new Label("Loan Number"),loanNumber5,new Label("Last Name"),lastName5,new Label("Loan Amount"),loanAmount5,new Label("Loan Term"),loanTerm5);
        //adding submit button in last row
        root.addRow(6, b);


        //event listener to the submit button which gets trigger on press of submit
        EventHandler<ActionEvent> buttonHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	//creating array of 5 loan objects
                Loan[] loanArr = new Loan[5];
                for(int i =0;i<5;i++)
                {
                	//iterating 5 times, getting the value from respective drop down for the selected value
                    String choice = (String) loanTypeArr[i].getValue();
                    System.out.println(choice);
                    //based on selected value will create the appropriate loan object
                    if(choice.equalsIgnoreCase("personal loan"))
                    {
                        loanArr[i] = new PersonalLoan(Integer.parseInt(loanNumberArr[i].getText()),lastNameArr[i].getText(),Double.parseDouble(loanAmountArr[i].getText()),Integer.parseInt(loanTermArr[i].getText()),Double.parseDouble(tf1.getText()));
                    }
                    else
                    {
                        loanArr[i] = new BusinessLoan(Integer.parseInt(loanNumberArr[i].getText()),lastNameArr[i].getText(),Double.parseDouble(loanAmountArr[i].getText()),Integer.parseInt(loanTermArr[i].getText()),Double.parseDouble(tf1.getText()));
                    }

                }


                //creating the string buffer to make output string
                StringBuilder sb = new StringBuilder();
                //iterating over loan array
                for(Loan loan : loanArr)
                {
                	//appending output result in string buffer
                    sb.append("\n").append(loan.toString());
                    System.out.println(loan.toString());

                }

                //setting the text to output textArea
                output.setText(sb.toString());
                event.consume();
            }
        };

        //attaching the event listener to the button
        b.setOnAction(buttonHandler);

        //root.addRow(7,new Label("Output"),output);

        //creating another pane to put output area with label
        Pane pane2 = new Pane();
        //putting label with respective location
        Label outputLabel = new Label("output");
        outputLabel.setLayoutX(10);
        outputLabel.setLayoutY(250);
        //putting output area at the specified location
        output.setLayoutX(100);
        output.setLayoutY(250);
        //adding component in pane
        pane2.getChildren().add(outputLabel);
        pane2.getChildren().add(output);


        //making parent pane for both the above pane's
        StackPane rootPane = new StackPane();

        //adding both pane into parent pane as children
        rootPane.getChildren().addAll(root,pane2);
        //adding parent pane in scene with the specified window size
        Scene scene=new Scene(rootPane,900,500);
        //setting scene to stage
        primaryStage.setScene(scene);
        //setting the title
        primaryStage.setTitle("Loan Creator");
        //showing the stage as application
        primaryStage.show();
        

    }
}
