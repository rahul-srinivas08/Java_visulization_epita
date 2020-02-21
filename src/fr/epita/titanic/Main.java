package fr.epita.titanic;
	import fr.epita.titanic.ReadCSV;
	import fr.epita.titanic.Datahold;
	import java.io.IOException;
	import java.text.ParseException;
	import java.util.LinkedHashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.function.ToIntFunction;
	import java.io.FileNotFoundException;
	import java.text.ParseException;
	import java.util.ArrayList;
	import java.util.List;
	import fr.epita.titanic.Datahold;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.PieChart;
	import org.knowm.xchart.PieChartBuilder;
	import org.knowm.xchart.PieSeries.PieSeriesRenderStyle;
	import org.knowm.xchart.QuickChart;
	import org.knowm.xchart.SwingWrapper;
	import org.knowm.xchart.XYChart;
	import org.knowm.xchart.demo.charts.ExampleChart;
	import org.knowm.xchart.demo.charts.pie.PieChart02;
	import org.knowm.xchart.demo.charts.pie.PieChart04;
	import org.knowm.xchart.style.PieStyler.AnnotationType;

	public class Main  {
		static List<Datahold> result = new ArrayList();
		
		public static void main(String[] args) throws FileNotFoundException, ParseException {
			ReadCSV dao = new ReadCSV();
			result = dao.readAll();

			
			//System.out.println(result.size());
			//creating piechart with total number of male and female
		    ExampleChart<PieChart> exampleChart = new PieChartSample();
		    PieChart chart = exampleChart.getChart();
		    new SwingWrapper<PieChart>(chart).displayChart();
		    
		    //creating barchart for total number people present from 10 to >60 
		    ExampleChart<CategoryChart> exampleChart1 = new BarChartSample();
		    CategoryChart chart1 = exampleChart1.getChart();
		    new SwingWrapper<CategoryChart>(chart1).displayChart();
		    
		    //creating donochart for survived and dead male and female
		    ExampleChart<PieChart> exampleChart11 = new DonutChart();
		    PieChart chart11 = exampleChart11.getChart();
		    new SwingWrapper<PieChart>(chart11).displayChart();
		    
		    //creating barchart for total number of male and female in each class
		    ExampleChart<CategoryChart> exampleChart12 = new BarChart2();
		    CategoryChart chart12 = exampleChart12.getChart();
		    new SwingWrapper<CategoryChart>(chart12).displayChart();

		    
		    //creating scattering plot for age vs fare
		    ExampleChart<XYChart> exampleChart13 = new PlotChart();
		    XYChart chart13 = exampleChart13.getChart();
		    new SwingWrapper<XYChart>(chart13).displayChart();		    
		    
		  }
		
		
}
