
object quiz03 {
   class Account(id:String, n: Int, b: Double)
   {
  
      val nic:String = id
      val accNumber: Int = n
      var balance: Double = b
  
      override def toString: String = "[" + nic + ":" + accNumber + ":" + balance + "]"
  
      def withdraw(a: Double): Unit = this.balance -= a   
      def deposit(a: Double): Unit = this.balance += a
      
      def transfer(acc: Account, b: Double) = {
        this.withdraw(b)
        acc.deposit(b)
      }
}
  def main(args:Array[String])
	{
		val account1 = new Account("972032000v", 8657013, 25000)
		val account2 = new Account("657082345v", 8637112, 10000)
		
    println("First account details : "+ account1.toString)
    account1.deposit(5000)
    println("Credited 5000 to " + account1.accNumber + " -> " + account1.toString)
    account1.withdraw(2000)
    println("Debited 2000 from " + account1.accNumber + " -> " + account1.toString)
    println();
		
    
    println("Second account details : " + account2.toString)
    account1.transfer(account2,5000)
    println("Transferring 5000 from " + account1.accNumber + " to " + account2.accNumber )
    println("Debited 5000 from " + account1.accNumber + " -> " + account1.toString)
    println("Credited 5000 to " + account2.accNumber + " -> " + account2.toString)
	}


}