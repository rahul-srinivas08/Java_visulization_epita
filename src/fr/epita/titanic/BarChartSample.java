package fr.epita.titanic;

import java.util.Arrays;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.demo.charts.ExampleChart;
import org.knowm.xchart.style.Styler.LegendPosition;

public class BarChartSample implements ExampleChart<CategoryChart> {

	  @Override
	  public CategoryChart getChart() {
	 
	    // Create Chart
	    CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Score Histogram").xAxisTitle("Score").yAxisTitle("Number").build();
	 
	    // Customize Chart
	    chart.getStyler().setLegendPosition(LegendPosition.InsideNW);
	    chart.getStyler().setHasAnnotations(true);
	    int lessten = 0;
		int lesstwenty = 0;
		int lessthirty = 0;
	    int lessforty=0;
	    int restall = 0;
	    int lessfifty = 0;
	    int var = 0;
	    int var1 = 0;
	    int i = 0;
	    int var2 = 0;
	    //looping to main.result input file for how many are less by 10,20,30,40,50,>60
	    for (i=0;i<Main.result.size();i++)
	    {
	    	var = Main.result.get(i).getSurvived();
	    	var1 = (int) Main.result.get(i).getAge();
	    	var2 = (int) Main.result.get(i).getAge();
	    	if (var == (1) & var1 <= 10)
	    	{
//	    		System.out.print(var);
//	    		System.out.print(var1);
	    		lessten++;
	    	}
	    	if (var == (1) & var1>10 & var2 <= 20)
	    	{
	    		
	    		lesstwenty++;
	    		
	    	}
	    	if (var == (1) & var1>20 & var2 <= 30)
	    	{
	    		lessthirty++;
	    	}
	    	if (var == (1) & var1>30 & var2 <= 40)
	    	{
	    		lessforty++;
	    	}
	    	if (var == (1) & var1>40 & var2 <= 50)
	    	{
	    		lessfifty++;
	    	}
	    	if (var == (1) & var1 > 50)
	    	{
	    		restall++;
	    	}
	    }
//	    System.out.println(lessten);
//	    System.out.println(lesstwenty);
//	    System.out.println(lessthirty);
//	    System.out.println(lessforty);
//	    System.out.println(lessfifty);
//	    System.out.println(restall);
	    chart.addSeries("age category in survived people", Arrays.asList(new String[] { "10","20","30","40","50",">50 all" }), Arrays.asList(new Integer[] {lessten, lesstwenty, lessthirty, lessforty, lessfifty,restall }));
	 
	    return chart;
	  }
}
