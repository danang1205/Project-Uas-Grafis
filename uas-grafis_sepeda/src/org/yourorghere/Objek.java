/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

/**
 *
 * @author USER
 */
class Objek {
    static void roda(GL gl){
        float BODY_LENGTH = 0.5f;
        float BODY_RADIUS = 1.0f;
        //Set_Material(gl);
        int SLICES = 100;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();

        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        gl.glNormal3f(0.0f, 0.0f, 1.0f);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
    }
    static void rangkadepan(GL gl){
        float BODY_LENGTH=3.0f;
        float BODY_RADIUS=0.1f;
        GLU glu=new GLU();
        int SLICES=30;
        int STACKS=30;
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        gl.glNormal3f(0.0f, 0.0f, 1.0f);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
    }
    static void rangkabelakang(GL gl){
        float BODY_LENGTH=2.0f;
        float BODY_RADIUS=0.1f;
        GLU glu=new GLU();
        int SLICES=30;
        int STACKS=30;
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        gl.glNormal3f(0.0f, 0.0f, 1.0f);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
    }
    static void rangkatengah(GL gl){
        float BODY_LENGTH=4.0f;
        float BODY_RADIUS=0.1f;
        GLU glu=new GLU();
        int SLICES=30;
        int STACKS=30;
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        gl.glNormal3f(0.0f, 0.0f, 1.0f);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
    }
    static void stang(GL gl){
        float BODY_LENGTH=3.0f;
        float BODY_RADIUS=0.1f;
        GLU glu=new GLU();
        int SLICES=30;
        int STACKS=30;
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        gl.glNormal3f(0.0f, 0.0f, 1.0f);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
    }
}
