class Exercise7 {

 


  
 
boolean checkNumber(int n) {

 

     
  
  boolean result = false;

   
  
  int r;
  int d;
  int temp=n;

  if(n>0) {

 

       
  r=n%10;

  n=n/10;

  d=n%10;

  if(r>=d){

    result = true;

 

    
  
  }
  else {
  
    result= false;
  
  }

 }

 

    

 return result;  

 

   

}

 

 


   

public static void main(String[] args) {

 


       

 Exercise7  ex7 = new Exercise7 ();

 

       

 boolean result = ex7.checkNumber(123446);

 


       
 
 if(result==true) {

 

             

  System.out.println("No is in increasing order");

 

       

}

 

       

 else {

 

         

  System.out.println("No is not in increasing order");
       

}





}

 




}