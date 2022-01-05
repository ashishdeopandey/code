import java.util.Scanner; 
class larg3{
    public static void main(String[] args) {
        int a, b, c, larg;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the first no");  
        a = sc.nextInt();  
        System.out.println("Enter the second no");  
        b = sc.nextInt();  
        System.out.println("Enter the third no");  
        c = sc.nextInt();  
        if(a>=b && a>=c)  {
        System.out.println("The largest Number is " + a);    
        }
        else if (b>=a && b>=c)  
        System.out.println("The largest Number is " + b);    
        else  
         {
        System.out.println("The largest Number is " + c);
         }
    }
}
