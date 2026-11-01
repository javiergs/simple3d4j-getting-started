# Getting Started with Simple3D4J

![Java 21+](https://img.shields.io/badge/Java-21%2B-blue)
![Version 0.1.0](https://img.shields.io/badge/version-0.1.0-green)
[![Java CI](https://github.com/javiergs/simple3d4j-getting-started/actions/workflows/ci.yml/badge.svg)](https://github.com/javiergs/simple3d4j-getting-started/actions/workflows/ci.yml)

**Simple3D4J** is a lightweight Java library for 3D mathematics, perspective projection, and software-based wireframe visualization using Swing and Graphics2D. This repository introduces its public API through independent, runnable examples. You do not need a robot, graphics card-specific API, or access to the library's source code.

## Requirements

- **Java 21+** and Maven 3.9+
- A graphical desktop for the Swing viewer examples (the vector, camera, and cube examples print to the console)

## Quick start

From the repository root, build the examples and run the introductory vector example:

```bash
mvn clean verify
mvn exec:java -Dexec.mainClass=com.javiergs.examples.VectorExample
```

The program prints vector addition, dot product, and cross product results. To open a 3D window, run:

```bash
mvn exec:java -Dexec.mainClass=com.javiergs.examples.InteractiveViewerExample
```

Drag the mouse to orbit and scroll to zoom. Graphical examples require a desktop session; they will not open in a headless CI environment.

For a guided progression, see the [Student Quick Start](docs/student-quick-start.md).

## Install with Maven

Simple3D4J **0.1.0** is published on [Maven Central](https://central.sonatype.com/artifact/com.javiergs/simple3d4j/0.1.0). To use the library in your own Maven project, add:

```xml
<dependency>
    <groupId>com.javiergs</groupId>
    <artifactId>simple3d4j</artifactId>
    <version>0.1.0</version>
</dependency>
```

This repository already includes the dependency. Maven downloads the published library automatically; you do not need to build its implementation.

## Examples

1. **VectorExample** — addition, dot product, and cross product.
2. **CameraExample** — project a 3D point to screen coordinates.
3. **CubeExample** — construct and transform wireframe geometry.
4. **CoordinateSystemExample** — draw the three coordinate axes.
5. **MultipleObjectsExample** — position several cubes in one scene.
6. **InteractiveViewerExample** — inspect a cube with orbit and zoom controls.
7. **AnimationExample** — rotate a cube with a Swing timer.

See [Runnable Examples](docs/examples.md) for the command, expected result, and concept behind each example.

## API documentation

The examples use `Vector3`, `Matrix4`, `Camera3D`, `Wireframe3D`, and `ScenePanel3D` from the published Simple3D4J library. Consult the [published artifact](https://central.sonatype.com/artifact/com.javiergs/simple3d4j/0.1.0) for version and dependency information. A browsable JavaDoc link will be added when it is publicly hosted.

## Troubleshooting

- **Wrong Java version:** Run `mvn -version` and confirm Maven uses Java 21 or later.
- **Dependency cannot be resolved:** Confirm Maven can reach Maven Central and that your project specifies `com.javiergs:simple3d4j:0.1.0`.
- **No graphical window:** Run Swing examples on a machine with a desktop session; console examples also work without one.
- **Window is empty or the object is difficult to see:** Try dragging to orbit or scrolling to zoom; camera orientation and clipping affect what is visible.

## License

The examples and documentation in this repository are licensed under **MIT**. See [LICENSE](LICENSE). The separately distributed library may have different licensing terms.
