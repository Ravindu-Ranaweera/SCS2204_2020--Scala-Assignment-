

object Quiz_02 {
  def main(args:Array[String]){
    var radius:Double =5.0;
    var result:Double=getVolume(radius);
    println("volume of a sphere with radius 5 : "+result);
  }
  
  def getVolume(r:Double):Double={
    var volume:Double=4/3.0 * Math.PI* Math.pow(r, 3);
    return volume;
  }
}