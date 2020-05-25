

object Assignment03_Quiz05 {
  
  def main(args:Array[String]){
    var n:Int=10;
   print("Addition of all even numbers less than "+ n +" : "+additionEvenNum(n));
   
  }
    def isEven(p:Int):Boolean=p match{
    case x if(x==0) => true
    case x if(x==1) => false
    case x => isEven(x-2)
}
  def additionEvenNum(n:Int):Int={
    if (n !=0 )
      if(isEven(n)==true)
          return n + additionEvenNum(n - 1);
      else
          additionEvenNum(n - 1);
     else
            return n;
    
  }
  
}