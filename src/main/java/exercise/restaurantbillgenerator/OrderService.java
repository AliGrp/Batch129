package exercise.restaurantbillgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderService {
    Scanner inp = new Scanner(System.in);
    List<Order> orderList= new ArrayList<>();
 public void createOrder(DishService dishService){
     int dishCode;
     do {
         System.out.println("Lütfen ürün kodu giriniz:(ÇIKIŞ için 0 giriniz.) ");
         dishCode=inp.nextInt();//code ile ürünü bulmamız gerekiyor--->12
         if(dishService.findByDishCode(dishCode)!=null){
             Dish dish=dishService.findByDishCode(dishCode);
             System.out.println("Adet giriniz:");
             int number=inp.nextInt();
             //bu yemek daha önce sipariş edilmiş mi--->13
             Order order;
             if(findByOtderDish(dish)!=null){
                 order=findByOtderDish(dish);
                 order.numOfDish+=number;
                 order.setPrice();
             }else{
                 order=new Order(dish,number);//orderCode:otomatik:1000 Adana
                 order.setPrice();
                 this.orderList.add(order);
             }
         }//sipariş oluşunca altta sipariş listesini görüntüle
         this.orderList.
                 forEach(order-> System.out.printf("Sipariş kodu:%-5s  Lezzet kodu:%-4s Lezzet adı:%-15s Adet:%-2s\n",
                         order.orderCode,order.dish.getCode(),order.dish.getName(),order.numOfDish));

     }while(dishCode!=0);
 }
 private Order findByOtderDish(Dish dish){
     for (Order order:this.orderList
          ) {
         if (order.dish.equals(dish)){
             return order;
         }

     }
     return null;
 }
}
