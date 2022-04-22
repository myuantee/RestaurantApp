/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator.restaurantdemo;

/**
 *
 * @author Forge-15 1650
 */
public abstract class RestaurantDecorator implements Restaurant {

    private Restaurant newRestaurant;

    public RestaurantDecorator(Restaurant newRestaurant) {
        this.newRestaurant = newRestaurant;
    }

    @Override
    public String meals(int q1, int sd1,int sd2,int sd3,int b1,int b2) {
        return newRestaurant.meals(q1,sd1,sd2,sd3,b1,b2);
    }

    @Override
    public double prices(int q1, int sd1,int sd2,int sd3,int b1,int b2) {
        return newRestaurant.prices(q1,sd1,sd2,sd3,b1,b2);
    }
}
