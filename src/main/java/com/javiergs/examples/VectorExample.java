package com.javiergs.examples;

import com.javiergs.simple3d4j.math.Vector3;

/**
 * Demonstrates addition, dot product, and cross product of two 3D vectors.
 *
 * @author Javier Gonzalez-Sanchez
 * @version 0.1.0 (2026-10-31)
 */
public final class VectorExample {

    public static void main(String[] args) {
        Vector3 first = new Vector3(1, 2, 3);
        Vector3 second = new Vector3(4, 0, -1);

        System.out.println("sum = " + first.add(second));
        System.out.println("dot = " + first.dot(second));
        System.out.println("cross = " + first.cross(second));
    }
}
