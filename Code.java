import javax.swing.*;

public class Main extends JFrame {
    JFrame _3bbas = new JFrame();
    JLabel background;

    Main() {
        setSize(1080, 720);
        setLayout(null);
        setVisible(true);
        ImageIcon bg = new ImageIcon(
                "C:\\Users\\ASUS\\Desktop\\find that\\36600.jpg"
        );
        background = new JLabel("", bg, JLabel.CENTER);
        background.setSize(1080, 720);
        add(background);
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}





















