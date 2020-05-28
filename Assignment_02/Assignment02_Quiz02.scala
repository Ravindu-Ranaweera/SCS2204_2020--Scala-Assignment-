

object Assignment02_Quiz02 {
  def main(args: Array[String]) {
    println("\n Ticket price 5: "+profit(5)+"\n Ticket price 10: "+ profit(10)+"\n Ticket price 15: "+ profit(15)+"\n Ticket price 20: "+profit(20)+"\n Ticket price 25: "+profit(25)+"\n Ticket price 30: "+ profit(30)+"\n Ticket price 35: "+ profit(35)+"\n Ticket price 40: "+profit(40));
    val maxValue= List(profit(5), profit(10), profit(15),profit(20),profit(25), profit(30), profit(35),profit(40)) 
    val result = maxValue.max 
    println("\n Best price: " +result)   
    
  }
  
  def attendees(price:Int):Int={
    120+(15-price)/5*20
  }
  def revenue(price:Int):Int = {
    attendees(price)*price
  }
  def cost(price:Int):Int={
    500+attendees(price)
  }
  def profit(price:Int):Int ={
    revenue(price)- cost(price)
  }

}