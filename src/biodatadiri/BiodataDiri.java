
//Marchella Sylvadenta Lastetria
//123180133

package biodatadiri;

import java.awt.BorderLayout;
import javax.swing.*;

class BiodataDiri {
   public static void main(String[] args) {
	Bio b = new Bio();
   }
}
class Bio extends JFrame {
    
   JLabel ljudul = new JLabel ("BIODATA DIRI");
   JLabel lnama = new JLabel("Marchella Sylvadenta Lastetria");
   JLabel ltglahir = new JLabel("Pekanbaru, 31 Maret 2002");
   JLabel gambar = new JLabel(new ImageIcon(getClass().getResource(("Chella.jpg"))));
   String[] namaAgama =
            {"Islam","Kristen","Katolik","Hindu","Budha"};
   JComboBox cmbAgama = new JComboBox(namaAgama);
   
   JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
   JRadioButton rbWanita = new JRadioButton(" Perempuan ");
   JLabel alamat = new JLabel ("Alamat");
   final JTextArea falamat = new JTextArea(20, 20);    
   JButton btnedit = new JButton ("Edit");
   JButton btnSave = new JButton("Save");

   public Bio() {
       setTitle("Biodata Diri");
	setDefaultCloseOperation(3);
	setSize(350,600);
        setLocation(500, 50);

	ButtonGroup group = new ButtonGroup();
	group.add(rbPria);
	group.add(rbWanita);

	setLayout(null);
        add(ljudul);
        add(gambar);
	add(lnama);
	add(ltglahir);
	add(rbPria);
	add(rbWanita);
	add(cmbAgama);
        add(alamat);
        add(falamat);
        add(btnedit);
	add(btnSave);

        ljudul.setBounds(125,15,120,20);
        gambar.setBounds(95,50,150,200);
	lnama.setBounds(80,270,200,20);
	ltglahir.setBounds(100,290,200,20);
        cmbAgama.setBounds(100,320,150,20);
	rbPria.setBounds(50,345,100,20);
	rbWanita.setBounds(170,345,100,20);
        alamat.setBounds(150,375,120,20);
        falamat.setBounds(45,400,250,75);
        btnedit.setBounds(40,480,120,20);
	btnSave.setBounds(180,480,120,20);
	setVisible(true);
   }
}