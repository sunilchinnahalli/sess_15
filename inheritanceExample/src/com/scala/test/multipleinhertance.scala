package com.scala.test


class multipleinhertance {
  var salary1 = 10000
}

class B extends multipleinhertance {
  val salary2 = 200000
}

class c extends B{
  def show(){
    println("salary1 = "+salary1)
    println("salary2 = "+salary2)
  }
}

object MainObject {
  def main(args:Array[String]){
    var c = new c()
    c.show()
  }
}