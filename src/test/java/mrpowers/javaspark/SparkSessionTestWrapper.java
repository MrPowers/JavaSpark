package mrpowers.javaspark;

import org.apache.spark.sql.SparkSession;

public interface SparkSessionTestWrapper {

    SparkSession spark = SparkSession
            .builder()
            .appName("Build a DataFrame from Scratch")
            .master("local[*]")
            .getOrCreate();

}
