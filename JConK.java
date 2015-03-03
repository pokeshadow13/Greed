//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//import java.util.ArrayList;
//import java.util.List;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class JConK extends KeyAdapter{
    List<Integer> chars = new ArrayList<>();
    
    @Override
    public void keyPressed(KeyEvent e) {
        Integer temp = new Integer(e.getKeyCode());
        if(!chars.contains(temp)) chars.add(temp);
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        chars.remove(new Integer(e.getKeyCode()));
    }
    
    
    //List<Integer> chars = new ArrayList<>();
    //
    //@Override
    //public void keyTyped(KeyEvent e) {
    //}
    //
    //@Override
    //public void keyReleased(KeyEvent e) {
    //    chars.remove(new Integer(e.getKeyCode()));
    //}
    //
    //@Override
    //public void keyPressed(KeyEvent e) {
    //    Integer temp = new Integer(e.getKeyCode());
    //    if(!chars.contains(temp)) chars.add(temp);
    //}
}