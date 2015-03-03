//import javax.swing.JFrame;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Point;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JCon {
    private JFrame f;
    private JTextArea t;
    private JConM m;
    private JConK k;
    
    /**
    * Creates JCon with default values (No Name, 80*25 chars, 12px font).
    */
    
    public JCon() {
        init("",80, 25, 12);
    }
    
    /**
    * Creates JCon with specified values.
    * 
    * @param title Name of JCon
    * @param xSize width in characters
    * @param ySize height in characters
    * @param fSize font size in pixels
    */
    
    public JCon(String title, int xSize, int ySize, int fSize) {
        init(title,xSize, ySize, fSize);
    }
    
    private void init(String title, int xSize, int ySize, int fSize) {
        f = new JFrame(title);
        t = new JTextArea(ySize, xSize);
        m = new JConM();
        k = new JConK();
        
        Font font = new Font("Courier New", Font.PLAIN, fSize);
        
        
        t.setForeground(Color.WHITE);
        t.setBackground(Color.BLACK);
        t.setFont(font);
        t.setTabSize(4);
        
        t.setEditable(false);
        t.setHighlighter(null);
        t.setFocusable(true);
        
        t.addKeyListener(k);
        t.addMouseListener(m);
        t.addMouseMotionListener(m);
        t.requestFocusInWindow();
        
        
        f.setSize(0, 0);
        f.setFocusable(false);
        f.setResizable(false);
        
        f.setDefaultCloseOperation(this.f.EXIT_ON_CLOSE);
        f.setContentPane(t);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    
    /**
    * Appends given text to end of console.
    * 
    * @param text String What to write
    */
    
    public void append(String text) {
        t.append(text);
    }
    
    /**
    * Clears JCon of all text
    */
    
    public void clear() {
        t.setText("");
    }
    
    /**
    * Returns Current title of JCon.
    * 
    * @return Current title
    */
    
    public String getTitle() {
        return f.getTitle();
    }
    
    /**
    * Inserts text directly after specified position
    * 
    * @param text     What to write
    * @param position Beginning of selection (inclusive)
    */
    
    public void insert(String text, int position) {
        t.insert(text, position);
    }
    
    /**
    * Replaces range with given text.
    * 
    * @param text  What to write
    * @param start Beginning of selection (inclusive)
    * @param end   End of selection (exclusive)
    */
    
    public void replace(String text, int start, int end) {
        t.replaceRange(text, start, end);
    }
    
    /**
    * Sets background colour of JCon.
    * 
    * @param colour The colour to set it to
    */
    
    public void setBackground(Color colour) {
        this.t.setBackground(colour);
    }
    
    /**
    * Sets foreground colour of JCon.
    * 
    * @param colour The colour to set it to
    */
    
    public void setForeground(Color colour) {
        this.t.setForeground(colour);
    }
    
    /**
    * Sets title if JCon to given text.
    * 
    * @param title The title to set
    */
    
    public void setTitle(String title) {
        f.setTitle(title);
    }
    
    /**
    * Causes program to cease execution for specified number of milliseconds
    * 
    * @param mill Milliseconds to sleep for
    */
    
    public void sleep(long mill) {
        try{
            Thread.sleep(mill);
        }catch(InterruptedException ex) {}
    }
    
    /**
    * Causes program to cease execution for specified number of milliseconds + nanoseconds.
    * 
    * @param mill Milliseconds to sleep for
    * @param nano Nanoseconds to sleep for
    */
    
    public void sleep(long mill, int nano) {
        try{
            Thread.sleep(mill, nano);
        }catch(InterruptedException ex) {}
    }
    
    /**
    * Replaces all text with given text.
    * 
    * @param text What to write
    */
    
    public void write(String text) {
        t.setText(text);
    }
    
    /**
    * Checks if a set of keys has been pressed.
    * 
    * @param key The keycodes to check for
    * @return If all have been pressed
    */
    
    public boolean keyPressed(int... key) {
        boolean[] temp = new boolean[key.length];
        for (int i = 0; i < key.length; i++) temp[i] = k.chars.contains(new Integer(key[i]));
        for (boolean i: temp) if(!i) return false;
        return true;
    }
    
    /**
    * Checks if a key has been pressed.
    * 
    * @param key The character to check for
    * @return If it has been pressed
    */
    
    //public boolean keyPressed(char key) {
    //    int code = KeyEvent.getExtendedKeyCodeForChar(key);
    //    return keyPressed(code);
    //}
    
    public boolean keyPressed(char key) {
        boolean x = false;
        switch (key) {
            case 'a':  x = keyPressed(KeyEvent.VK_A); break;
            case 'b':  x = keyPressed(KeyEvent.VK_B); break;
            case 'c':  x = keyPressed(KeyEvent.VK_C); break;
            case 'd':  x = keyPressed(KeyEvent.VK_D); break;
            case 'e':  x = keyPressed(KeyEvent.VK_E); break;
            case 'f':  x = keyPressed(KeyEvent.VK_F); break;
            case 'g':  x = keyPressed(KeyEvent.VK_G); break;
            case 'h':  x = keyPressed(KeyEvent.VK_H); break;
            case 'i':  x = keyPressed(KeyEvent.VK_I); break;
            case 'j':  x = keyPressed(KeyEvent.VK_J); break;
            case 'k':  x = keyPressed(KeyEvent.VK_K); break;
            case 'l':  x = keyPressed(KeyEvent.VK_L); break;
            case 'm':  x = keyPressed(KeyEvent.VK_M); break;
            case 'n':  x = keyPressed(KeyEvent.VK_N); break;
            case 'o':  x = keyPressed(KeyEvent.VK_O); break;
            case 'p':  x = keyPressed(KeyEvent.VK_P); break;
            case 'q':  x = keyPressed(KeyEvent.VK_Q); break;
            case 'r':  x = keyPressed(KeyEvent.VK_R); break;
            case 's':  x = keyPressed(KeyEvent.VK_S); break;
            case 't':  x = keyPressed(KeyEvent.VK_T); break;
            case 'u':  x = keyPressed(KeyEvent.VK_U); break;
            case 'v':  x = keyPressed(KeyEvent.VK_V); break;
            case 'w':  x = keyPressed(KeyEvent.VK_W); break;
            case 'x':  x = keyPressed(KeyEvent.VK_X); break;
            case 'y':  x = keyPressed(KeyEvent.VK_Y); break;
            case 'z':  x = keyPressed(KeyEvent.VK_Z); break;
            case 'A':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_A); break;
            case 'B':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_B); break;
            case 'C':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_C); break;
            case 'D':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_D); break;
            case 'E':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_E); break;
            case 'F':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_F); break;
            case 'G':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_G); break;
            case 'H':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_H); break;
            case 'I':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_I); break;
            case 'J':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_J); break;
            case 'K':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_K); break;
            case 'L':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_L); break;
            case 'M':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_M); break;
            case 'N':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_N); break;
            case 'O':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_O); break;
            case 'P':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_P); break;
            case 'Q':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_Q); break;
            case 'R':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_R); break;
            case 'S':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_S); break;
            case 'T':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_T); break;
            case 'U':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_U); break;
            case 'V':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_V); break;
            case 'W':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_W); break;
            case 'X':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_X); break;
            case 'Y':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_Y); break;
            case 'Z':  x = keyPressed(KeyEvent.VK_SHIFT, KeyEvent.VK_Z); break;
            case '0':  x = keyPressed(KeyEvent.VK_0); break;
            case '1':  x = keyPressed(KeyEvent.VK_1); break;
            case '2':  x = keyPressed(KeyEvent.VK_2); break;
            case '3':  x = keyPressed(KeyEvent.VK_3); break;
            case '4':  x = keyPressed(KeyEvent.VK_4); break;
            case '5':  x = keyPressed(KeyEvent.VK_5); break;
            case '6':  x = keyPressed(KeyEvent.VK_6); break;
            case '7':  x = keyPressed(KeyEvent.VK_7); break;
            case '8':  x = keyPressed(KeyEvent.VK_8); break;
            case '9':  x = keyPressed(KeyEvent.VK_9); break;
            default: return false;
        }
        return x;
    }
    
    ///**
    //* Gives pixel position of mouse relative to top left of JCon.
    //* 
    //* @return Mouse position
    //*/
    //
    //public Point getMouse() {
    //    return this.t.getMouse();
    //}
    //
    ///**
    //* Gives character position of mouse relative to top left of JCon.
    //* 
    //* @return Mouse position
    //*/
    //
    //public Point getChar() {
    //    return this.t.getChar();
    //}
    //
    ///**
    //* Checks if mouse button is pressed.
    //* 
    //* @return If mouse is pressed
    //*/
    //
    //public boolean mousePressed(int button) { //to be expanded with button ids
    //    return this.t.buttonPressed(button);
    //}
    //
    ///**
    //* Checks if mouse is within the JCon.
    //* 
    //* @return If mouse is within JCon
    //*/
    //
    //public boolean mouseIn() {
    //    return this.t.mouseIn();
    //}
    
    //public boolean keyPressed(int... c) {
    //    boolean[] t = new boolean[c.length];
    //    for (int i = 0; i < c.length; i++) t[i] = this.t.keyPressed(c[i]);
    //    for (boolean i: t) if(!i) return false;
    //    return true;
    //}
}