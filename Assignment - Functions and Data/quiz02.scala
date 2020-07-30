

object quiz02 {
  
class rationalNumber(n: Int, d: Int)
{
    require(d>0, "d(Denominator) should be positive!")
    val numer: Int = n/gcd(n,d)
    val denom: Int = d/gcd(n,d)
    def this(n: Int) = this(n,1)
    private def gcd(x: Int, y: Int): Int = if(y==0) x else if(x<0) gcd(y,(-x)%y) else gcd(y,x%y)
    override def toString: String = this.numer + "/" + this.denom
    def neg = new rationalNumber(-this.numer,this.denom)
    def add(r: rationalNumber) = new rationalNumber(this.numer*r.denom+r.numer*this.denom,this.denom*r.denom)
    def sub(r: rationalNumber): rationalNumber = this.add(r.neg)
}
  def main(args:Array[String])
{
  val x = new rationalNumber(3,4)
  val y = new rationalNumber(5,8)
  val z = new rationalNumber(2,7)
  println("X-Y-Z =" + x.toString + " - " + y.toString + " - " + z.toString + " = " + x.sub(y).sub(z).toString);
  println()
}

}