class Difference{

int diff=0;

int sofsquares(int n1){

int s=0;

for(int i=1;i<=n1;i++){

 s+=i*i;

}

return(s);

}

int sofsum(int n2){

int s=0;

for(int i=1;i<=n2;i++){

 s+=i;

}

int s1=s*s;
return(s1);

}

int calculateDifference(int n){

  int no=sofsquares(n);
  int no1= sofsum(n);
  diff=no-no1;

 return (diff);

}

}

class Exercise6{

public static void main(String[] args){

  Difference obj = new Difference();

 

  

  int d = obj.calculateDifference(10);

 

 
  
  System.out.println("Difference: "+d);

 


 

 }

 



}
