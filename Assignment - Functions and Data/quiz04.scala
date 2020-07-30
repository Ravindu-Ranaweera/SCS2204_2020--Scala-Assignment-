import scala.collection.immutable._  
import scala.math.BigDecimal
object quiz04 extends App {
    class Account (id:String,n:Int,b:Double){
        val nic : String = id
        val acc_number: Int = n
        var balance : Double = b

        override def toString = nic+ " : " + acc_number + " : Rs " + BigDecimal(balance).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble

        
        def transfer (acc : Account, transferAmount:Double){
            this.balance=this.balance-transferAmount
            acc.balance=acc.balance+transferAmount;
        }
    }
    var BankAccounts  : List[Account] = List(new Account("972032000v",8943123,56750.68),new Account("919765466V",8434654,23987.32),new Account("95432345V",8765443,15432.32),
   new Account("20086757V",876543,4500.90),new Account("864323456V",891558,156765.68),new Account("65313378v",8765432,9876.45))
   
    println()
    println("The Bank Deatails Before the Transfer\n")
    for ( element <- BankAccounts){
        println(element)
    }
    println("\n")
    println("The Bank Deatails After the Transfer\n")
    BankAccounts(0).transfer(BankAccounts(1),145520.80)
    BankAccounts(2).transfer(BankAccounts(3),253565.40)
    BankAccounts(5).transfer(BankAccounts(4),15920.46)

     for ( element <- BankAccounts){
        println(element)
    }
    val overdraft = (accountlist:List[Account])=>accountlist.filter(x=>x.balance < 0)
    println("\n")
    println("The Negetive balance Accounts :\n")
    for ( element <- overdraft(BankAccounts)){
        println(element)
    }
    val balance =(accountlist:List[Account])=>accountlist.reduce((x,y)=>new Account(x.nic,x.acc_number,x.balance+y.balance))
      println("Total Amount of the accounts Rs:" + balance(BankAccounts).balance + "\n")

    val interst = (accountlist:List[Account])=>accountlist.map(x=>{if(x.balance>0) new Account(x.nic,x.acc_number,x.balance*1.05) else (new Account(x.nic,x.acc_number,x.balance*1.10))})
    for ( element <- interst(BankAccounts)){
        println(element)
    }
}