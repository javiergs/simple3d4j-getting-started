# Simple3D4J — Getting Started

[![Java 21](https://img.shields.io/badge/Java-21-blue)](https://openjdk.org/projects/jdk/21/)
[![Maven Central](https://img.shields.io/maven-central/v/com.javiergs/simple3d4j.svg?label=Maven%20Central)](https://central.sonatype.com/artifact/com.javiergs/simple3d4j)
[![Java CI](https://github.com/javiergs/simple3d4j-getting-started/actions/workflows/ci.yml/badge.svg)](https://github.com/javiergs/simple3d4j-getting-started/actions/workflows/ci.yml)

Learn 3D vectors, camera projection, and interactive wireframe rendering in **Java 21** using the published [Simple3D4J 0.1.0](https://central.sonatype.com/artifact/com.javiergs/simple3d4j/0.1.0) library.

This public repository contains independent examples, **not the library implementation**. No robot, native graphics engine, or credentials are required. Swing examples require a graphical desktop.

## Requirements

Java 21 and Maven 3.9 or newer.

## Learning path

1. **VectorExample** — vector addition, dot products, and cross products.
2. **CameraExample** — perspective projection into pixel coordinates.
3. **CubeExample** — cube geometry and matrix transformations.
4. **InteractiveViewerExample** — orbit and zoom with the mouse.
5. **CoordinateSystemExample** — display X, Y, and Z axes.
6. **MultipleObjectsExample** — combine transformed wireframes.
7. **AnimationExample** — rotate a cube using a Swing timer.

## Run an example

```bash
mvn clean verify
mvn exec:java -Dexec.mainClass=com.javiergs.examples.VectorExample
```

Replace `VectorExample` with any class above. The last four examples open Swing windows; drag to orbit and scroll to zoom.

## Maven dependency

```xml
<dependency>
    <groupId>com.javiergs</groupId>
    <artifactId>simple3d4j</artifactId>
    <version>0.1.0</version>
</dependency>
```

## Key concepts

`Vector3` models positions and directions. `Matrix4` transforms points. `Camera3D` projects points onto the screen. `Wireframe3D` contains line segments, while `ScenePanel3D` displays them interactively.

Licensed under Apache 2.0. See [LICENSE](LICENSE).
