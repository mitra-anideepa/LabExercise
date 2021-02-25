class Tax
{
 
public static void main(String[] args){

char ch='g';
int income=500000;
double tax=0.0;

switch(ch){

case 'g': if(income<=180000){
             tax=0;
             }
             else if(income<=500000){
             tax=0.1*income;
             }
             else if(income<=800000){
             tax=0.2*income;
             }
             else{
             tax=0.3*income;
             }
             break;
case 'w': if(income<=190000){
             tax=0;
             }
             else if(income<=500000){
             tax=0.1*income;
             }
             else if(income<=800000){
             tax=0.2*income;
             }
             else{
             tax=0.3*income;
             }
             break;
default: System.out.println("Wrong Choice");
            break;
}

System.out.println("Tax=" +tax);

}

}