package inheritanceExample

class test {
   var salary:Float = 10000 
}

class programmer extends test {
  var bonus:Int = 5000
  println("Salary ="+salary)
  println("Bonus ="+bonus)
}

object MainObject {
  def main(args:Array[String]){
    new programmer()
  }
}