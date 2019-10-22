package jpicture;

/**
 * @author Alberto Ruiz
 */
public class JBullet extends JPlayer {
    
    private HitListener hitListener;

    public JBullet() {
        super();
    }

    public void setBullet(JPlayer player) {
        if (player.getGrade() == -45) {
            setLocation(player.getXPlayer() + 1, player.getYPlayer() + 1);
            setXPlayer(player.getXPlayer() + 1);
            setYPlayer(player.getYPlayer() + 1);
            setGrade(-45);
            repaint();
        }
        if (player.getGrade() == -135) {
            setLocation(player.getXPlayer() - 1, player.getYPlayer() + 1);
            setXPlayer(player.getXPlayer() - 1);
            setYPlayer(player.getYPlayer() + 1);
            setGrade(-135);
            repaint();
        }
        if (player.getGrade() == 135) {
            setLocation(player.getXPlayer() - 1, player.getYPlayer() - 1);
            setXPlayer(player.getXPlayer() - 1);
            setYPlayer(player.getYPlayer() - 1);
            setGrade(135);
            repaint();
        }
        if (player.getGrade() == 45) {
            setLocation(player.getXPlayer() + 1, player.getYPlayer() - 1);
            setXPlayer(player.getXPlayer() + 1);
            setYPlayer(player.getYPlayer() - 1);
            setGrade(45);
            repaint();
        }
        if (player.getGrade() == -90) {
            setLocation(player.getXPlayer(), player.getYPlayer() + 1);
            setXPlayer(player.getXPlayer());
            setYPlayer(player.getYPlayer() + 1);
            setGrade(-90);
            repaint();
        }

        if (player.getGrade() == 90) {
            setLocation(player.getXPlayer(), player.getYPlayer() - 1);
            setXPlayer(player.getXPlayer());
            setYPlayer(player.getYPlayer() - 1);
            setGrade(90);
            repaint();
        }

        if (player.getGrade() == 0) {
            setLocation(player.getXPlayer() + 1, player.getYPlayer());
            setXPlayer(player.getXPlayer() + 1);
            setYPlayer(player.getYPlayer());
            setGrade(0);
            repaint();
        }
        if (player.getGrade() == -180) {
            setLocation(player.getXPlayer() - 1, player.getYPlayer());
            setXPlayer(player.getXPlayer() - 1);
            setYPlayer(player.getYPlayer());
            setGrade(-180);
            repaint();
        }
    }

    public void shoot(JZombie zombie, JPlayer player) throws InterruptedException {
        int distance = 0;
        int isFired = player.getGrade();

        int posXDistance;
        int posYDistance;

        while (distance < 300) {

            posXDistance = zombie.getXPlayer() - getXPlayer();
            posYDistance = zombie.getYPlayer() - getYPlayer();

            if (Math.abs(posXDistance) > 50 || Math.abs(posYDistance) > 50) {
                if (isFired == -45) {
                    setXPlayer(getXPlayer() + 1);
                    setYPlayer(getYPlayer() - 1);
                    setLocation(getXPlayer(), getYPlayer()); 
                }
                if (isFired == -135) {
                    setXPlayer(getXPlayer() - 1);
                    setYPlayer(getYPlayer() - 1);
                    setLocation(getXPlayer(), getYPlayer());
                }
                if (isFired == 135) {
                    setXPlayer(getXPlayer() - 1);
                    setYPlayer(getYPlayer() + 1);
                    setLocation(getXPlayer(), getYPlayer());
                }
                if (isFired == 45) {
                    setXPlayer(getXPlayer() + 1);
                    setYPlayer(getYPlayer() + 1);
                    setLocation(getXPlayer(), getYPlayer());
                }
                if (isFired == -90) {
                    setYPlayer(getYPlayer() - 1);
                    setLocation(getXPlayer(), getYPlayer());
                }

                if (isFired == 90) {
                    setYPlayer(getYPlayer() + 1);
                    setLocation(getXPlayer(), getYPlayer());
                }

                if (isFired == 0) {
                    setXPlayer(getXPlayer() + 1);
                    setLocation(getXPlayer(), getYPlayer());
                }
                if (isFired == -180) {
                    setXPlayer(getXPlayer() - 1);
                    setLocation(getXPlayer(), getYPlayer());
                }
                Thread.sleep(2);
                distance++;
            } else {
                hitListener.hit();
                distance = 300;
            }
        }
    }

    public void addHitListener(HitListener hitListener) {
        this.hitListener = hitListener;
    }

    public void removeHitListener(HitListener hitListener) {
        this.hitListener = null;
    }
}
