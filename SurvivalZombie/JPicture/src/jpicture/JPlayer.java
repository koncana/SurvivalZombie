package jpicture;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Jose Suresh
 * @author Alberto Ruíz
 */
public class JPlayer extends JPanel implements Serializable {

    private File path;
    private int x;
    private int y;
    private int health;
    private int limitXLeft;
    private int limitXRight;
    private int limitYTop;
    private int limitYDown;
    private int grade;
    private boolean gameOver;

    public JPlayer() {
    }

    public JPlayer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (path != null && path.exists()) {
            ImageIcon imageIcon = new ImageIcon(path.getAbsolutePath());
            Graphics2D g2d = (Graphics2D) g;
            AffineTransform origXform = g2d.getTransform();
            AffineTransform newXform = (AffineTransform) (origXform.clone());
            int xRot = getWidth() / 2;
            int yRot = getHeight() / 2;
            newXform.rotate(Math.toRadians(grade), xRot, yRot);
            g2d.setTransform(newXform);
            int x = (getWidth() - imageIcon.getIconHeight()) / 2;
            int y = (getHeight() - imageIcon.getIconHeight()) / 2;
            g2d.drawImage(imageIcon.getImage(), x, y, this);
            g2d.setTransform(origXform);
        }
    }

    public void movePlayer(boolean isWPressed, boolean isDPressed, boolean isAPressed, boolean isSPressed) {
        if (!isGameOver()) {
            if (limitXLeft > getXPlayer()) {
                isAPressed = false;
            }

            if (limitXRight < getXPlayer()) {
                isDPressed = false;
            }

            if (limitYTop > getYPlayer()) {
                isWPressed = false;
            }

            if (limitYDown < getYPlayer()) {
                isSPressed = false;
            }
            try {
                if (isWPressed && isDPressed) {
                    setYPlayer(getYPlayer() - 1);
                    setXPlayer(getXPlayer() + 1);
                    setLocation(getXPlayer(), getYPlayer());
                    grade = -45;
                    repaint();
                    Thread.sleep(10);
                } else {
                    if (isWPressed && isAPressed) {
                        setYPlayer(getYPlayer() - 1);
                        setXPlayer(getXPlayer() - 1);
                        setLocation(getXPlayer(), getYPlayer());
                        setGrade(-135);
                        repaint();
                        Thread.sleep(10);
                    } else {
                        if (isSPressed && isAPressed) {
                            setYPlayer(getYPlayer() + 1);
                            setXPlayer(getXPlayer() - 1);
                            setLocation(getXPlayer(), getYPlayer());
                            setGrade(135);
                            repaint();
                            Thread.sleep(10);
                        } else {
                            if (isSPressed && isDPressed) {
                                setYPlayer(getYPlayer() + 1);
                                setXPlayer(getXPlayer() + 1);
                                setLocation(getXPlayer(), getYPlayer());
                                setGrade(45);
                                repaint();
                                Thread.sleep(10);
                            } else {
                                if (isWPressed) {
                                    setYPlayer(getYPlayer() - 1);
                                    setLocation(getXPlayer(), getYPlayer());
                                    setGrade(-90);
                                    repaint();
                                    Thread.sleep(10);
                                }

                                if (isSPressed) {
                                    setYPlayer(getYPlayer() + 1);
                                    setLocation(getXPlayer(), getYPlayer());
                                    setGrade(90);
                                    repaint();
                                    Thread.sleep(10);
                                }

                                if (isDPressed) {
                                    setXPlayer(getXPlayer() + 1);
                                    setLocation(getXPlayer(), getYPlayer());
                                    setGrade(0);
                                    repaint();
                                    Thread.sleep(10);
                                }
                                if (isAPressed) {
                                    setXPlayer(getXPlayer() - 1);
                                    setLocation(getXPlayer(), getYPlayer());
                                    setGrade(-180);
                                    repaint();
                                    Thread.sleep(10);
                                }
                            }
                        }
                    }
                }
            } catch (InterruptedException exc) {
            }
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLimitXLeft() {
        return limitXLeft;
    }

    public int getLimitXRight() {
        return limitXRight;
    }

    public int getLimitYTop() {
        return limitYTop;
    }

    public int getLimitYDown() {
        return limitYDown;
    }

    public void setLimitXLeft(int limitXLeft) {
        this.limitXLeft = limitXLeft;
    }

    public void setLimitXRight(int limitXRight) {
        this.limitXRight = limitXRight;
    }

    public void setLimitYTop(int limitYTop) {
        this.limitYTop = limitYTop;
    }

    public void setLimitYDown(int limitYDown) {
        this.limitYDown = limitYDown;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getXPlayer() {
        return x;
    }

    public int getYPlayer() {
        return y;
    }

    public void setXPlayer(int x) {
        this.x = x;
    }

    public void setYPlayer(int y) {
        this.y = y;
    }

    public File getPath() {
        return path;
    }

    public void setPath(File path) {
        this.path = path;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
