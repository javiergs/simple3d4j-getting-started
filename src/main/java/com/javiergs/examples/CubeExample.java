package com.javiergs.examples;

import com.javiergs.simple3d4j.math.Matrix4;
import com.javiergs.simple3d4j.render.Wireframe3D;

/**
 * Creates a wireframe cube and translates it along the X axis.
 *
 * @author Javier Gonzalez-Sanchez
 * @version 0.1.0 (2026-10-31)
 */
public final class CubeExample {

    public static void main(String[] args) {
        Wireframe3D cube = Wireframe3D.cube(2);
        Matrix4 translation = Matrix4.translation(2, 0, 0);
        Wireframe3D moved = cube.transformed(translation);

        System.out.println("Cube edges: " + cube.lines().size());
        System.out.println("Moved first point: " + moved.lines().get(0).start());
    }
}
