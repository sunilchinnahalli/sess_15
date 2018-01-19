package com.scala.session15.task2

class switchdemo {
  
}

object Demo {
   def main(args: Array[String]) {
      println(matchTest("Android"))
      println(matchTest("Java"))
   }
   
   def matchTest(x: String): Int = x match {
      case "Android" => 12999
      case "Big Data Development" => 17999
      case "spark" => 19999
      case _ => 20000
   }
}