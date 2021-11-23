import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Exit extends JFrame {
  /**
   * 
   */
  private static final long serialVersionUID = -4992296707658100584L;

  public Exit() {
    super("Mario Trivia Maze");
  }


  private void frame() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1000, 800);
    setLocationRelativeTo(null);
    setLayout( new GridBagLayout() );


    final JButton ExitButton = new JButton("Exit");
    ExitButton.setSize(95, 30);
    ExitButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent theEvent) {
        final JFrame ExitFrame = new JFrame("Exit");
        ExitFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ExitFrame.setSize(1000, 800);
        ExitFrame.setLocationRelativeTo(null);
        final JLabel ExitLabel = new JLabel("", SwingConstants.CENTER);
        ExitLabel.setText("Game Exit ");
        ExitFrame.add(ExitLabel);
        ExitFrame.setVisible(true);

      }
    });

    add(ExitButton, new GridBagConstraints());
    setVisible(true);


  }

  public static void main(String[] theArgs) {
    final Exit run = new Exit();
    run.frame();
  }
}