package training

import org.apache.spark.{SparkConf, SparkContext}


object SparkExample extends App {

  val SparkConf = new SparkConf ()
    .setMaster("local[*]")
    .setAppName ("Name")

  val SparkContext = new SparkContext()
  val l = List().map(line =>
    {
      val mySplit=line.split("\t")
      {muSplit(),}
    })

  sc.close()
}
