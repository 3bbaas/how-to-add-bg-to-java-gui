## How to add background to java GUI?

### Video
[click here](https://drive.google.com/file/d/1GOyhSk4XijDkR_fddyjMUHSkddCIlILq/view?usp=sharing)

- image we used it
![](36600.jpg)

- Code i wrote it - file of code [here](Code.java)
```java

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
``` 