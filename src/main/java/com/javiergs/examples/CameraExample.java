package com.javiergs.examples;

import com.javiergs.simple3d4j.camera.Camera3D;
import com.javiergs.simple3d4j.math.Vector3;

/**
 * Projects a point in 3D space onto an 800 by 600 pixel viewport.
 *
 * @author Javier Gonzalez-Sanchez
 * @version 0.1.0 (2026-10-31)
 */
public final class CameraExample {

    public static void main(String[] args) {
        Camera3D camera = Camera3D.defaultCamera();
        Vector3 point = new Vector3(1, 1, -5);

        camera.project(point, 800, 600)
                .ifPresentOrElse(
                        projected -> System.out.printf(
                                "Pixel: %.1f, %.1f; depth: %.1f%n",
                                projected.x(), projected.y(), projected.depth()),
                        () -> System.out.println("Point is outside the camera's near plane."));
    }
}
