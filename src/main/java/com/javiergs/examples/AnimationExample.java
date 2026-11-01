package com.javiergs.examples;

import com.javiergs.simple3d4j.math.Matrix4;
import com.javiergs.simple3d4j.math.Vector3;
import com.javiergs.simple3d4j.render.ScenePanel3D;
import com.javiergs.simple3d4j.render.Wireframe3D;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 * Rotates a wireframe cube using a Swing timer and a rotation matrix.
 *
 * @author Javier Gonzalez-Sanchez
 * @version 0.1.0 (2026-10-31)
 */
public final class AnimationExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Wireframe3D cube = Wireframe3D.cube(2);
            ScenePanel3D panel = new ScenePanel3D(cube);

            JFrame frame = new JFrame("Simple3D4J - Animation");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            // Swing timers run on the event-dispatch thread.
            final double[] angle = {0};
            new Timer(33, event -> {
                angle[0] += 0.025;
                Matrix4 rotation = Matrix4.rotation(new Vector3(0, 1, 0), angle[0]);
                panel.setWireframe(cube.transformed(rotation));
            }).start();
        });
    }
}
