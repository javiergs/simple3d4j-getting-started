package com.javiergs.examples;

import com.javiergs.simple3d4j.math.Vector3;
import com.javiergs.simple3d4j.render.Line3D;
import com.javiergs.simple3d4j.render.ScenePanel3D;
import com.javiergs.simple3d4j.render.Wireframe3D;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Displays line segments along the positive X, Y, and Z axes.
 *
 * @author Javier Gonzalez-Sanchez
 * @version 0.1.0 (2026-10-31)
 */
public final class CoordinateSystemExample {

    public static void main(String[] args) {
        Vector3 origin = new Vector3(0, 0, 0);
        Wireframe3D axes = new Wireframe3D(List.of(
                new Line3D(origin, new Vector3(2, 0, 0)),
                new Line3D(origin, new Vector3(0, 2, 0)),
                new Line3D(origin, new Vector3(0, 0, 2))));

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple3D4J - Axes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new ScenePanel3D(axes));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
