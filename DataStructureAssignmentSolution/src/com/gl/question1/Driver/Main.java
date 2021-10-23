package com.gl.question1.Driver;

import java.util.*;
import com.gl.question1.service.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        Assemble floorSystem = new Assemble();

        System.out.println("enter the total no of floors in the building");
        int numberFloor;
        numberFloor=sc.nextInt();
        floorSystem.GetFloorValues( numberFloor);

    }
}