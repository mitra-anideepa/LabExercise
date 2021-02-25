class Exercise91{
 
 public static void main(String[] args){

  int[] a = new int[5];

  a[0] = 2;
  a[1] = 4;
  a[2] = 3;
  a[3] = 6;
  a[4] = 5;

  int temp;

  for (int i = 0; i < 5; i++)   
    {  
       for (int j = i + 1; j < 5; j++)   
         {  
            if (a[i] > a[j])   
             {  
                temp = a[i];  
                a[i] = a[j];  
                a[j] = temp;  
              }  
          }  
     }
  
  System.out.println("The second largest is:"+a[3]);

 }

}  