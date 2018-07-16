package org.yourorghere;
import com.sun.opengl.util.Animator;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
public class UasGrafis_sepeda extends JFrame {
static {
// When using a GLCanvas, we have to set the Popup-Menues tobe HeavyWeight,
// so they display properly on top of the GLCanvasJPopupMenu.setDefaultLightWeightPopupEnabled(false);
}
private Animator animator;
/** Creates new form MainFrame */
public UasGrafis_sepeda() {
initComponents();
final GLRenderer glrender = new GLRenderer();
KeyListener mylisterner = new KeyListener() {
public void keyTyped(KeyEvent e) {
System.out.println("typed "+e.getKeyCode());
}
public void keyPressed(KeyEvent e) {
System.out.println("pressed "+e.getKeyCode());
glrender.Key_Pressed(e.getKeyCode());
canvas.repaint();
}
public void keyReleased(KeyEvent e) {
System.out.println("released "+e.getKeyCode());
}
};
canvas.addGLEventListener(glrender);
Timer mytimer = new Timer();
TimerTask mytimertask = new TimerTask() {
@Override
public void run() {
//glrender.draw_text(glut, gl);
canvas.repaint();
//To change body of generated methods, choose Tools| Templates.
}
};
mytimer.schedule(mytimertask, 100, 100);
addKeyListener(mylisterner);
animator = new Animator(canvas);
this.setLocationRelativeTo(null);
this.setSize(600,400);
animator = new Animator(canvas);
// This is a workaround for the GLCanvas not adjusting itssize, when the frame is resized.
canvas.setMinimumSize(new Dimension());
this.addWindowListener(new WindowAdapter() {
@Override
public void windowClosing(WindowEvent e) {
// Run this on another thread than the AWT eventqueue to
// make sure the call to Animator.stop() completesbefore
// exiting
new Thread(new Runnable() {
    
public void run() {
animator.stop();
System.exit(0);
}
}).start();
}
});
}
@Override
public void setVisible(boolean show){
if(!show)
animator.stop();
super.setVisible(show);
if(!show)
animator.start();
}
/** This method is called from within the constructor to
* initialize the form.
* WARNING: Do NOT modify this code. The content of this method
is
* always regenerated by the Form Editor.
*/
@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="GeneratedCode">//GEN-BEGIN:initComponents
private void initComponents() {
JLabel label = new JLabel();
canvas = new GLCanvas(createGLCapabilites());
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
label.setText("Gunakan Keyboard untuk menggerakkan kamera");
GroupLayout layout = new GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addGroup(layout.createParallelGroup(Alignment.LEADING)
.addComponent(canvas, GroupLayout.DEFAULT_SIZE,
380, Short.MAX_VALUE)
.addComponent(label))
.addContainerGap())
);
layout.setVerticalGroup(
        layout.createParallelGroup(Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(label)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(canvas, GroupLayout.DEFAULT_SIZE, 255,
Short.MAX_VALUE)
.addContainerGap())
);
pack();
}// </editor-fold>//GEN-END:initComponents
/**
* Called from within initComponents().
* hint: to customize the generated code choose 'Customize Code'
in the contextmenu
* of the selected UI Component you wish to cutomize in design
mode.
* @return Returns customized GLCapabilities.
*/
private GLCapabilities createGLCapabilites() {
GLCapabilities capabilities = new GLCapabilities();
capabilities.setHardwareAccelerated(true);
// try to enable 2x anti aliasing - should be supported on most hardware
capabilities.setNumSamples(2);
capabilities.setSampleBuffers(true);
return capabilities;
}
/**
* @param args the command line arguments
*/
public static void main(String args[]) {
// Run this in the AWT event thread to prevent deadlocks and race conditions
EventQueue.invokeLater(new Runnable() {
public void run() {
// switch to system l&f for native font rendering etc.
try{
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
}catch(Exception ex) {
    
Logger.getLogger(getClass().getName()).log(Level.INFO, "can not enable system look and feel", ex);
}
UasGrafis_sepeda frame = new UasGrafis_sepeda();
frame.setVisible(true);
}
});
}
// Variables declaration - do not modify//GEN-BEGIN:variables
private GLCanvas canvas;
// End of variables declaration//GEN-END:variables
}
