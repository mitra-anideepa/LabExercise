class Box{
 
double width;

double height;

double depth;

void setDimensions(double width, double height, double depth){

 this.width = width;
 this.height = height;
 this.depth = depth;

}
 
double volume() {
 
 double v = width*height*depth;
 return v;

 }

}

class BoxDemo{

public static void main(String[] args){

  Box obj = new Box();

 

  

  obj.setDimensions(10,20,10);

 

 

  double vol = obj.volume();

 


  
  System.out.println("Volume: "+vol);

 


 
 }

 



}
