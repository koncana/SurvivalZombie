package jComponents;

/**
 * @author Alberto Ruiz
 */
public class JBullet extends JPlayer {

    private HitListener hitListener;

    public JBullet() {
        super();
    }

    public void setBullet(JPlayer player) {
        if (!player.isIsPaused()) {
            if (player.getGrade() == -45) {
                setLocation(player.getXPlayer() + 97, player.getYPlayer() + 20);
                setXPlayer(player.getXPlayer() + 97);
                setYPlayer(player.getYPlayer() + 20);
                setGrade(-45);
                repaint();
            }
            if (player.getGrade() == -135) {
                setLocation(player.getXPlayer() + 18, player.getYPlayer() + 1);
                setXPlayer(player.getXPlayer() + 18);
                setYPlayer(player.getYPlayer() + 1);
                setGrade(-135);
                repaint();
            }
            if (player.getGrade() == 135) {
                setLocation(player.getXPlayer() + 8, player.getYPlayer() + 70);
                setXPlayer(player.getXPlayer() + 8);
                setYPlayer(player.getYPlayer() + 70);
                setGrade(135);
                repaint();
            }
            if (player.getGrade() == 45) {
                setLocation(player.getXPlayer() + 75, player.getYPlayer() + 100);
                setXPlayer(player.getXPlayer() + 75);
                setYPlayer(player.getYPlayer() + 100);
                setGrade(45);
                repaint();
            }
            if (player.getGrade() == -90) {
                setLocation(player.getXPlayer() + 60, player.getYPlayer() + 1);
                setXPlayer(player.getXPlayer() + 60);
                setYPlayer(player.getYPlayer() + 1);
                setGrade(-90);
                repaint();
            }

            if (player.getGrade() == 90) {
                setLocation(player.getXPlayer() + 32, player.getYPlayer() + 100);
                setXPlayer(player.getXPlayer() + 32);
                setYPlayer(player.getYPlayer() + 100);
                setGrade(90);
                repaint();
            }

            if (player.getGrade() == 0) {
                setLocation(player.getXPlayer() + 100, player.getYPlayer() + 65);
                setXPlayer(player.getXPlayer() + 100);
                setYPlayer(player.getYPlayer() + 65);
                setGrade(0);
                repaint();
            }
            if (player.getGrade() == -180) {
                setLocation(player.getXPlayer() - 10, player.getYPlayer() + 40);
                setXPlayer(player.getXPlayer() - 10);
                setYPlayer(player.getYPlayer() + 37);
                setGrade(-180);
                repaint();
            }

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
