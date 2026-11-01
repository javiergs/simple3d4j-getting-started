package com.javiergs.examples;

import com.javiergs.simple3d4j.math.Matrix4;
import com.javiergs.simple3d4j.render.Line3D;
import com.javiergs.simple3d4j.render.ScenePanel3D;
import com.javiergs.simple3d4j.render.Wireframe3D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Combines three translated wireframe cubes into one scene.
 *
 * @author Javier Gonzalez-Sanchez
 * @version 0.1.0 (2026-10-31)
 */
public final class MultipleObjectsExample {

    public static void main(String[] args) {
        List<Line3D> lines = new ArrayList<>();
        for (int index = -1; index <= 1; index++) {
            Wireframe3D cube = Wireframe3D.cube(0.8);
            Matrix4 translation = Matrix4.translation(index * 1.4, 0, 0);
            lines.addAll(cube.transformed(translation).lines());
        }

        Wireframe3D scene = new Wireframe3D(lines);
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple3D4J - Multiple Objects");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new ScenePanel3D(scene));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
