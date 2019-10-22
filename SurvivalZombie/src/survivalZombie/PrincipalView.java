package survivalZombie;

import java.awt.event.KeyEvent;
import model.ImagesDB;
import java.awt.Font;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import jComponents.JPlayer;
import jComponents.JZombie;
import jComponents.HitListener;
import jComponents.JBullet;

/**
 * @author Jose Suresh Alejo
 * @author Alberto Ruíz
 */
public class PrincipalView extends javax.swing.JFrame implements KeyListener {

    private final ImagesDB image;
    private boolean isWPressed, isSPressed, isAPressed, isDPressed, isSpacePressed;
    private JPlayer player;
    private JZombie zombie;
    private final JLabel background;
    private JBullet bullet;
    private EditorView editor;

    public PrincipalView(EditorView editor, int skin, int vel) {
        initComponents();
        this.editor = editor;
        image = new ImagesDB();
        /**
         * Player
         */
        player = new JPlayer();
        player.setBounds(getWidth() / 3, getHeight() / 2, 120, 120);
        player.setPath(image.getImage(skin));
        player.setHealth(3);
        player.setVel(vel);
        //----------------------------------------------------------
        bullet = new JBullet();
        bullet.setPath(image.getImage(5));
        // ----------------------------------------------------------
        /**
         * UI Hearth -----------------------------------------------------------
         */
        ImageIcon hearth = new ImageIcon(image.getImage(4).toString());
        healthLabel = new JLabel("", hearth, JLabel.CENTER);
        healthLabel.setBounds(0, 0, 40, 40);
        add(healthLabel);
        healthLabel2 = new JLabel("", hearth, JLabel.CENTER);
        healthLabel2.setBounds(getWidth() / 42, 0, 40, 40);
        add(healthLabel2);
        heathLabel3 = new JLabel("", hearth, JLabel.CENTER);
        heathLabel3.setBounds(getWidth() / 21, 0, 40, 40);
        add(heathLabel3);
        /**
         * UI Pause , Game Over & Win
         */
        pauseText.setBounds(getWidth() / 2, getHeight() / 4, 250, 250);
        pauseText.setFont(new Font("Dialog", Font.BOLD, 36));
        gameOverText.setBounds(getWidth() / 3, getHeight() / 4, 250, 250);
        gameOverText.setFont(new Font("Dialog", Font.BOLD, 36));
        winText.setBounds(getWidth() / 3, getHeight() / 4, 250, 250);
        winText.setFont(new Font("Dialog", Font.BOLD, 36));
        // ----------------------------------------------------------
        /**
         * Background
         * -----------------------------------------------------------
         */
        ImageIcon backgrnd = new ImageIcon(image.getImage(3).toString());
        background = new JLabel("", backgrnd, JLabel.CENTER);
        background.setBounds(0, 0, getWidth(), getHeight());

        //------------------------------------------------------------
        player.setXPlayer(getWidth() / 3);
        player.setYPlayer(getHeight() / 2);
        player.setLimitXLeft(1);
        player.setLimitXRight(getWidth() - 80);
        player.setLimitYTop(1);
        player.setLimitYDown(getHeight() - 100);
        player.setOpaque(false);
        bullet.setOpaque(false);
        bullet.setSize(26, 17);
        addKeyListener(this);
        add(player);

        add(winText);
        add(gameOverText);
        add(pauseText);
        generateZombies(400);
        add(bullet);
        add(background);

        player.setIsPaused(false);
        zombie.setIsPaused(false);

        zombie.addHitListener(new HitListener() {
            @Override
            public void hit() {
                if (player.getHealth() > 1) {
                    player.setHealth(player.getHealth() - 1);
                    switch (player.getHealth()) {
                        case 2:
                            heathLabel3.setVisible(false);
                            break;
                        case 1:
                            healthLabel2.setVisible(false);
                            break;
                    }
                } else {
                    healthLabel.setVisible(false);
                    gameOverText.setText("GAME OVER!");
                    player.setIsPaused(true);
                    player.setGameOver(true);
                }
            }
        });

        bullet.addHitListener(new HitListener() {
            @Override
            public void hit() {
                if (zombie.getHealth() > 1) {
                    zombie.setHealth(zombie.getHealth() - 1);
                } else {
                    winText.setText("         WIN!");
                    getContentPane().remove(zombie);
                    zombie.removeHitListener(this);
                    repaint();
                }
            }
        });
    }
//Se solapan, existe el ultimo.

