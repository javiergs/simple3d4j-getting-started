package com.javiergs.examples;

/**
 * MultipleObjects learning example for Simple3D4J.
 *
 * @author Javier Gonzalez-Sanchez
 * @version 0.1.0 (2026-10-31)
 */
import com.javiergs.simple3d4j.math.Matrix4;
import com.javiergs.simple3d4j.render.*;
import java.util.*;
import javax.swing.*;
public final class MultipleObjectsExample {
 public static void main(String[] args) {
  List<Line3D> lines = new ArrayList<>();
  for (int i=-1;i<=1;i++) lines.addAll(Wireframe3D.cube(0.8)
   .transformed(Matrix4.translation(i*1.4,0,0)).lines());
  SwingUtilities.invokeLater(() -> {
   JFrame frame = new JFrame("Simple3D4J - Multiple Objects");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.add(new ScenePanel3D(new Wireframe3D(lines)));
   frame.pack(); frame.setLocationRelativeTo(null); frame.setVisible(true);
  });
 }
}
