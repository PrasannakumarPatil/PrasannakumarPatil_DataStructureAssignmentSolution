package com.gl.question1.service;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Assemble {

    List<Integer> floorOut = new LinkedList<>();

    int presentFloor;
    List<Integer> floorsOnSpecificDay;

    public void GetFloorValues(int numberOfFloors){
        Scanner sc = new Scanner( System.in );
        int floorSize;
        for(int i = 0; i < numberOfFloors; i++){
            System.out.println("enter the floor size given on day : "+(i+1));
            floorSize = sc.nextInt();
            floorOut.add( i, floorSize );
        }

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();
        PutFloors(floorOut);
    }

    public void PutFloors(List<Integer> floorSz) {


        List<Integer> remainingFloors = new ArrayList<>();
        int maxFloorNum = floorSz.size();
        presentFloor = maxFloorNum;


        for (int i = 0; i < maxFloorNum; i++) {

            floorsOnSpecificDay = new ArrayList<>();

            int size = floorSz.get(i);
            //check if size is same as present floor
            if (size == presentFloor) {
                floorsOnSpecificDay.add(size);
                presentFloor--;
                RestOfTheFloors(remainingFloors , presentFloor);
            }
            //check if size is less than present floor , if true add in remainingfloors

            if (size < presentFloor) {
                remainingFloors.add(size);
            }



            //if no floors assembled printing empty line
            System.out.println();
            System.out.println("Day: " + (i + 1));
            for (int j : floorsOnSpecificDay) {
                System.out.print(j + " ");
            }
        }
    }

    public void RestOfTheFloors(List<Integer> remainingFloors, int currentFloor) {
        for (int i : remainingFloors) {
            if (i == currentFloor) {
                floorsOnSpecificDay.add( i );
                presentFloor = currentFloor - 1;
                RestOfTheFloors( remainingFloors, presentFloor );
            }
        }
    }
}