class Sum{

int sum=0;

int calculateSum(int n){

 for(int i=1;i<=n;i++){

 if((i%3==0) || (i%5==0)){

  sum=sum+i;

}

}

return (sum);

}

}

class Exercise5{

public static void main(String[] args){

  Sum obj = new Sum();

 

  

  int s = obj.calculateSum(30);

 

 
  
  System.out.println("Sum: "+s);

 


 

 }

 



}
