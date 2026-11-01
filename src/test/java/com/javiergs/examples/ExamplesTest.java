package com.javiergs.examples;
import com.javiergs.simple3d4j.camera.Camera3D;
import com.javiergs.simple3d4j.math.*;
import com.javiergs.simple3d4j.render.Wireframe3D;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/** Verifies examples against the published library.
 * @author Javier Gonzalez-Sanchez
 * @version 0.1.0 (2026-10-31)
 */
class ExamplesTest {
 @Test void vectors() { assertEquals(new Vector3(5,2,2),new Vector3(1,2,3).add(new Vector3(4,0,-1))); }
 @Test void camera() { assertTrue(Camera3D.defaultCamera().project(new Vector3(0,0,-5),800,600).isPresent()); }
 @Test void cube() { assertEquals(12,Wireframe3D.cube(2).transformed(Matrix4.identity()).lines().size()); }
}
