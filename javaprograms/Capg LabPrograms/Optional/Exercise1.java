class Exercise1{

void Cubes(int n1){

  int r;
  int sum=0;
 
  while(n1>0){
   
   r=n1%10;
   sum=sum+(r*r*r);
   n1=n1/10;

 }

 System.out.println("The sum:" +sum);

}

public static void main(String[] args){

 int n=563;

 Exercise1 ex=new Exercise1();

 ex.Cubes(n);
}

}
 