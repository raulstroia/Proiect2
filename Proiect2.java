import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Proiect2 {
    private JPanel rootPanel;
    private JLabel Nivelactivitate;
    private JRadioButton btnsed;
    private JRadioButton btnRedus;
    private JRadioButton btnModerat;
    private JRadioButton btnExtrem;
    private JRadioButton btnCrescut;
    private JLabel lblvarsta;
    private JTextField txtvarsta;
    private JLabel lblsex;
    private JRadioButton btnmasc;
    private JRadioButton btnfem;
    private JLabel lblinaltime;
    private JLabel lblcm;
    private JTextField txtcm;
    private JLabel lblani;
    private JLabel lblkg;
    private JLabel lblGreutate;
    private JTextField txtGreutate;
    private JButton btnCalc;
    private JLabel lblMentenanta;
    private JLabel lblRMB;
    private JLabel lblArdere;
    private JLabel lblMasa;
    private JLabel lblrezmen;
    private JLabel rezlblrmb;
    private JLabel rezlblardere;
    private JLabel rezlblmasa;
    private JLabel lblkcal1;
    private JLabel lblkcal2;
    private JLabel lblkcal3;
    private JLabel lblkcal4;
    private JLabel lbln;
    private JLabel lblp;
    private JTextField txtnume;
    private JTextField txtprenume;
    private JLabel lblnumeprenume;
    private JLabel lblnp;
    private JLabel lblDate;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Necesar caloric");
        frame.setContentPane(new Proiect2().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    class Client {
        public String nume;
        public String prenume;

        public Client (String nume, String prenume) {
            this.nume = nume;
            this.prenume = prenume;
        }
    }


    public Proiect2() {
               btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null,
                        "Sunteti siguri ca vreti sa faceti calculul?",
                        "Question",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    JOptionPane.showConfirmDialog(null,
                            "Calculul a fost efectuat!",
                            "Result",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);

                    String v = txtvarsta.getText();
                    String i = txtcm.getText();
                    String g = txtGreutate.getText();
                    ArrayList<String> date = new ArrayList<String>();
                    date.add(v);
                    date.add(i);
                    date.add(g);
                    float varsta = Float.parseFloat(date.get(0));
                    float inaltime = Float.parseFloat(date.get(1));
                    float greutate = Float.parseFloat(date.get(2));

                    String n = txtnume.getText();
                    String p = txtprenume.getText();
                    Client c1 = new Client(n, p);

                    StringBuffer sb = new StringBuffer();
                    sb.append(n).append(" ").append(p);
                    lblnumeprenume.setText(sb.toString());

                    final float cal = 250;
                    
                    if (btnfem.isSelected()) {
                        float RMB = (float) 10 * greutate + (float) 6.25 * inaltime - (float) 5 * varsta - (float) 161;
                        rezlblrmb.setText(Float.toString(RMB));

                        if(btnsed.isSelected()){
                            float mens = RMB * (float) 1.2;
                            lblrezmen.setText(Float.toString(mens));

                            float arderes = mens - cal;
                            rezlblardere.setText(Float.toString(arderes));

                            float masas = mens + cal;
                            rezlblmasa.setText(Float.toString(masas));
                        }

                        if(btnRedus.isSelected()){
                            float menr = RMB * (float) 1.375;
                            lblrezmen.setText(Float.toString(menr));

                            float arderer = menr - cal;
                            rezlblardere.setText(Float.toString(arderer));

                            float masar = menr + cal;
                            rezlblmasa.setText(Float.toString(masar));
                        }

                        if(btnModerat.isSelected()){
                            float menm = RMB * (float) 1.55;
                            lblrezmen.setText(Float.toString(menm));

                            float arderem = menm - cal;
                            rezlblardere.setText(Float.toString(arderem));

                            float masam = menm + cal;
                            rezlblmasa.setText(Float.toString(masam));
                        }

                        if(btnCrescut.isSelected()){
                            float menc = RMB * (float) 1.725;
                            lblrezmen.setText(Float.toString(menc));

                            float arderec = menc - cal;
                            rezlblardere.setText(Float.toString(arderec));

                            float masac = menc + cal;
                            rezlblmasa.setText(Float.toString(masac));
                        }

                        if(btnExtrem.isSelected()){
                            float mene = RMB * (float) 1.9;
                            lblrezmen.setText(Float.toString(mene));

                            float arderee = mene - cal;
                            rezlblardere.setText(Float.toString(arderee));

                            float masae = mene + cal;
                            rezlblmasa.setText(Float.toString(masae));
                        }
                    }

                    if (btnmasc.isSelected()) {
                        float RMB = (float) 10 * greutate + (float) 6.25 * inaltime - (float) 5 * varsta + (float) 5;
                        rezlblrmb.setText(Float.toString(RMB));

                        if(btnsed.isSelected()){
                            float mens = RMB * (float) 1.2;
                            lblrezmen.setText(Float.toString(mens));

                            float arderes = mens - cal;
                            rezlblardere.setText(Float.toString(arderes));

                            float masas = mens + cal;
                            rezlblmasa.setText(Float.toString(masas));

                        }

                        if(btnRedus.isSelected()){
                            float menr = RMB * (float) 1.375;
                            lblrezmen.setText(Float.toString(menr));

                            float arderer = menr - cal;
                            rezlblardere.setText(Float.toString(arderer));

                            float masar = menr + cal;
                            rezlblmasa.setText(Float.toString(masar));
                        }

                        if(btnModerat.isSelected()){
                            float menm = RMB * (float) 1.55;
                            lblrezmen.setText(Float.toString(menm));

                            float arderem = menm - cal;
                            rezlblardere.setText(Float.toString(arderem));

                            float masam = menm + cal;
                            rezlblmasa.setText(Float.toString(masam));
                        }

                        if(btnCrescut.isSelected()){
                            float menc = RMB * (float) 1.725;
                            lblrezmen.setText(Float.toString(menc));

                            float arderec = menc - cal;
                            rezlblardere.setText(Float.toString(arderec));

                            float masac = menc + cal;
                            rezlblmasa.setText(Float.toString(masac));
                        }

                        if(btnExtrem.isSelected()){
                            float mene = RMB * (float) 1.9;
                            lblrezmen.setText(Float.toString(mene));

                            float arderee = mene - cal;
                            rezlblardere.setText(Float.toString(arderee));

                            float masae = mene + cal;
                            rezlblmasa.setText(Float.toString(masae));
                        }
                    }
                }
            }
        });
    }
}

