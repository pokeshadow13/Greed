import java.awt.Point;
import java.awt.Color;

public class test {
    public static void main(String[] args) {
        JCon j = new JCon();
        
        j.setTitle("test");
        j.setTitle(j.getTitle() + "!");
        
        for (int i = 0; i < 25; i++) {
            for (int ii = 0; ii < 80; ii++) j.append(".");
            j.append("\n");
        }
        j.sleep(1000);
        j.clear();
        j.write("This is a test");
        j.append("!");
        j.insert("great ", 5);
        j.replace("FANTASTIC", 5, 10);
        
        j.setForeground(Color.BLACK);
        j.setBackground(Color.WHITE);
        
        //for (;;) if(j.keyPressed(90, 16)) j.append("\nThe keys have been pressed");
        for (;;) if(j.keyPressed('a')) j.append("\nThe keys have been pressed");
        
        //j.setBG(255,0,0);
        //j.setFG(0,0,0);
        //j.write("A quick demo of what this can do");
        //try{Thread.sleep(1000);}catch(InterruptedException ex){}
        //for (int i = 0; i < 3; i++) {
        //    j.append(".");
        //    try{Thread.sleep(500);}catch(InterruptedException ex){}
        //}
        //
        //j.write("");
        //for (int i = 0; i < 25; i++) {
        //    for (int ii = 0; ii < 80; ii++) j.append(".");
        //    j.append("\n");
        //}
        //int[] c = new int[]{255,0,0};
        //int p = 0;
        //for (;;) {
        //    p%=3;
        //    while (c[(p+1)%3]<255) {
        //        c[(p+1)%3]++;
        //        j.setBG(c[0],c[1],c[2]);
        //        Point m = j.getMouse();
        //        Point x = j.getChar();
        //        int l = (x.x+x.y*81);
        //        j.setTitle(j.keyPressed(90, 16) + " - " + x.x + " - " + x.y + " ( " + m.x + " - " + m.y + " ) ");
        //        if (j.mouseIn() && j.mousePressed(1)) {
        //            j.replace("#",l,l+1);
        //        }
        //        if (j.mouseIn() && j.mousePressed(3)) {
        //            j.replace(".",l,l+1);
        //        }
        //        try{Thread.sleep(10);}catch(InterruptedException ex){}
        //    }
        //    while (c[p]>0) {
        //        c[p]--;
        //        j.setBG(c[0],c[1],c[2]);
        //        Point m = j.getMouse();
        //        Point x = j.getChar();
        //        int l = (x.x+x.y*81);
        //        j.setTitle(j.keyPressed(90, 16) + " - " + x.x + " - " + x.y + " ( " + m.x + " - " + m.y + " ) ");
        //        if (j.mouseIn() && j.mousePressed(1)) {
        //            j.replace("#",l,l+1);
        //        }
        //        if (j.mouseIn() && j.mousePressed(3)) {
        //            j.replace(".",l,l+1);
        //        }
        //        try{Thread.sleep(10);}catch(InterruptedException ex){}
        //    }
        //    p++;
        //}
    }
}