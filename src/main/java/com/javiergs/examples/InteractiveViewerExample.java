package com.javiergs.examples;

import com.javiergs.simple3d4j.render.ScenePanel3D;
import com.javiergs.simple3d4j.render.Wireframe3D;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Opens an interactive wireframe viewer with mouse orbit and zoom.
 *
 * @author Javier Gonzalez-Sanchez
 * @version 0.1.0 (2026-10-31)
 */
public final class InteractiveViewerExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Wireframe3D cube = Wireframe3D.cube(2);
            JFrame frame = new JFrame("Simple3D4J - Cube");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new ScenePanel3D(cube));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
