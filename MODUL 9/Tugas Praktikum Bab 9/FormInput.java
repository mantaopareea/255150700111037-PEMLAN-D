import javax.swing.*;
import java.awt.event.*;

public class FormInput extends JFrame implements ActionListener {

    JTextField nama, ttl, noDaftar, telp, email;
    JTextArea alamat;
    JButton submit;

    public FormInput() {
        setTitle("Form Daftar Ulang Mahasiswa");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Nama Lengkap")).setBounds(20, 20, 120, 20);
        nama = new JTextField();
        add(nama).setBounds(150, 20, 200, 20);

        add(new JLabel("Tanggal Lahir")).setBounds(20, 50, 120, 20);
        ttl = new JTextField();
        add(ttl).setBounds(150, 50, 200, 20);

        add(new JLabel("Nomor Pendaftaran")).setBounds(20, 80, 150, 20);
        noDaftar = new JTextField();
        add(noDaftar).setBounds(150, 80, 200, 20);

        add(new JLabel("No. Telp")).setBounds(20, 110, 120, 20);
        telp = new JTextField();
        add(telp).setBounds(150, 110, 200, 20);

        add(new JLabel("Alamat")).setBounds(20, 140, 120, 20);
        alamat = new JTextArea();
        add(alamat).setBounds(150, 140, 200, 60);

        add(new JLabel("E-mail")).setBounds(20, 210, 120, 20);
        email = new JTextField();
        add(email).setBounds(150, 210, 200, 20);

        submit = new JButton("Submit");
        add(submit).setBounds(150, 250, 100, 30);
        submit.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        // VALIDASI
        if (nama.getText().isEmpty() || ttl.getText().isEmpty() ||
            noDaftar.getText().isEmpty() || telp.getText().isEmpty() ||
            alamat.getText().isEmpty() || email.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!");
            return;
        }

        // KONFIRMASI
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Apakah data sudah benar?",
                "Konfirmasi",
                JOptionPane.OK_CANCEL_OPTION
        );

        if (confirm == JOptionPane.OK_OPTION) {
            new FormOutput(
                nama.getText(),
                ttl.getText(),
                noDaftar.getText(),
                telp.getText(),
                alamat.getText(),
                email.getText()
            );
        }
    }

    public static void main(String[] args) {
        new FormInput();
    }
}