package ui;

import Modele.Candidat;
import Modele.RegistreCandidat;
import utils.CalculeurImc;
import utils.CandidatDejaPresentException;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiMedium extends JFrame {

    //------------------------------PanelParametre--------------
    private JLabel lblNom;
    private JTextField txtNom;

    private JLabel lblTaille;
    private JTextField txtTaille;

    private JLabel lblPoid;
    private JTextField txtPoid;
    //-------------------------panel resulat---------------------
    private JLabel lblIMC;
    private JTextField txtIMC;

    private JLabel lblRisque;
    private JLabel lblResultat;

    //----------------------------------panel Bouton----------------------------
    private JButton btnQuitter;
    private JButton btnEffacer;
    private JButton btnCalculer;
    //----------------------------------les panel -----------------------------

    private JPanel panNom;
    private JPanel panTaille;
    private JPanel panPoid;
    private JPanel panIMC;
    private JPanel panRisque;
    private JPanel panParametre;
    private JPanel PanParametreBordure;

    private JPanel panResulat;
    private JPanel panBouton;

    private JPanel panGlobale;

    public GuiMedium() {
        setWidget();
        setListeners();
    }

    private void setListeners() {
        btnQuitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        btnEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNom.setText("");
                txtPoid.setText("");
                txtTaille.setText("");
                txtIMC.setText("");
            }
        });

        btnCalculer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //calculer  l'imc

                Candidat candidat = null;

                    String nomCandidat = txtNom.getText();

                    double poidsCandidat = Double.parseDouble(txtPoid.getText());
                    double tailleCandidat = Double.parseDouble(txtTaille.getText());

                    candidat = new Candidat();
                    candidat.setNom(nomCandidat);
                    candidat.setPoids(poidsCandidat);
                    candidat.setTaille(tailleCandidat);


                    candidat.setImc1(CalculeurImc.calculerImc(candidat));

                    txtIMC.setText(String.valueOf(candidat.getImc1()));


                    lblResultat.setText(CalculeurImc.calculeRisque(candidat.getImc1()));

                    RegistreCandidat registre = new RegistreCandidat();
                try {
                    registre.ajouterCandidat(candidat);
                    System.out.println(candidat);


                } catch (CandidatDejaPresentException t) {
                    JOptionPane.showMessageDialog(null, "Erreur sur le candidat, en double ! \n" + candidat, "Erreur de saisie", JOptionPane.ERROR_MESSAGE);
                    txtNom.setText("");
                    txtTaille.setText("");
                    txtPoid.setText("");
                    txtIMC.setText("");
                    lblResultat.setText("");

                }


            }
        });





    }

    private void setWidget() {
        lblNom = new JLabel("Nom:                ");
        txtNom = new JTextField(10);

        lblTaille = new JLabel("Taille(en cm):");
        txtTaille = new JTextField(10);

        lblPoid = new JLabel("Poids(en kg): ");
        txtPoid = new JTextField(10);

        lblIMC = new JLabel("Indice de masse corporel:");
        txtIMC = new JTextField(10);
        lblRisque = new JLabel("Risque de développer des problèmes de santé : ");
        lblResultat = new JLabel();

        btnQuitter = new JButton("Quitter");
        btnEffacer = new JButton("Effacer");
        btnCalculer = new JButton("Calculer");

        //--------------------------------------les panels
        panNom = new JPanel();
        panTaille = new JPanel();
        panPoid = new JPanel();
        panParametre = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panParametre.setPreferredSize(new Dimension(360,150));
        PanParametreBordure = new JPanel();
//        PanParametreBordure.setPreferredSize(new Dimension(200,200));

        panIMC = new JPanel();
        panRisque = new JPanel();
        panResulat = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panBouton = new JPanel();
        panGlobale = new JPanel();



//-----------------------pan parametre-----------------------------------------
        panNom.add(lblNom);
        panNom.add(txtNom);

        panTaille.add(lblTaille);
        panTaille.add(txtTaille);

        panPoid.add(lblPoid);
        panPoid.add(txtPoid);


        panParametre.add(panNom, BorderLayout.CENTER);
        panParametre.add(panTaille, BorderLayout.CENTER);
        panParametre.add(panPoid, BorderLayout.CENTER);
        panParametre.add(PanParametreBordure, BorderLayout.EAST);


        TitledBorder title;
        title = BorderFactory.createTitledBorder("Paramètre");
        panParametre.setBorder(title);

//        Border brd = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
//        panParametre.setBorder(brd);



//--------------------------pan resultat--------------------------------------
        panIMC.add(lblIMC);
        panIMC.add(txtIMC);

        panRisque.add(lblRisque);
        panRisque.add(lblResultat);

        panResulat.add(panIMC);
        panResulat.add(panRisque);

        TitledBorder title2;
        title2 = BorderFactory.createTitledBorder("Résultat");
        panResulat.setBorder(title2);

//        Border brd2 = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
//        panResulat.setBorder(brd2);

        panResulat.setPreferredSize(new Dimension(360,100));

//--------------------------pan bouton--------------------------------------

        panBouton.add(btnQuitter);
        panBouton.add(btnEffacer);
        panBouton.add(btnCalculer);

//--------------------------pan globale--------------------------------------
        panGlobale.add(panParametre, BorderLayout.NORTH);
        panGlobale.add(panResulat, BorderLayout.CENTER);
        panGlobale.add(panBouton, BorderLayout.SOUTH);


        this.setContentPane(panGlobale);






    }
}
