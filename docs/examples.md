# Runnable Examples

Each example has an independent `main` method in `src/main/java/com/javiergs/examples/`. The Maven project uses the **published** Simple3D4J 0.1.0 dependency.

First run `mvn clean verify`, then choose an example below. The final four require a graphical desktop.

## 1. VectorExample

**Concept:** Vector addition, dot product, and cross product  
**Expected behavior:** Console output with computed vector and scalar values.

```bash
mvn exec:java -Dexec.mainClass=com.javiergs.examples.VectorExample
```

[Read VectorExample.java](../src/main/java/com/javiergs/examples/VectorExample.java)

## 2. CameraExample

**Concept:** Perspective projection of a 3D point  
**Expected behavior:** Console output with pixel coordinates and depth, if the point is visible.

```bash
mvn exec:java -Dexec.mainClass=com.javiergs.examples.CameraExample
```

[Read CameraExample.java](../src/main/java/com/javiergs/examples/CameraExample.java)

## 3. CubeExample

**Concept:** Cube edges and translation using a matrix  
**Expected behavior:** Console output with edge count and translated point.

```bash
mvn exec:java -Dexec.mainClass=com.javiergs.examples.CubeExample
```

[Read CubeExample.java](../src/main/java/com/javiergs/examples/CubeExample.java)

## 4. CoordinateSystemExample

**Concept:** Three-dimensional X, Y, and Z axes  
**Expected behavior:** A Swing window displaying line segments for the coordinate axes.

```bash
mvn exec:java -Dexec.mainClass=com.javiergs.examples.CoordinateSystemExample
```

[Read CoordinateSystemExample.java](../src/main/java/com/javiergs/examples/CoordinateSystemExample.java)

## 5. MultipleObjectsExample

**Concept:** Wireframe composition and translation  
**Expected behavior:** A Swing window displaying three translated cubes.

```bash
mvn exec:java -Dexec.mainClass=com.javiergs.examples.MultipleObjectsExample
```

[Read MultipleObjectsExample.java](../src/main/java/com/javiergs/examples/MultipleObjectsExample.java)

## 6. InteractiveViewerExample

**Concept:** Orbit and zoom in a wireframe viewer  
**Expected behavior:** A Swing window containing a cube; drag to orbit and scroll to zoom.

```bash
mvn exec:java -Dexec.mainClass=com.javiergs.examples.InteractiveViewerExample
```

[Read InteractiveViewerExample.java](../src/main/java/com/javiergs/examples/InteractiveViewerExample.java)

## 7. AnimationExample

**Concept:** Rotation matrices and timer-driven updates  
**Expected behavior:** A Swing window with a rotating cube.

```bash
mvn exec:java -Dexec.mainClass=com.javiergs.examples.AnimationExample
```

[Read AnimationExample.java](../src/main/java/com/javiergs/examples/AnimationExample.java)

## Suggested learning sequence

Start with vectors, then projection and transformations. Move to coordinate axes and multiple objects before trying camera interaction and animation. For a step-by-step walkthrough, see [Student Quick Start](student-quick-start.md).

## Notes

Swing windows require a desktop environment; a passing Maven test build does not verify that a window can open. All examples use the published dependency and do not require access to the underlying library source.