    private void generateZombies(int cambio) {
        zombie = new JZombie();
        zombie.setBounds(300, -100, 96, 89);
        zombie.setPath(image.getImage(2));
        zombie.setHealth(3);
        zombie.setXPlayer(300 + cambio);
        zombie.setYPlayer(-100);
        zombie.setOpaque(false);
        add(zombie);
    }

    private void pauseUI(boolean p) {
        if (!p) {
            pauseText.setText("PAUSE");
        } else {
            pauseText.setText("");
        }
    }

    @SuppressWarnings("/*unchecked*/")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        healthLabel = new javax.swing.JLabel();
        heathLabel3 = new javax.swing.JLabel();
        healthLabel2 = new javax.swing.JLabel();
        gameOverText = new javax.swing.JLabel();
        pauseText = new javax.swing.JLabel();
        winText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1083, 524));
        setResizable(false);

        healthLabel.setInheritsPopupMenu(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pauseText)
                .addGap(411, 411, 411))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(healthLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(heathLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(gameOverText))
                    .addComponent(healthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(winText)))
                .addContainerGap(583, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(healthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heathLabel3)
                    .addComponent(healthLabel2))
                .addGap(122, 122, 122)
                .addComponent(gameOverText)
                .addGap(106, 106, 106)
                .addComponent(pauseText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(winText)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gameOverText;
    private javax.swing.JLabel healthLabel;
    private javax.swing.JLabel healthLabel2;
    private javax.swing.JLabel heathLabel3;
    private javax.swing.JLabel pauseText;
    private javax.swing.JLabel winText;
    // End of variables declaration//GEN-END:variables

    public JPlayer getPlayer() {
        return player;
    }

    public JZombie getZombie() {
        return zombie;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        switch (ke.getKeyCode()) {
            case KeyEvent.VK_W:
                isWPressed = true;
                break;
            case KeyEvent.VK_S:
                isSPressed = true;
                break;
            case KeyEvent.VK_D:
                isDPressed = true;
                break;
            case KeyEvent.VK_A:
                isAPressed = true;
                break;
            case KeyEvent.VK_P:
                if (!player.isGameOver()) {
                    player.setIsPaused(!player.isIsPaused());
                    zombie.setIsPaused(!zombie.isIsPaused());
                    pauseUI(!player.isIsPaused());
                }
                break;
            case KeyEvent.VK_ESCAPE:
                player.setIsPaused(true);
                zombie.setIsPaused(true);
                int seleccion = JOptionPane.showOptionDialog(this, "Menu",
                        null, JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
                        new Object[]{"Resume", "Exit"}, "Exit");
                if (seleccion == 0 || JOptionPane.CLOSED_OPTION == -1) {
                    player.setIsPaused(false);
                    zombie.setIsPaused(false);
                }
                if (seleccion == 1) {
                    editor.setVisible(true);
                    setVisible(false);
                    player.setIsPaused(false);
                    zombie.setIsPaused(false);
                }
            case KeyEvent.VK_SPACE:
                isSpacePressed = true;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        switch (ke.getKeyCode()) {
            case KeyEvent.VK_W:
                isWPressed = false;
                break;
            case KeyEvent.VK_S:
                isSPressed = false;
                break;
            case KeyEvent.VK_D:
                isDPressed = false;
                break;
            case KeyEvent.VK_A:
                isAPressed = false;
                break;
            case KeyEvent.VK_SPACE:
                isSpacePressed = false;
                break;
        }
    }

    public boolean getIsWPressed() {
        return isWPressed;
    }

    public boolean getIsSPressed() {
        return isSPressed;
    }

    public boolean getIsAPressed() {
        return isAPressed;
    }

    public boolean getIsDPressed() {
        return isDPressed;
    }

    public JBullet getBullet() {
        return bullet;
    }

    public void setBullet(JBullet bullet) {
        this.bullet = bullet;
    }

    public boolean getIsSpacePressed() {
        return isSpacePressed;
    }

    public void setIsSpacePressed(boolean isSpacePressed) {
        this.isSpacePressed = isSpacePressed;
    }

}
