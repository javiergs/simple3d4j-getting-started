package com.javiergs.examples;

/**
 * Vector learning example for Simple3D4J.
 *
 * @author Javier Gonzalez-Sanchez
 * @version 0.1.0 (2026-10-31)
 */
import com.javiergs.simple3d4j.math.Vector3;
public final class VectorExample {
 public static void main(String[] args) {
  Vector3 a = new Vector3(1,2,3), b = new Vector3(4,0,-1);
  System.out.println("sum = "+a.add(b));
  System.out.println("dot = "+a.dot(b));
  System.out.println("cross = "+a.cross(b));
 }
}
