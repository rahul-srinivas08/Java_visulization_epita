package fr.epita.titanic;

import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.PieSeries.PieSeriesRenderStyle;
import org.knowm.xchart.demo.charts.ExampleChart;
import org.knowm.xchart.style.PieStyler.AnnotationType;

public class DonutChart implements ExampleChart<PieChart> {

	private boolean temp;

	@Override
	public PieChart getChart() {
	    // Create Chart
	    PieChart chart = new PieChartBuilder().width(800).height(600).title(getClass().getSimpleName()).build();
	    int male = 0;
		int female = 0;
		int survived = 0;
		int survivedman = 0;
		int survivedfemale = 0;
	    int var=0;	 
	    // Customize Chart
	    chart.getStyler().setLegendVisible(false);
	    chart.getStyler().setAnnotationType(AnnotationType.Label);
	    chart.getStyler().setAnnotationDistance(.82);
	    chart.getStyler().setPlotContentSize(.9);
	    chart.getStyler().setDefaultSeriesRenderStyle(PieSeriesRenderStyle.Donut);

	    int i = 0;
	    //looping to cound dead and survived female and male
	    for (i=0;i<Main.result.size();i++)
	    {
	    	 temp =  Main.result.get(i).getSex().contains("female");
	    	 var = Main.result.get(i).getSurvived(); 
	    	 
	    	 //System.out.print(temp);
	    	 if (temp==true  & var == 0)
	    	 {
	    		 female++; 
	    	 }
	    	 if (temp==false  & var == 0)
	    	 {
	    		 male++; 
	    	 }	    	 
	    	 if (temp==true  & var == 1)
	    	 {
	    		 survivedfemale++; 
	    	 }
	    	 if (temp==false  & var == 1)
	    	 {
	    		 survivedman++; 
	    	 }	    	
	    }
	    
	    
	    
	    
	    // Series
//	    System.out.println(female);
//	    System.out.println(male);

	    chart.addSeries("dead no of female", female);
	    chart.addSeries("dead no of male", male);
	    chart.addSeries("survived no of male", survivedman);
	    chart.addSeries("survived no of female", survivedfemale);
	 
	    return chart;	    
	    
	}

}
