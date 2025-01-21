import java.util.Scanner;

public class Checking_Numbers {
     int num1;
     int num2;
     int num3;
     
     Checking_Numbers(int num1,int num2,int num3) {
         this.num1=num1;
         this.num2=num2;
         this.num3=num3;
     }
     
     
    
    
       void CheckNumbers() {
        if(num1<num2 && num2<num3) {
            System.out.println("Increasing");
        }
        else if(num1>num2 && num2>num3) {
            System.out.println("Decreasing");
        }
        else {
             System.out.println("Neither increasing nor decreasing order");
        }
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number 1:");
        int num1 = sc.nextInt();
        
         System.out.println("Enter Number 1:");
        int num2 = sc.nextInt();
        
         System.out.println("Enter Number 1:");
        int num3 = sc.nextInt();
        
        sc.close();
        
        Checking_Numbers obj = new Checking_Numbers(num1,num2,num3);
        obj.CheckNumbers();
        
           
    }
}