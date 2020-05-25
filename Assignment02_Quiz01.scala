

object Assignment02_Quiz01 {
  def main(args: Array[String]) {
      var normalHours:Int=50;
      var otHours:Int=20;
      var salary:Double=takeHome(normalHours, otHours);
      println("Take home salary of an employee  -> Rs. "+salary);
  }
  
  def wage(h:Int):Int={
    var totalWage= h*150;
    return totalWage;
  }
  def ot(h:Int):Int={
    var totalOt= h*75;
    return totalOt;
  }
  def income(h1:Int, h2:Int):Int={
    var totalIncome= wage(h1)+ot(h2);
    return totalIncome;
  }
  def tax(income:Int):Double={
    var tax= income*0.1;
    return tax;
  }
  def takeHome(h1:Int, h2:Int):Double={
    var takeHomeSalary= income(h1,h2)-tax(income(h1,h2));
    return takeHomeSalary;
  }
}