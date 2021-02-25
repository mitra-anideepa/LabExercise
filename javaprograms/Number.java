class Number{

public static void main(String[] args){

int n=101;
int flag=0;
int n1=n;
int r;
int d;
int sum=0;

int temp=n;    
while(n1>0){    
   r=n1%10; 
   sum=(sum*10)+r;    
   n1=n1/10;    
}    
 
if(temp==sum) {   
   System.out.println("palindrome number ");
}    
else{    
   System.out.println("not palindrome"); 
}

for(int i=2;i<=(101/2);i++)
{
  if(n%2==0)
  {
    flag=1;
  }
 else{
   flag=0;
 }
}

if(flag==0)
{
  System.out.println(n+"p");
}
else
{
  System.out.println("This is not a prime number");
 }

}

} 
