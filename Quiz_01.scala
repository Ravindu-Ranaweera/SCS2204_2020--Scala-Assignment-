

object Quiz_01 {
  def main(args: Array[String]) {
      var celsius:Double=35.00;
      var temperature:Double=convert_temp(celsius);
      println("35°C -> "+temperature+"°F");
  }
  
  def convert_temp(temp:Double):Double={
    var fahrenheit=temp*1.8000+32.00;
    return fahrenheit;
  }
}