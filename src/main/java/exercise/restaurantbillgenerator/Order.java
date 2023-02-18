package exercise.restaurantbillgenerator;

public class Order {
    public static int count=999;
    public int orderCode;
    public int numOfDish;
    public double orderPrice;
    public Dish dish;//Dish data type'nda aliyoruz cunku butun zellilari almak icin

    public Order(int numOfDish, Dish dish) {
        count++;
        this.orderCode=count;
        this.numOfDish = numOfDish;
        this.dish = dish;
    }

    public Order(Dish dish, int number) {
    }

    public void setPrice(){
        this.orderPrice=this.dish.getPrice()*this.numOfDish;
    }
}
