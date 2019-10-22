package Main;

import survivalzombie.PrincipalView;

/**
 *
 * @author Jose Suresh Alejo
 * @author Alberto Ruíz 
 */
public class Main {

    private static PrincipalView principal;

    public static void main(String[] args) {

        principal = new PrincipalView();
        principal.setVisible(true);

        Process p1 = new Process("playerMove", principal);
        p1.start();

        Process p2 = new Process("Zombie", principal);
        p2.start();
        
        Process p3 = new Process("Bullet", principal);
        p3.start();
    }
}
