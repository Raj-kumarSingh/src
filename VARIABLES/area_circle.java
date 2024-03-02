package VARIABLES;

import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        float r = sc.nextFloat();
        float p = 3.14f;
        float area = p*r*r;
        System.out.println(area);
    }
}
