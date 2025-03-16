class Shop{
    public String givingPen(int cost)
    {
        if(cost >=10){
            return "Take the pen";
        }
        else{
            return "Don't take the pen";
        }
    }
}



public class Method {
    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println(shop.givingPen(10));
    }
}
