

object quiz01 {
  
  class rationalNumber(n:Int,d:Int)
{
	  require(d>0,"d(Denominator) must be greater than zero");
    def numer=n/gcd(n,d);
    def denom=d/gcd(n,d);
    def this(n:Int)=this(n,1);
    private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
    def neg=new rationalNumber(-this.numer,  this.denom);
    override def toString = numer + "/" + denom;
}

  def main(args:Array[String])
	{

		val x =new rationalNumber(5,8);
		println("Number   : "+x);
		println("Negetion : "+x.neg);  
	}

}


