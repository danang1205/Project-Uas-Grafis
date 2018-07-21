package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Objek {

    static void Bodi(GL gl) {
        float BODY_RADIUS = 0.1f;
        float BODY_LENGTH = 2f;

        float BODY_RADIUS2 = 0.08f;
        float BODY_LENGTH2 = 3f;

        float BODY_RADIUS3 = 0.08f;
        float BODY_LENGTH3 = 3.5f;

        float BODY_RADIUS4 = 0.05f;
        float BODY_LENGTH4 = 2.8f;

        float BODY_RADIUS5 = 0.05f;
        float BODY_LENGTH5 = 1.5f;

        int SLICES = 130;
        int STACKS = 130;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();

        gl.glColor3d(0.5, 0, 0);
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, 2.1, SLICES, STACKS);
        gl.glColor3d(0.5, 0, 0);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);

        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);
        gl.glTranslated(0, 3, -0.4);
        gl.glRotated(15, 1, 0, 0);
        glu.gluCylinder(q, 0.15, 0.15, 0.6, SLICES, STACKS);
        gl.glPopMatrix();

        //
        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);
        gl.glTranslated(-0.25, 0, -BODY_LENGTH);
        gl.glRotated(90, 0, 1, 0);
        glu.gluCylinder(q, 0.15, 0.15, 0.5, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslated(0, 0, 0);
        gl.glRotated(90, -1, 0, 0);
        gl.glColor3d(0.5, 0, 0);
        glu.gluCylinder(q, BODY_RADIUS2, 0.1, BODY_LENGTH2, SLICES, STACKS);
        gl.glColor3d(0.5, 0, 0);
        glu.gluDisk(q, 0.0f, BODY_RADIUS2, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, BODY_LENGTH2);
        glu.gluDisk(q, 0.0f, BODY_RADIUS2, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslated(0, 0, -BODY_LENGTH);
        gl.glRotated(90, -1, 0, 0);
        gl.glRotated(33, 1, 0, 0);
        gl.glColor3d(0.5, 0, 0);
        glu.gluCylinder(q, BODY_RADIUS3, 0.15, BODY_LENGTH3, SLICES, STACKS);
        gl.glColor3d(0.5, 0, 0);
        glu.gluDisk(q, 0.0f, BODY_RADIUS3, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, BODY_LENGTH3);
        glu.gluDisk(q, 0.0f, BODY_RADIUS3, SLICES, STACKS);
        gl.glPopMatrix();

        //belakang
        gl.glPushMatrix();
        gl.glTranslated(0.05, 0, 0);
        gl.glRotated(90, 1, 0, 0);
        gl.glRotated(45, 1, 0, 0);
        gl.glRotated(6, 0, 1, 0);
        gl.glColor3d(0.5, 0, 0);
        glu.gluCylinder(q, BODY_RADIUS4, BODY_RADIUS4, BODY_LENGTH4, SLICES, STACKS);
        gl.glColor3d(0.5, 0, 1);
        glu.gluDisk(q, 0.0f, BODY_RADIUS4, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, BODY_LENGTH4);
        glu.gluDisk(q, 0.0f, BODY_RADIUS4, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslated(0.3, 0, 0);
        gl.glTranslated(0, -0.5, 0);//
        gl.glTranslated(0, 0, -BODY_LENGTH);
        gl.glRotated(90, 1, 0, 0);
        gl.glColor3d(0.5, 0, 0);
        glu.gluCylinder(q, 0.08, BODY_RADIUS5, BODY_LENGTH5, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslated(0, 0, -BODY_LENGTH);
        gl.glRotated(90, 1, 0, 0);
        gl.glRotated(29, 0, 1, 0);
        gl.glColor3d(0.5, 0, 0);
        glu.gluCylinder(q, 0.08, 0.08, 0.65, SLICES, STACKS);
        gl.glPopMatrix();

        //
        gl.glPushMatrix();
        gl.glTranslated(-0.05, 0, 0);
        gl.glRotated(90, 1, 0, 0);
        gl.glRotated(45, 1, 0, 0);
        gl.glRotated(6, 0, -1, 0);
        gl.glColor3d(0.5, 0, 0);
        glu.gluCylinder(q, BODY_RADIUS4, BODY_RADIUS4, BODY_LENGTH4, SLICES, STACKS);
        gl.glColor3d(0.5, 0, 1);
        glu.gluDisk(q, 0.0f, BODY_RADIUS4, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, BODY_LENGTH4);
        glu.gluDisk(q, 0.0f, BODY_RADIUS4, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslated(-0.3, 0, 0);
        gl.glTranslated(0, -0.5, 0);//
        gl.glTranslated(0, 0, -BODY_LENGTH);
        gl.glRotated(90, 1, 0, 0);
        gl.glColor3d(0.5, 0, 0);
        glu.gluCylinder(q, 0.08, BODY_RADIUS5, BODY_LENGTH5, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslated(0, 0, -BODY_LENGTH);
        gl.glRotated(90, 1, 0, 0);
        gl.glRotated(-29, 0, 1, 0);
        gl.glColor3d(0.5, 0, 0);
        glu.gluCylinder(q, 0.08, 0.08, 0.65, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslated(-0.15, -0.5, -0.5);
        gl.glRotated(90, 1, 0, 0);
        gl.glRotated(90, 0, 1, 0);
        gl.glColor3d(0.5, 0, 0);
        glu.gluCylinder(q, 0.05, 0.05, 0.3, SLICES, STACKS);
        gl.glPopMatrix();
    }

    static void Setang(GL gl) {
        float BODY_RADIUS = 0.12f;
        float BODY_LENGTH = 0.8f;

        float BODY_RADIUS2 = 0.06f;
        float BODY_LENGTH2 = 1f;

        float BODY_RADIUS3 = 0.08f;
        float BODY_LENGTH3 = 1f;

        float BODY_RADIUS4 = 0.14f;
        float BODY_LENGTH4 = 0.22f;

        float BODY_RADIUS5 = 0.05f;
        float BODY_LENGTH5 = 1.5f;

        int SLICES = 130;
        int STACKS = 130;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();

        gl.glPushMatrix();
        gl.glColor3d(0, 0, 0);//3.025
        gl.glTranslated(0, 0, 1.5);
        // gl.glRotated(15, 1, 0, 0);
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0, 0, 0);
        gl.glTranslated(0, 0, 1.5);
        //gl.glRotated(15, 1, 0, 0);
        gl.glTranslated(0, 0.0, 0.8);
        glu.gluCylinder(q, BODY_RADIUS, 0.08, 0.1, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0, 0, 0);
        gl.glTranslated(0, 0, 1.5);
        // gl.glRotated(15, 1, 0, 0);
        gl.glTranslated(0, 0.0, 0.9);
        glu.gluCylinder(q, 0.08, 0.08, 0.2, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, 0.08, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0, 0, 0);//
        gl.glTranslated(0, 0.05, 2.5);
        gl.glRotated(-75, 1, 0, 0);
        glu.gluCylinder(q, 0.1, 0.08, 0.35, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, 0.08, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0, 0, 0);//setir
        gl.glTranslated(-1.15, 0.4, 2.6);
        gl.glRotated(90, 0, 1, 0);
        gl.glTranslated(0, 0.0, 0.9);
        glu.gluCylinder(q, 0.08, 0.08, 0.5, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, 0.08, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0, 0, 0);//setir r1
        gl.glTranslated(-1.15, 0.4, 2.6);
        gl.glRotated(90, 0, 1, 0);
        gl.glTranslated(0, 0.0, 1.4);
        gl.glRotated(-25, 0, 1, 0);
        glu.gluCylinder(q, 0.08, 0.06, 0.2, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0, 0, 0);//setir r2
        gl.glTranslated(-1.15, 0.4, 2.6);
        gl.glRotated(90, 0, 1, 0);
        gl.glTranslated(-0.07, 0.0, 1.55);
        glu.gluCylinder(q, 0.06, 0.06, 0.7, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);//selontong r2
        gl.glTranslated(-1.15, 0.4, 2.6);
        gl.glRotated(90, 0, 1, 0);
        gl.glTranslated(-0.07, 0.0, 1.77);
        glu.gluCylinder(q, 0.07, 0.07, 0.45, SLICES, STACKS);
        gl.glColor3d(0.8, 0, 0);
        glu.gluCylinder(q, 0.12, 0.12, 0.03, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, 0.12, SLICES, STACKS);

        gl.glColor3d(0, 0, 0);
        gl.glTranslated(0, 0.0, 0.45);
        glu.gluDisk(q, 0.0f, 0.06, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0, 0, 0);//setir l1
        gl.glTranslated(-1.15, 0.4, 2.6);
        gl.glRotated(-90, 0, 1, 0);
        gl.glTranslated(0, 0, -0.9);
        gl.glRotated(25, 0, 1, 0);
        glu.gluCylinder(q, 0.08, 0.06, 0.2, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0, 0, 0);//setir l2
        gl.glTranslated(1.15, 0.4, 2.6);
        gl.glRotated(-90, 0, 1, 0);
        gl.glTranslated(0.07, 0.0, 1.55);
        glu.gluCylinder(q, 0.06, 0.06, 0.7, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);//slontong l2
        gl.glTranslated(1.15, 0.4, 2.6);
        gl.glRotated(-90, 0, 1, 0);
        gl.glTranslated(0.07, 0.0, 1.77);
        glu.gluCylinder(q, 0.07, 0.07, 0.45, SLICES, STACKS);
        gl.glColor3d(0.8, 0, 0);//slontong l2
        glu.gluCylinder(q, 0.12, 0.12, 0.03, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, 0.12, SLICES, STACKS);

        gl.glColor3d(0, 0, 0);
        gl.glTranslated(0, 0.0, 0.45);
        glu.gluDisk(q, 0.0f, 0.06, SLICES, STACKS);
        gl.glPopMatrix();

        ////////////////
        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);
        gl.glTranslated(0, 0, 1.5);
        gl.glTranslated(0, 0.01, -0.2);
        glu.gluCylinder(q, BODY_RADIUS4, BODY_RADIUS4, BODY_LENGTH4, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS4, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, BODY_LENGTH4);
        glu.gluDisk(q, 0.0f, BODY_RADIUS4, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0.5, 0.5, 0.5);
        gl.glTranslated(0, 0, 1.5);
        gl.glTranslated(0.3, 0.18, -1.2);//
        glu.gluCylinder(q, BODY_RADIUS2, BODY_RADIUS2, BODY_LENGTH2, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);
        gl.glTranslated(0, 0, 1.5);
        gl.glTranslated(0.3, 0.18, -1.6);//bottom
        glu.gluCylinder(q, BODY_RADIUS3, BODY_RADIUS3, BODY_LENGTH3, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);
        gl.glTranslated(0, -0.1, 1.5);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3d(0.4, 0.2, -0.2);
        gl.glVertex3d(0.4, 0.4, -0.2);
        gl.glVertex3d(0, 0.2, 0);
        gl.glEnd();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);
        gl.glTranslated(0, -0.1, 1.5);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3d(0, 0, -0.2);
        gl.glVertex3d(0.4, 0.2, -0.3);
        gl.glVertex3d(0.4, 0.4, -0.3);
        gl.glVertex3d(0, 0.2, -0.2);
        gl.glEnd();
        gl.glPopMatrix();

        //
        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);
        gl.glTranslated(0, -0.1, 1.5);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3d(0.4, 0.2, -0.2);
        gl.glVertex3d(0.4, 0.2, -0.3);
        gl.glVertex3d(0, 0, -0.2);
        gl.glEnd();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);
        gl.glTranslated(0, -0.1, 1.5);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3d(0, 0.2, 0);
        gl.glVertex3d(0.4, 0.4, -0.2);
        gl.glVertex3d(0.4, 0.4, -0.3);
        gl.glVertex3d(0, 0.2, -0.2);
        gl.glEnd();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);
        gl.glTranslated(0, -0.1, 1.5);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3d(0.4, 0.2, -0.2);
        gl.glVertex3d(0.4, 0.4, -0.2);
        gl.glVertex3d(0.4, 0.4, -0.3);
        gl.glVertex3d(0.4, 0.2, -0.3);
        gl.glEnd();
        gl.glPopMatrix();

        //left
        gl.glPushMatrix();
        gl.glColor3d(0.5, 0.5, 0.5);
        gl.glTranslated(0, 0, 1.5);
        gl.glTranslated(-0.3, 0.18, -1.2);//
        glu.gluCylinder(q, BODY_RADIUS2, BODY_RADIUS2, BODY_LENGTH2, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);
        gl.glTranslated(0, 0, 1.5);
        gl.glTranslated(-0.3, 0.18, -1.6);//bottom
        glu.gluCylinder(q, BODY_RADIUS3, BODY_RADIUS3, BODY_LENGTH3, SLICES, STACKS);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);
        gl.glTranslated(0, -0.1, 1.5);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3d(-0.4, 0.2, -0.2);
        gl.glVertex3d(-0.4, 0.4, -0.2);
        gl.glVertex3d(0, 0.2, 0);
        gl.glEnd();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);
        gl.glTranslated(0, -0.1, 1.5);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3d(0, 0, -0.2);
        gl.glVertex3d(-0.4, 0.2, -0.3);
        gl.glVertex3d(-0.4, 0.4, -0.3);
        gl.glVertex3d(0, 0.2, -0.2);
        gl.glEnd();
        gl.glPopMatrix();

        //
        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);
        gl.glTranslated(0, -0.1, 1.5);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3d(-0.4, 0.2, -0.2);
        gl.glVertex3d(-0.4, 0.2, -0.3);
        gl.glVertex3d(0, 0, -0.2);
        gl.glEnd();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);
        gl.glTranslated(0, -0.1, 1.5);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3d(0, 0.2, 0);
        gl.glVertex3d(-0.4, 0.4, -0.2);
        gl.glVertex3d(-0.4, 0.4, -0.3);
        gl.glVertex3d(0, 0.2, -0.2);
        gl.glEnd();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0.5, 0, 0);
        gl.glTranslated(0, -0.1, 1.5);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3d(-0.4, 0.2, -0.2);
        gl.glVertex3d(-0.4, 0.4, -0.2);
        gl.glVertex3d(-0.4, 0.4, -0.3);
        gl.glVertex3d(-0.4, 0.2, -0.3);
        gl.glEnd();
        gl.glPopMatrix();

    }
}
   