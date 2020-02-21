package fr.epita.titanic;

import java.util.Arrays;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.demo.charts.ExampleChart;
import org.knowm.xchart.style.Styler.LegendPosition;

public class BarChart2 implements ExampleChart<CategoryChart>{

	 @Override
	  public CategoryChart getChart() {
		 int pclass = 0;
		 int male = 0;
		 int firstfemale = 0;
		 int secondfemale = 0;
		 int thirdfemale = 0;
		 int survived = 0;
		 int firstmale = 0;
		 int secondmale = 0;
		 int thirdmale = 0;
	    // Create Chart
	    CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Score Histogram").xAxisTitle("Score").yAxisTitle("Number").build();
	    
	    // Customize Chart
	    chart.getStyler().setLegendPosition(LegendPosition.InsideNW);
	    chart.getStyler().setHasAnnotations(true);
	    //looping each to get pclass,female and survived
	    int i = 0;
	    for (i=0;i<Main.result.size();i++)
	    {
	    	pclass = Main.result.get(i).getPclass();
	    	boolean temp = Main.result.get(i).getSex().contains("female");
	    	survived = Main.result.get(i).getSurvived();
	    	if (pclass == 1 & temp == true & survived == 1)
	    	{
	    		firstfemale++;
	    	}
	    	if (pclass == 2 & temp == true & survived == 1)
	    	{
	    		secondfemale++;
	    	}
	    	if (pclass == 3 & temp == true & survived == 1)
	    	{
	    		thirdfemale++;
	    	}
	    	if (pclass == 1 & temp == false & survived == 1)
	    	{
	    		firstmale++;
	    	}
	    	if (pclass == 2 & temp == false & survived == 1)
	    	{
	    		secondmale++;
	    	}
	    	if (pclass == 3 & temp == false & survived == 1)
	    	{
	    		thirdmale++;
	    	}
	    }
	    // Series
	    chart.addSeries("female and male survive and dead in each class", Arrays.asList(new String[] { "no of female survived in pclas:1 ","no of female survived in pclas:2 ","no of female survived in pclas:3 ","no of male survived in pclas:1 ","no of male survived in pclas:2 ","no of male survived in pclas:3 " }),
	    		Arrays.asList(new Integer[] {firstfemale,secondfemale,thirdfemale,firstmale,secondmale,thirdmale }));
	 
	    return chart;
	  }
	}
