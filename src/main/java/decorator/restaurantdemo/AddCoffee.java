/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator.restaurantdemo;

/**
 *
 * @author Forge-15 1650
 */
public class AddCoffee extends RestaurantDecorator {

    public AddCoffee (Restaurant newSet) {
        super(newSet);
    }

    @Override
    public String meals(int q1, int sd1, int sd2, int sd3 , int b1, int b2) {
        String desc = super.meals(q1,sd1,sd2,sd3,b1,b2) + "\nwith " + b2 + " Coffee"; 
                                                    
        return desc;
    }

    @Override
    public double prices(int q1, int sd1, int sd2, int sd3 , int b1, int b2) {
        return super.prices(q1,sd1,sd2,sd3,b1,b2) + b2*2.00;
    }
}

