package Task.Task_14102024TypeCasting;

public class Lab_014WideningExplicit {
    public static void main(String[] args){
        //Real-time Example: Data Aggregation in Big Data Systems
        // Imagine you’re working with a data aggregation system where initial data points are recorded as short
        // values. For more accurate processing and calculations, you need to convert these short values to float.
        short dataPoint = 320;
        // Explicitly widening from short to float
        float aggregatedData = (float) dataPoint;

        System.out.println("Aggregated Data: " + aggregatedData);
    }
}
