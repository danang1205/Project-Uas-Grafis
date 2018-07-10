package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;



/**
 * UasGrafis_sepeda.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class UasGrafis_sepeda implements GLEventListener {

    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new UasGrafis_sepeda());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }
    private float view_rotx = 20.0f;
    private float view_roty = 30.0f;
    private int oldMouseX;
    private int oldMouseY;
    private Objek Objek;

    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));

        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { // avoid a divide by zero error!
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
       GL gl = drawable.getGL();
            GLU glu = new GLU();
            Objek = new Objek();
            // Clear the drawing area
            gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
            // Reset the current matrix to the "identity"
            //roda belakang
            gl.glLoadIdentity();
            gl.glTranslatef(-2.0f, -2.0f, -10.0f);
            gl.glRotatef(0.0f, 90.0f, 0.0f, 0.0f);
            gl.glRotatef(0.0f, 90.0f, 0.0f, 0.0f);
            gl.glColor3f(0f, 0f, 0f);
            gl.glPushMatrix();
            Objek.roda(gl);
            gl.glPopMatrix();
            //roda depan
            gl.glLoadIdentity();
            gl.glTranslatef(3.0f, -2.0f, -10.0f);
            gl.glRotatef(0.0f, 90.0f, 0.0f, 0.0f);
            gl.glRotatef(0.0f, 90.0f, 0.0f, 0.0f);
            gl.glColor3f(0f, 0f, 0f);
            gl.glPushMatrix();
            Objek.roda(gl);
            gl.glPopMatrix();
            //rangka depan 
            gl.glLoadIdentity();
            gl.glTranslatef(3.0f, 1.0f, -10.0f);
            gl.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
            gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
            gl.glColor3f(1f, 1f, 0f);
            gl.glPushMatrix();
            Objek.rangkadepan(gl);
            gl.glPopMatrix();
            //stang 
//            gl.glLoadIdentity();
//            gl.glTranslatef(3.0f, 1.0f, -10.0f);
//            gl.glRotatef(180f,1.0f, 0.0f, 0.0f);
//            gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
//            gl.glColor3f(1f, 0f, 0f);
//            gl.glPushMatrix();
//            Objek.rangka(gl);
//            gl.glPopMatrix();
            //stang 1
            gl.glLoadIdentity();
            gl.glTranslatef(3.5f, 1.0f, -11.0f);
            gl.glRotatef(190.0f,1.0f, 0.0f, 0.0f);
            gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
            gl.glColor3f(1f, 0f, 0f);
            gl.glPushMatrix();
            Objek.stang(gl);
            gl.glPopMatrix();
            //rangka belakang 
            gl.glLoadIdentity();
            gl.glTranslatef(-2.0f, 0.1f, -10.0f);
            gl.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
            gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
            gl.glColor3f(1f, 1f, 0f);
            gl.glPushMatrix();
            Objek.rangkabelakang(gl);
            gl.glPopMatrix();
            //rangka tengah
            gl.glLoadIdentity();
            gl.glTranslatef(-2.0f, 1.0f, -10.0f);
            gl.glRotatef(0.0f, 1.0f, 90.0f, 0.0f);
            //gl.glRotatef(0.0f, 90.0f, 0.0f, 0.0f);
            gl.glColor3f(0f, 0f, 0f);
            gl.glPushMatrix();
            Objek.rangkatengah(gl);
            gl.glPopMatrix();

    gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

