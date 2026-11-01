package com.javiergs.examples;

/**
 * Animation learning example for Simple3D4J.
 *
 * @author Javier Gonzalez-Sanchez
 * @version 0.1.0 (2026-10-31)
 */
import com.javiergs.simple3d4j.math.*;
import com.javiergs.simple3d4j.render.*;
import javax.swing.*;
public final class AnimationExample {
 public static void main(String[] args) {
  SwingUtilities.invokeLater(() -> {
   Wireframe3D cube = Wireframe3D.cube(2);
   ScenePanel3D panel = new ScenePanel3D(cube);
   JFrame frame = new JFrame("Simple3D4J - Animation");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.add(panel); frame.pack(); frame.setLocationRelativeTo(null); frame.setVisible(true);
   final double[] angle = {0};
   new Timer(33, e -> {
    angle[0] += 0.025;
    panel.setWireframe(cube.transformed(Matrix4.rotation(new Vector3(0,1,0),angle[0])));
   }).start();
  });
 }
}
