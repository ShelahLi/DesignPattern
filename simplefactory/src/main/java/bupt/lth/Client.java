import exceptions.UnSupportedShapeException;
import utils.XMLUtil;

public class Client {

    public static void main(String[] args) {
        AbstarctChart chart;
        try {
            String type = XMLUtil.getChartType();
            chart = ChartFactory.getChart(type);
            chart.display();
//            chart = ChartFactory.getChart("pie");
//            chart.display();
//            chart.delete();
        } catch (UnSupportedShapeException e) {
            e.printStackTrace();
        }

    }
}
