package com.javiergs.examples;

/**
 * Camera learning example for Simple3D4J.
 *
 * @author Javier Gonzalez-Sanchez
 * @version 0.1.0 (2026-10-31)
 */
import com.javiergs.simple3d4j.camera.Camera3D;
import com.javiergs.simple3d4j.math.Vector3;
public final class CameraExample {
 public static void main(String[] args) {
  Camera3D.defaultCamera().project(new Vector3(1,1,-5),800,600)
   .ifPresent(p -> System.out.printf("Pixel: %.1f, %.1f; depth: %.1f%n",p.x(),p.y(),p.depth()));
 }
}
