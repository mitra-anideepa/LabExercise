class Exercise8 {

 


  
 
boolean checkNumber(int n) {

 

     
  
  boolean result = false;

   

  if(n>0)
    {
        while(n%2 == 0)
        {
            n/=2;
        }
        
       if(n == 1)
        {
            result=true;
        }
   }

    if(n == 0 || n != 1)
    {
        result = false;
    }

 return result;  

 

   

}

 

 


   

public static void main(String[] args) {

 


       

 Exercise8  ex8 = new Exercise8 ();

 

       

 boolean result = ex8.checkNumber(8);

 


       
 
 if(result==true) {

 

             

  System.out.println("Number is a power of 2");

 

       

}

 

       

 else {

 

         

  System.out.println("Number is not a power of 2");
       

}





}

 




}