

object Assignment03_Quiz03 {
  
  def main(args:Array[String]){
    var n:Int=10;
    print("addition of numbers from 1 to "+ n+ ": " +addition(n));
  }
  def addition(n:Int):Int={
     if (n != 0)
            return n + addition(n - 1);
     else
            return n;
    }
}

