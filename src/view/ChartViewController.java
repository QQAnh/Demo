package view;

import entity.Student;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ChartViewController implements Initializable {
    static XYChart.Series moneyTotalSeries;
    static XYChart.Series pushUpTotalSeries;
    static Student student1;
    static XYChart.Series moneyStudent1Series;
    static XYChart.Series pushUpStudent1Series;
    static Student student2;
    static XYChart.Series moneyStudent2Series;
    static XYChart.Series pushUpStudent2Series;
    static Student student3;
    static XYChart.Series moneyStudent3Series;
    static XYChart.Series pushUpStudent3Series;
    static ArrayList<PieChart.Data> moneyPieData;
    static ArrayList<PieChart.Data> pushUpPieData;

    @FXML
    private BarChart moneyTotalChart;
    @FXML
    private CategoryAxis moneyTotalXAxis;
    @FXML
    private NumberAxis moneyTotalYAxis;
    @FXML
    private BarChart pushUpTotalChart;
    @FXML
    private CategoryAxis pushUpTotalXAxis;
    @FXML
    private NumberAxis pushUpTotalYAxis;
    @FXML
    private BarChart moneyDetailChart;
    @FXML
    private CategoryAxis moneyDetailXAxis;
    @FXML
    private NumberAxis moneyDetailYAxis;
    @FXML
    private BarChart pushUpDetailChart;
    @FXML
    private CategoryAxis pushUpDetailXAxis;
    @FXML
    private NumberAxis pushUpDetailYAxis;
    @FXML
    private TextField student1Field;
    @FXML
    private TextField student2Field;
    @FXML
    private TextField student3Field;
    @FXML
    private DatePicker fromDatePick;
    @FXML
    private DatePicker toDatePick;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
