# Student Quick Start

This guide takes you from vector mathematics to a simple interactive 3D viewer.

## 1. Check your tools

From a terminal, run:

```bash
java -version
mvn -version
```

Use Java 21 or later and Maven 3.9 or later. Maven should report the expected Java installation.

## 2. Build the examples

Clone this public repository, open a terminal in its root directory, and run:

```bash
mvn clean verify
```

This compiles the example classes and runs automated tests. It does not open a graphical window.

## 3. Start with vectors

```bash
mvn exec:java -Dexec.mainClass=com.javiergs.examples.VectorExample
```

Read the source in `src/main/java/com/javiergs/examples/VectorExample.java`. Identify the two input vectors and predict their sum, dot product, and cross product before checking the console output.

## 4. Move from 3D to screen coordinates

```bash
mvn exec:java -Dexec.mainClass=com.javiergs.examples.CameraExample
```

A perspective camera converts a visible 3D point into a screen position and depth. Change the input point and observe how the projected coordinates change. The camera may omit points behind its near plane.

## 5. Explore geometry and transformations

```bash
mvn exec:java -Dexec.mainClass=com.javiergs.examples.CubeExample
```

Inspect the number of cube edges and how translation changes a point. Then try `CoordinateSystemExample` and `MultipleObjectsExample` to see axes and multiple cubes on a Swing canvas.

## 6. Interact and animate

```bash
mvn exec:java -Dexec.mainClass=com.javiergs.examples.InteractiveViewerExample
mvn exec:java -Dexec.mainClass=com.javiergs.examples.AnimationExample
```

These examples need a graphical desktop. In the interactive viewer, drag to orbit and scroll to zoom. In the animation example, observe how repeated rotation matrices change the cube's position over time.

## 7. Try a small experiment

Change the cube size, translation distance, or rotation increment in an example. Rebuild, run it, and explain which mathematical operation produced the visible change.

For the full example list, see [Runnable Examples](examples.md).
