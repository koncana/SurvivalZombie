package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import jComponents.JBullet;
import survivalZombie.PrincipalView;
import jComponents.JZombie;
import jComponents.JPlayer;

/**
 * @author Jose Suresh Alejo
 * @author Alberto Ruíz
 */
public class Process extends Thread {

    private final JZombie zombie;
    private final JPlayer player;
    private final JBullet bullet;
    private final PrincipalView principal;

    public Process(String text, PrincipalView principal) {
        super(text);
        this.principal = principal;
        player = principal.getPlayer();
        zombie = principal.getZombie();
        bullet = principal.getBullet();
    }

    @Override
    public void run() {
        if (this.getName().equals("playerMove")) {
            while (true) {
                player.movePlayer(principal.getIsWPressed(), principal.getIsDPressed(),
                        principal.getIsAPressed(), principal.getIsSPressed());
            }
        }

        if (this.getName().equals("Zombie")) {
            try {
                while (true) {
                    zombie.move(zombie, player);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        if (this.getName().equals("Bullet")) {
            try {
                while (true) {
                    if (principal.getIsSpacePressed()) {
                        bullet.setBullet(player);
                        bullet.setVisible(true);
                        bullet.shoot(zombie, player);
                    }
                    bullet.setVisible(false);
                    Thread.sleep(50);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Process.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
