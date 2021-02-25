class Exercise93{

  void getSorted(int[] array){
   int temp;

   for (int i = 0; i < 5; i++)   
    {  
       for (int j = i + 1; j < 5; j++)   
         {  
            if (array[i] > array[j])   
             {  
                temp = array[i];  
                array[i] = array[j];  
                array[j] = temp;  
              }  
          }  
     }
   
     System.out.println("The Sorted array is:");
   
     for(int i=0;i<5;i++){
    
      System.out.print(array[i]+" ");
 
    }

  }
  public static void main(String[] args){
 
  int[] a = new int[5];
 
  a[0]=2;
  a[1]=4;
  a[2]=3;
  a[3]=6;
  a[4]=5;
 
  int[] a2 = new int[5];

  for(int i = 0, j = 4; i<5 && j>=0; i++, j--){
 
   a2[i]=a[j];
 
  }

  Exercise93 ex = new Exercise93();
  
  ex.getSorted(a2);

 }

}
 
  
  