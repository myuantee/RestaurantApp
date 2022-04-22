/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator.restaurantdemo;

/**
 *
 * @author Forge-15 1650
 */
public class MainMealC implements Restaurant {

    public String meals(int q1, int sd1,int sd2,int sd3,int b1,int b2) {
        String description = q1 + " main meal C";
        return description;
    }

    public double prices(int q1, int sd1,int sd2,int sd3,int b1,int b2) {
        double price = q1* 28.00;
        return price;
    }
}
