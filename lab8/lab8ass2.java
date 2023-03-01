/* A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. 
Implement it in Java to calculate the cost of plastic as per the 
dimensions given by the user where 3D inherits from 2D.
 */

import java.util.*;

class dim2 {
    double len, bred;

    double cost2d() {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the length and bredth: ");
        len = inp.nextDouble();
        bred = inp.nextDouble();

        double cost = len * bred * 40;

        return cost;
    }
}

class dim3 extends dim2 {
    Double hgt;

    double cost3d() {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the length and bredth and height: ");
        len = inp.nextDouble();
        bred = inp.nextDouble();
        hgt = inp.nextDouble();

        double cost = (2 * (len * bred) + 4 * (bred * hgt)) * 60;

        return cost;
    }
}

public class lab8ass2 {
    public static void main(String[] args) {
        dim3 obj = new dim3();
        System.out.println("The cost of the 2D sheet is: " + obj.cost2d());
        System.out.println("The cost of the 3D sheet is: " + obj.cost3d());

    }
}