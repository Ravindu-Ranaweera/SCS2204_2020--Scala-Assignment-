

object Assignment03_Quiz01 {
  
   def main(args:Array[String]){
    println("Is 5 prime number: " +prime(5));
     println("Is 8 prime number: "+ prime(8));
  }
  
  def GCD(a:Int,b:Int):Int=b match{
    case 0 => a
    case x if x>a => GCD(x,a)
    case _ => GCD(b,a%b)
}
  def prime(p:Int,n:Int=2):Boolean= n match {
    case x if(x==p) => true
    case x if GCD(p,x)>1 => false
    case x => prime(p,x+1)
}


}