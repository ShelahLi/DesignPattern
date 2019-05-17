import exceptions.UnSupportedShapeException;

public class ChartFactory {
    public static AbstarctChart getChart(String chartName) throws UnSupportedShapeException {
        if(!chartName.equalsIgnoreCase("pie") && !chartName.equalsIgnoreCase("histogram")){
            throw new UnSupportedShapeException("不支持该绘制此图");
        }
        AbstarctChart chart = null;
        if(chartName.equalsIgnoreCase("histogram")){
            //初始化设置product
            chart = new HistogramChart();
            System.out.println("初始化柱状图");
            return chart;

        }else if (chartName.equalsIgnoreCase("pie")){
            //初始化设置product
            chart = new PieChart();
            System.out.println("初始化饼状图");
            return chart;

        }else {
            return null;
        }

    }
}
