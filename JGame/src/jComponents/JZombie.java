package jComponents;

/**
 *
 * @author Jose Suresh
 * @author Alberto Ruíz
 */
public class JZombie extends JPlayer {

    private HitListener choqueListener;

    public JZombie() {
        super();
    }

    public int posXZombie(JZombie zombie, JPlayer player) {
        return zombie.getXPlayer() - player.getXPlayer();
    }

    public int posYZombie(JZombie zombie, JPlayer player) {
        return zombie.getYPlayer() - player.getYPlayer();
    }

    public void move(JZombie zombie, JPlayer player) throws InterruptedException {
        int posXZombie;
        int posYZombie;
        int zombieHealth;

        while (!isIsPaused()) {
            posXZombie = posXZombie(zombie, player);
            posYZombie = posYZombie(zombie, player);
            zombieHealth = getHealth();

            if (Math.abs(posXZombie) > 43 || Math.abs(posYZombie) > 43) {
                if (posXZombie > 0 && posYZombie > 0) {
                    zombie.setXPlayer(zombie.getXPlayer() - 1);
                    zombie.setYPlayer(zombie.getYPlayer() - 1);
                    zombie.setLocation(zombie.getXPlayer(), zombie.getYPlayer());
                    setGrade(-135);
                    repaint();
                }
                if (posXZombie > 0 && posYZombie < 0) {
                    zombie.setXPlayer(zombie.getXPlayer() - 1);
                    zombie.setYPlayer(zombie.getYPlayer() + 1);
                    zombie.setLocation(zombie.getXPlayer(), zombie.getYPlayer());
                    setGrade(135);
                    repaint();
                }
                if (posXZombie < 0 && posYZombie > 0) {
                    zombie.setXPlayer(zombie.getXPlayer() + 1);
                    zombie.setYPlayer(zombie.getYPlayer() - 1);
                    zombie.setLocation(zombie.getXPlayer(), zombie.getYPlayer());
                    setGrade(-45);
                    repaint();
                }
                if (posXZombie < 0 && posYZombie < 0) {
                    zombie.setXPlayer(zombie.getXPlayer() + 1);
                    zombie.setYPlayer(zombie.getYPlayer() + 1);
                    zombie.setLocation(zombie.getXPlayer(), zombie.getYPlayer());
                    setGrade(45);
                    repaint();
                }
                if (posXZombie == 0 && posYZombie > 0) {
                    zombie.setYPlayer(zombie.getYPlayer() - 1);
                    zombie.setLocation(zombie.getXPlayer(), zombie.getYPlayer());
                    setGrade(-90);
                    repaint();
                }
                if (posXZombie == 0 && posYZombie < 0) {
                    zombie.setYPlayer(zombie.getYPlayer() + 1);
                    zombie.setLocation(zombie.getXPlayer(), zombie.getYPlayer());
                    setGrade(90);
                    repaint();
                }
                if (posYZombie == 0 && posXZombie > 0) {
                    zombie.setXPlayer(zombie.getXPlayer() - 1);
                    zombie.setLocation(zombie.getXPlayer(), zombie.getYPlayer());
                    setGrade(180);
                    repaint();
                }
                if (posYZombie == 0 && posXZombie < 0) {
                    zombie.setXPlayer(zombie.getXPlayer() + 1);
                    zombie.setLocation(zombie.getXPlayer(), zombie.getYPlayer());
                    setGrade(0);
                    repaint();
                }
                Thread.sleep(zombieHealth * 6);
            } else {
                choqueListener.hit();
                Thread.sleep(600);
            }
        }
    }

    public void addHitListener(HitListener choqueListener) {
        this.choqueListener = choqueListener;
    }

    public void removeHitListener(HitListener choqueListener) {
        this.choqueListener = null;
    }
}
