

object Quiz_03 {
  def main(args:Array[String])
  {
    var no_of_copies:Int=60;
    var total_cost:Double=bookPrice(no_of_copies)-discount(bookPrice(no_of_copies))+shippingCost(no_of_copies);
    println("Total wholesale cost for 60 copies -> "+total_cost);
  }
  
  def bookPrice(n:Int):Double={
    return n*24.95;
  }
  def discount(amount:Double):Double={
    return amount*0.4;
  }
  def shippingCost(x:Int):Double={
    return (x*3)-(x-50*0.75);
  }
}