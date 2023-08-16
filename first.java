import java.util.Scanner;
public class first{
    public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    for(int i=1,k=1;k<=n;i++){
        int h=3*i+2;
        if(h%4==0){
            continue;
            }else{
                k++;
            System.out.print(h+" ");
           
        }
    }  
      
  
    
    }
}