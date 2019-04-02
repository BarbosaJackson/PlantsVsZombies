import javax.swing.*;
public final class SingletonBackground {
    private static ImageIcon BACKGROUND = null;
    public ImageIcon getInstance() {
        if(BACKGROUND == null) {
            BACKGROUND = new ImageIcon(this.getClass().getResource("images/mainBG.png"));
        }
        return BACKGROUND;
    }

}
