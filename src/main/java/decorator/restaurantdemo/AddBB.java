/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator.restaurantdemo;

/**
 *
 * @author Forge-15 1650
 */
public class AddBB extends RestaurantDecorator {

    public AddBB(Restaurant newRestaurant) {
        super(newRestaurant);
    }

    @Override
    public String meals(int q1, int sd1, int sd2, int sd3 , int b1, int b2) {
        String desc = super.meals(q1,sd1,sd2,sd3,b1,b2) + "\nwith " + sd3 + " Baked beans"; 
                                                    
        return desc;
    }

    @Override
    public double prices(int q1, int sd1, int sd2, int sd3 , int b1, int b2) {
        return super.prices(q1,sd1,sd2,sd3,b1,b2) + sd3*7.00;
    }
}
//test push