class Exercise3{

public static void main(String[] args){

 int n=20;
 int flag;

 System.out.println("The prime numbers are:");

 for(int i=0;i<n;i++){
 
     if (i == 1 || i == 0)
                 continue;
 
      flag = 1;
 
     for (int j = 2; j <= i / 2; ++j) {
        if (i % j == 0) {
              flag = 0;
              break;
         }
     }
 
     if (flag == 1)
        System.out.println(i);

}

}

}
 
