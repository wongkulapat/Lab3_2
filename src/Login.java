import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField txtUserlogin;
    private JPasswordField pwdUserPassword;
    private JButton btnSummit;
    private JButton btnClear;
    private JPanel mainPanel;

    public Login() {
        btnSummit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, txtUserlogin.getText()
                        + " " + new String(pwdUserPassword.getPassword()));
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUserlogin.setText("");
                pwdUserPassword.setText("");

            }
        });
    }
    public JPanel getMainPanel() {
        return mainPanel;
    }
}
