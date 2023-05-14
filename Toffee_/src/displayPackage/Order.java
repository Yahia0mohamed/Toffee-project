package displayPackage;
import Payment.*;
import java.util.Scanner;
import java.util.HashMap;

public class Order {
    private boolean PaymentState;
    private Payment paymentType;
    private double price;
    private String address;
    private boolean delivered;
    private myCart cart;
    // private MyCart Cart;//cart order
    public boolean getP_State(){return PaymentState; }
    public Payment getP_Type(){return paymentType;}
    public String getAddress(){return address;}
    public void setAddress(String address){this.address=address;}
    public void choosePaymentMethod(){
        System.out.println("choose a payment method\n1)Cash\n2)E_wallets\n3)Loyaly Points\n4)Vouchers");
        int choice = 0;
        if(choice == 1){
            paymentType=new Cash();
        }
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(Double p){
        this.price=p;
    }
    public void calculatePrice(){
        HashMap<Item,Integer> Items=cart.getCart();
    }
    public boolean getState(){
        return delivered;
    }
    Scanner input=new Scanner(System.in);
    public void cancelOrder(){
        System.out.println("Do you want to confirm this order?\n1)Yes  2)No");
        int o = input.nextInt();
        confirmOrder(o);
    }
    public void discount(String vCode){}
    public void confirmOrder(int o){
        if(o==1){
            paymentType.startPayment();
        }
    }
}
