package fr.epita.titanic;

import java.util.ArrayList;
import java.util.List;

import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.demo.charts.ExampleChart;

public class PieChartSample implements ExampleChart<PieChart>  {
	
    
	@Override
	public PieChart getChart() {
	    // Create Chart
	    PieChart chart = new PieChartBuilder().width(800).height(600).title(getClass().getSimpleName()).build();
	    // chart.getStyler().setCircular(false);
	    // Series
	    int male = 0;
		int female = 0;
		int survived = 0;
	    int var=0;
	    
	    //looping through read csv to count no of male and female
	    int i = 0;
	    
	    for (i=0;i<Main.result.size();i++)
	    {
	    	if (! Main.result.get(i).getSex().contains("female"))
	   
	    	
	    	{
	    		male++;
	    		
	    		
	    	}
	    	if (Main.result.get(i).getSex().contains("female"))
	    		   
		    	
	    	{
	    		female++;
	    		
	    		
	    	}

	    	var = Main.result.get(i).getSurvived(); 
	    	//System.out.print(var);
	    	if (var == 1)
	    	{
	    		//System.out.print(var);
	    		survived++;
	    		//System.out.print(survived);
	    	}
	    	
	    }


	    chart.addSeries("A", male);
	    chart.addSeries("B", female);

		return chart;
	}

}