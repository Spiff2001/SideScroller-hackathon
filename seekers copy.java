import java.awt.*;

public class seekers {


    public int xpos;
    public int ypos;
    public String Name;
    public int height;
    public int width;
    public boolean alive;
    public int dx;
    public int dy;
    public boolean isAlive;
    public Rectangle hitbox;
    public Rectangle teleportBox;
    public boolean teleportIntersection;
    public long currentTime, elapsedTime,startTime;


    public seekers(int pXpos, int pYpos) {
        dx=0;
        dy=0;
        height=83;
        width=100;
        xpos=pXpos;
        ypos=pYpos;
        alive=true;
        hitbox=new Rectangle(xpos,ypos,width,height);
        




    }
    public void move(int targetXpos,int targetYpos,int counter){
        xpos=xpos+dx;
        ypos=ypos+dy;
        if(counter%50==0) {
            // hunter seeker movement function, quadrant 1 (upper left)
            if (targetXpos < xpos && targetYpos < ypos) {
                dx = targetXpos-xpos;
                while (java.lang.Math.abs(dx) > 6) {
                    dx = (int) dx / 2;
                }
                dy = targetYpos-ypos;
                while (java.lang.Math.abs(dy)> 6) {
                    dy = (int) dy / 2;
                }
            }
            //quadrant 2 (upper right)
            if (targetXpos > xpos && targetYpos < ypos) {
                dx = targetXpos - xpos;
                while (java.lang.Math.abs(dx) > 6) {
                    dx = (int) dx / 2;
                }
                dy = targetYpos-ypos;
                while (java.lang.Math.abs(dy) > 6) {
                    dy = (int) dy / 2;
                }
            }
            //quadrant 3 (lower left)
            if (targetXpos < xpos && targetYpos > ypos) {
                dx = targetXpos-xpos;
                while (java.lang.Math.abs(dx) > 6) {
                    dx = (int) dx / 2;
                }
                dy = targetYpos-ypos;
                while (java.lang.Math.abs(dy) > 6) {
                    dy = (int) dy / 2;
                }
            }
            // grid quadrant 4(lower right)
            if (targetXpos > xpos && targetYpos > ypos) {
                dx = targetXpos - xpos;
                while (java.lang.Math.abs(dx) > 6) {
                    dx = (int) dx / 2;
                }
                dy = targetYpos - ypos;
                while (java.lang.Math.abs(dy) > 6) {
                    dy = (int) dy / 2;
                }
            }
        }
        if (ypos + 100 > 700) {
            dy = dy * -1;
            ypos=ypos-20;
        }
        if (ypos<0) {
            dy = dy * -1;
            ypos=ypos+20;
        }
        if (xpos + 100 > 1000) {
            dx = dx * -1;
            xpos=xpos-20;
        }
        if (xpos<0) {
            dx = dx * -1;
            xpos=xpos+20;
        }

        hitbox= new Rectangle(xpos,ypos,width,height);
    }


}
