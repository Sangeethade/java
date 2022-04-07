import java.util.scanner;
class IfElseExample{
public void display(){

Scanner s = new Scanner(System.in);
System.out.println("Enter age");
int age = s.nextint();

if(age>=18){
System.out.println("you are eligible");
}
else{
System.out.println("you are not eligible");
}
public static void main(String[]args){
IfElseExample obj = new IfElseExample();
obj.display();
}
}