

object Assignment03_Quiz04 {
  
  def main(args:Array[String]){
 
   println(isEven(4));
   println(isEven(5));
  }
  
//   def isEvenNum(p:Int):Boolean=p match{
//    case x if(x==0) => true
//    case x if(x==1) => false
//    case x => isEvenNum(x-2)
//}
  def isEven(n:Int):Boolean= n match{
      case 0 => true
      case _ => isOdd(n-1)
}
  def isOdd(n:Int):Boolean = !(isEven(n))
  
}