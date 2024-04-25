import java.util.*;
public class Input {

    public static void main(String[] args) {
        int k=0;
        Bankdetails a[]=new Bankdetails[2];
        for(k=0;k<2;k++){
            a[k]=new Bankdetails();
            a[k].details();
        }
        for(k=0;k<2;k++){
            a[k].outdetails();

        }


    }

}
class Bankdetails{
    Scanner sc=new Scanner(System.in);
    int Acc_No,Amount_withdrawan;
    String Name,City;
    void details()
    {
        System.out.println("Enter the ACCOUNT NUMBER : ");
        Acc_No=sc.nextInt();
        System.out.println("Enter the AMOUNT WITHDRAWAN : ");
        Amount_withdrawan=sc.nextInt();
        System.out.println("Enter Your Name : ");
        Name=sc.next();
        System.out.println("Enter Your City : ");
        City=sc.next();
    }

    void outdetails(){
        System.out.println(Name+" your Account number : "+Acc_No+" has withdrawan "+Amount_withdrawan+" in "+City);
    }
}
