/*
 */
package PROJECT;
/**
 * @author Admin
 */
public class MAIN {
    static String anntheme,annrate,partheme,parrate,accommo,arate,event,ch;
        public static void main(String args[]) {
           try{
        P0 lw = new P0();
        lw.setVisible(true);
        for(int i=1;i<=100;i++)
        {
           Thread.sleep(30);
           lw.loadingnum.setText(i+"%");
           lw.loadingbar.setValue(i);
           
        if(i==100){
           P1 UU = new P1();
           UU.setVisible(true);
        }}}
           catch(Exception e){}
        }}