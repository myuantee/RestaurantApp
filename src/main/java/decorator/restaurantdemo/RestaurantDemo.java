///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
// */
//
//package decorator.restaurantdemo;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
///**
// *
// * @author Forge-15 1650
// */
//public class RestaurantDemo{
//
////    private static int choice;
////    private static int q1,q2;
//
//    public static void main(String args[]) throws NumberFormatException, IOException {
////        do {
////            System.out.print("========= Menu ============ \n");
////            System.out.print("===== Please Select Your Main Meal ======== \n");
////            System.out.print("            1. Main Meal A with additional side dish.\n");
////            System.out.print("            2. Main Meal B.\n");
////            System.out.print("            3. Main Meal C.\n");
////            System.out.print("            4. Exit                   \n");
////            System.out.print("Enter your choice: \n");
////            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////            choice = Integer.parseInt(br.readLine());
////            switch (choice) {
////                case 1: {
////                    System.out.print("Quantity of main meal A : ");
////                    q1 = Integer.parseInt(br.readLine());
////                    System.out.print("Quantity of side dish A : ");
////                    q2 = Integer.parseInt(br.readLine());
////                    Restaurant m0 = new addsideDish((new MainMealA()));
////                    System.out.println(m0.meals(q1,q2));
////                    System.out.println("Total price: RM" + m0.prices(q1,q2));
////                }
////                break;
////
////                case 2: {
////                    System.out.print("Quantity of main meal B : ");
////                    q1 = Integer.parseInt(br.readLine());
////                    q2 = Integer.parseInt(br.readLine());
////                    MainMealB m1 = new MainMealB();
////                    System.out.println(m1.meals(q1,q2));
////                    System.out.println("Total price: RM" + m1.prices(q1,q2));
////                }
////                break;
////
////                case 3: {
////                    System.out.print("Quantity of main meal C1 : ");
////                    q1 = Integer.parseInt(br.readLine());
////                    q2 = Integer.parseInt(br.readLine());
////                    MainMealC m2 = new MainMealC();
////                    System.out.println(m2.meals(q1,q2));
////                    System.out.println("Total price: RM" + m2.prices(q1,q2));
////                }
////                break;
////                default: {
////                    System.out.println("No Other Options are available");
////                }
////                return;
////            }//end of switch  
////
////        } while (choice != 4);
//
//    }
//}
