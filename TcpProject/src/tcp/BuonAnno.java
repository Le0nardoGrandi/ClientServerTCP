package tcp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BuonAnno extends Thread {
    public int  n=0;
    @Override
    public void run(){
        for(int c=5;c!=0;c-=1){
                try {
                    if(n==1){
                        System.out.println("STOOOOOOOOOP!!!!");
                        this.interrupt();
                        
                        break;
                    }
                    System.out.println(c);
                    sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BuonAnno.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
    }
}