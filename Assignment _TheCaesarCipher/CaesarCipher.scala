object CaesarCipher {
  
 def main(args:Array[String])
 {
   
     val alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
     
    //Encryption function
   
    val Encryption=(c:Char,key:Int,a:String)=>
                 a((a.indexOf(c.toUpper)+key)%a.size)
     
    //Decryption function
     
     val Decryption=(c:Char,key:Int,a:String)=>
                 a((a.indexOf(c.toUpper)-key)%a.size)
     
     
     val cipher=(algo:(Char,Int,String)=>
                Char,s:String,key:Int,a:String)=>
                s.map(algo(_,key,a))
                
                
           
                
             /*  val message="HappyBirthday";
               val key=1;*/
              
                
               val encrypted_text=cipher(Encryption,"GoodMorning",1,alphabet);
               val plain_text=cipher(Decryption,encrypted_text,1,alphabet);
               
                println("Encrypted text: "+encrypted_text)

                println("Decrypted text: "+plain_text)
 }
 
}