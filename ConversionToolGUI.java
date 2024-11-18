import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversionToolGUI {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Unit Conversion Tool");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Create panels
        JPanel mainPanel = new JPanel(new GridLayout(5, 1));
        JPanel categoryPanel = new JPanel();
        JPanel conversionPanel = new JPanel();
        JPanel inputPanel = new JPanel();
        JPanel resultPanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        // Category selection
        JLabel categoryLabel = new JLabel("Select Category:");
        String[] categories = {"Length/Distance", "Mass/Weight", "Volume", "Temperature", "Speed", "Area"};
        JComboBox<String> categoryComboBox = new JComboBox<>(categories);
        categoryPanel.add(categoryLabel);
        categoryPanel.add(categoryComboBox);

        // Conversion selection
        JLabel conversionLabel = new JLabel("Select Conversion:");
        JComboBox<String> conversionComboBox = new JComboBox<>();
        conversionPanel.add(conversionLabel);
        conversionPanel.add(conversionComboBox);

        // Input value
        JLabel inputLabel = new JLabel("Enter Value:");
        JTextField inputField = new JTextField(10);
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);

        // Result display
        JLabel resultLabel = new JLabel("Result: ");
        JLabel resultValue = new JLabel("-");
        resultPanel.add(resultLabel);
        resultPanel.add(resultValue);

        // Button
        JButton convertButton = new JButton("Convert");
        buttonPanel.add(convertButton);

        // Add all panels to the main panel
        mainPanel.add(categoryPanel);
        mainPanel.add(conversionPanel);
        mainPanel.add(inputPanel);
        mainPanel.add(resultPanel);
        mainPanel.add(buttonPanel);

        // Add main panel to the frame
        frame.add(mainPanel);
        frame.setVisible(true);

        // Populate conversion options based on selected category
        categoryComboBox.addActionListener(e -> {
            conversionComboBox.removeAllItems();
            switch (categoryComboBox.getSelectedIndex()) {
                case 0 -> {
                    conversionComboBox.addItem("Inches to Centimeters");
                    conversionComboBox.addItem("Feet to Inches");
                    conversionComboBox.addItem("Yards to Feet");
                    conversionComboBox.addItem("Miles to Kilometers");
                    conversionComboBox.addItem("Yards to Meters");
                    conversionComboBox.addItem("Miles to Feet");
                }
                case 1 -> {
                    conversionComboBox.addItem("Ounces to Grams");
                    conversionComboBox.addItem("Pounds to Kilograms");
                    conversionComboBox.addItem("Kilograms to Pounds");
                    conversionComboBox.addItem("Tonnes to Kilograms");
                }
                case 2 -> {
                    conversionComboBox.addItem("Teaspoons to Milliliters");
                    conversionComboBox.addItem("Tablespoons to Milliliters");
                    conversionComboBox.addItem("Fluid Ounces to Milliliters");
                    conversionComboBox.addItem("Cups to Milliliters");
                    conversionComboBox.addItem("Gallons to Liters");
                }
                case 3 -> {
                    conversionComboBox.addItem("Celsius to Fahrenheit");
                    conversionComboBox.addItem("Fahrenheit to Celsius");
                    conversionComboBox.addItem("Kelvin to Celsius");
                    conversionComboBox.addItem("Celsius to Kelvin");
                }
                case 4 -> {
                    conversionComboBox.addItem("Miles per Hour to Kilometers per Hour");
                    conversionComboBox.addItem("Feet per Second to Meters per Second");
                    conversionComboBox.addItem("Kilometers per Hour to Miles per Hour");
                }
                case 5 -> {
                    conversionComboBox.addItem("Square Inches to Square Centimeters");
                    conversionComboBox.addItem("Square Feet to Square Meters");
                    conversionComboBox.addItem("Square Yards to Square Meters");
                    conversionComboBox.addItem("Square Miles to Square Kilometers");
                    conversionComboBox.addItem("Acres to Square Meters");
                }
            }
        });

        // Perform conversion on button click
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double value = Double.parseDouble(inputField.getText());
                    String resultText = "";
                    switch (categoryComboBox.getSelectedIndex()) {
                        case 0 -> {
                            switch (conversionComboBox.getSelectedIndex()) {
                                case 0 -> resultText = value + " inches = " + (value * 2.54) + " cm";
                                case 1 -> resultText = value + " feet = " + (value * 12) + " inches";
                                case 2 -> resultText = value + " yards = " + (value * 3) + " feet";
                                case 3 -> resultText = value + " miles = " + (value * 1.60934) + " km";
                                case 4 -> resultText = value + " yards = " + (value * 0.9144) + " meters";
                                case 5 -> resultText = value + " miles = " + (value * 5280) + " feet";
                            }
                        }
                        case 1 -> {
                            switch (conversionComboBox.getSelectedIndex()) {
                                case 0 -> resultText = value + " ounces = " + (value * 28.3495) + " grams";
                                case 1 -> resultText = value + " pounds = " + (value * 0.453592) + " kilograms";
                                case 2 -> resultText = value + " kilograms = " + (value * 2.20462) + " pounds";
                                case 3 -> resultText = value + " tonnes = " + (value * 1000) + " kilograms";
                            }
                        }
                        // Add remaining cases for Volume, Temperature, Speed, and Area
                    }
                    resultValue.setText(resultText);
                } catch (NumberFormatException ex) {
                    resultValue.setText("Invalid input!");
                }
            }
        });
    }
}
