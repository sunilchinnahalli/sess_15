package com.scala.session15

class sumfunction {
  
}

object MainObject {
  def main(args:Array[String]){
    println("square root of a number:" + sqrt(sum, 2, 1)) 
  }
  
  def sum(a:Int,b:Int) : Int = {
    val c : Int = 1
    val sum: Int = a + b + c
    return sum
  }
  def sqrt(f: (Int,Int) => Int,x:Int,y:Int): Int = {
    val result: Int = f(x,y)
    val sqrtval: Int = result * result
    return sqrtval
  }
}