package fr.epita.titanic;

import java.util.LinkedList;
import java.util.List;


import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.demo.charts.ExampleChart;
import org.knowm.xchart.style.Styler.LegendPosition;

public class PlotChart implements ExampleChart<XYChart> {


	  @Override
	  public XYChart getChart() {
	 
	    // Create Chart
	    XYChart chart = new XYChartBuilder().width(800).height(600).build();
	 
	    // Customize Chart
	    chart.getStyler().setDefaultSeriesRenderStyle(XYSeriesRenderStyle.Scatter);
	    chart.getStyler().setChartTitleVisible(false);
	    chart.getStyler().setLegendPosition(LegendPosition.InsideSW);
	    chart.getStyler().setMarkerSize(16);
	 
	    // Series
	    List<Double> xData = new LinkedList<Double>();
	    List<Double> yData = new LinkedList<Double>();

	    int i = 0;
	    double var = 0;
	    double var2;
	    // looping to get fare and age of people
	    for (i=0;i<Main.result.size();i++)
	    	 
	    {
	    	var = Main.result.get(i).getAge();
	    	var2 = Main.result.get(i).getFare();
	    	xData.add(var);
	    	yData.add(var2);
	    }
	    chart.addSeries("Scatter plot Fare vs Age", xData, yData);
	 
	    return chart;
	  }
	 
	}
