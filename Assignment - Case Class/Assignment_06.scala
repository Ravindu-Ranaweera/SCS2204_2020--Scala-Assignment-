import scala.math.pow
import scala.math.sqrt

object Assignment_06 extends App{
     
    val p1 = Point(4,3)
    val p2 = Point(5,7)
    print("My points =>\t ");
    print("P1 =" + p1 ) 
    println(",P2 =" + p2)
    
    val p3 = p1.add(p2)
    println("Sum of p1 and p2 is " + p3)
    
    p2.move(2, -2)
    println("P2 point move by (2,-2) = " + p2)
    
    println("Distance between P1 and P2 = " + p1.distance(p2))
       
    p2.invert
    println("Invert of P2 = " + p2);
    
}

case class Point(var x:Int,var y:Int) {

   //Question 1
  def add(p:Point):Point = Point(this.x+p.x , this.y+p.y);

    //Question 2
  def move(dx:Int, dy:Int): Unit = {this.x +=dx; this.y +=dy;}

   //Question 3
  def distance(p:Point):Double = sqrt(pow((this.x - p.x),2)+pow((this.y - p.y),2));

    //Question 4
  def invert:Unit = {this.x +=this.y; this.y = this.x - this.y; this.x -=this.y}
  
}


