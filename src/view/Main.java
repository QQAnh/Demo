package view;

import entity.Student;
import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Tab;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ChartView.fxml"));
        primaryStage.setTitle("Biểu đồ");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        //Biểu đồ tổng tiền phạt của cả lớp
//        NumberAxis moneyTotalYAxis = new NumberAxis();
//        ObjectProperty<String> stringObjectProperty = moneyTotalYAxis.labelProperty();
//        CategoryAxis moneyTotalXAxis = new CategoryAxis();
//        BarChart moneyTotalChart =  new BarChart(moneyTotalXAxis, moneyTotalYAxis);
//        //Biểu đồ tổng số lần chống đẩy của cả lớp
//        NumberAxis pushUpTotalYAxis = new NumberAxis();
//        CategoryAxis pushUpTotalXAxis = new CategoryAxis();
//        BarChart pushUpTotalChart =  new BarChart(pushUpTotalXAxis, pushUpTotalYAxis);
//        //Stack ghép 2 biểu đồ
//        StackPane totalChartStack = new StackPane();
//        totalChartStack.getChildren().addAll(moneyTotalChart,pushUpTotalChart);
//
//        Tab totalChartTab = new Tab("Tổng số");
//
//    }
}
