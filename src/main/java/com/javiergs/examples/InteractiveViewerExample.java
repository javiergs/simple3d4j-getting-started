package com.javiergs.examples;

/**
 * InteractiveViewer learning example for Simple3D4J.
 *
 * @author Javier Gonzalez-Sanchez
 * @version 0.1.0 (2026-10-31)
 */
import com.javiergs.simple3d4j.render.*;
import javax.swing.*;
public final class InteractiveViewerExample {
 public static void main(String[] args) {
  SwingUtilities.invokeLater(() -> {
   JFrame frame = new JFrame("Simple3D4J - Cube");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.add(new ScenePanel3D(Wireframe3D.cube(2)));
   frame.pack(); frame.setLocationRelativeTo(null); frame.setVisible(true);
  });
 }
}
