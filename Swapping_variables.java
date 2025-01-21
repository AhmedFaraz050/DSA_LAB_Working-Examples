public class Swapping_variables {
    int a;
    int b;
    
    Swapping_variables(int a,int b) {
        this.a=a;
        this.b=b;
    }
    
    void swap() {
        a= a+b;
        b = a-b;
        a = a-b;
    }
    public static void main(String[] args) {
        Swapping_variables obj=new Swapping_variables(3,4);
        System.out.println("\t----BEFORE SWAPPING----");
        System.out.println("1st variable:"+obj.a);
        System.out.println("1st variable:"+obj.b);
        obj.swap();
        System.out.println("\t----AFTER SWAPPING----");
        System.out.println("1st variable:"+obj.a);
        System.out.println("1st variable:"+obj.b);
        
    }
}