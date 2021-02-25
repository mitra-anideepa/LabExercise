class Retail{

public static void main(String[] args){

char code='A';
int quantity=15;
double retail=0.0;
double price=0.0;

switch(code){
 
case 'A': retail=22.5;
              break;
case 'B': retail=44.98;
              break;
case 'C': retail=9.98;
              break;
}

price=quantity*retail;
System.out.println("Total Price=" +price);
}

}
 
