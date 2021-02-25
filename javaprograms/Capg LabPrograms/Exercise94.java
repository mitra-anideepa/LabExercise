class Exercise94{

  void modifyArray(int[] array){

   int[] temp = new int[5];  

   int j = 0;  
   int n = 5;
       
    for (int i=0; i<n-1; i++){  
            
      if (array[i] != array[i+1]){  
                
         temp[j++] = array[i];  
         
        }  
      
     }
  
     temp[j++] = array[n-1];     
        
      for (int i=0; i<j; i++){  
            
        array[i] = temp[i];  
       
      }  

     int temp1;

     for (int i = 0; i < j; i++)   
     {  
        for (int k = i + 1; k < j; k++)   
          {  
             if (array[i] < array[k])   
             {  
                temp1 = array[i];  
                array[i] = array[k];  
                array[k] = temp1;  
              }  
          }  
     }
   
     System.out.println("The new array is:");
   
     for(int i=0;i<j;i++){
    
      System.out.print(array[i]+" ");
 
    }

  }
  public static void main(String[] args){
 
  int[] a = new int[5];
 
  a[0]=2;
  a[1]=4;
  a[2]=4;
  a[3]=6;
  a[4]=5;
 
  Exercise94 ex = new Exercise94();
  
  ex.modifyArray(a);

 }

}
 
  
  