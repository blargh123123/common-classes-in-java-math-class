package com.theironyard;

/**
 * For this exercise you will create a class named Volume that contains methods
 * to calculate the volume of 3D shapes. Start by following the instructions in
 * the Volume class.
 *
 * In this Main class write a main method that invokes each of Volume class'
 * methods.
 */
public class Main {

    // todo: create a main() method that invokes each of the methods in the Volume class
    public static void main(String[] args) {

        System.out.println(Volume.cone(5.2, 8.9));

        System.out.println(Volume.cube(5.2));

        System.out.println(Volume.sphere(7.5));
    }

}
