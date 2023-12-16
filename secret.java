import java.util.Scanner;
 public class secret{
 public static void main(String[] arg){
Scanner s=new Scanner(System.in);
int b=10;
System.out.println("Vvedite chislo:");
int a=s.nextInt();

int x=a-b;

if (x>30){
  System.out.println("Xolodno");
}
else if (x==0){
System.out.println("Uqadano");
}
else if (x<30){
  System.out.println("Teplee");
}
}

}



