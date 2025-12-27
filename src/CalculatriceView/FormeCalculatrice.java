/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CalculatriceView;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author Ould_Hamdi
 */
public class FormeCalculatrice extends javax.swing.JFrame {

    /**
     * Creates new form FormeCalculatrice
     */
    public FormeCalculatrice() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoMalick = new javax.swing.JLabel();
        affichage = new javax.swing.JTextField();
        btnPar = new javax.swing.JButton();
        btnCarre = new javax.swing.JButton();
        btnRacineCarre = new javax.swing.JButton();
        btnLn = new javax.swing.JButton();
        btnArcTan = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnAns = new javax.swing.JButton();
        btnArcCos = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnArcSin = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnPi = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnRacineCubique = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnEgal = new javax.swing.JButton();
        btnMoins = new javax.swing.JButton();
        btnFois = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnPuissance = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFactorielle = new javax.swing.JButton();
        btnVirgule = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        modeSombre = new javax.swing.JToggleButton();
        btnRad = new javax.swing.JRadioButton();
        btnDeg = new javax.swing.JRadioButton();
        affichageHeure = new javax.swing.JLabel();
        affichageMinute = new javax.swing.JLabel();
        affichageSecondes = new javax.swing.JLabel();
        btnShift = new javax.swing.JToggleButton();
        btnExposant = new javax.swing.JButton();
        historiqueCalcule = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculatrice Scientifique");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        logoMalick.setBackground(new java.awt.Color(0, 0, 0));
        logoMalick.setFont(new java.awt.Font("Calibri", 3, 10)); // NOI18N
        logoMalick.setForeground(new java.awt.Color(255, 255, 255));
        logoMalick.setText("Iteem-fx-2506");
        logoMalick.setToolTipText("LogoMalick");
        logoMalick.setBorder(new javax.swing.border.MatteBorder(null));

        affichage.setBackground(new java.awt.Color(51, 51, 0));
        affichage.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        affichage.setForeground(new java.awt.Color(153, 153, 153));
        affichage.setCaretColor(new java.awt.Color(255, 255, 102));
        affichage.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnPar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPar.setText("( )");
        btnPar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParActionPerformed(evt);
            }
        });

        btnCarre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCarre.setText("x²");
        btnCarre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnCarre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarreActionPerformed(evt);
            }
        });

        btnRacineCarre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnRacineCarre.setText("√");
        btnRacineCarre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnRacineCarre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireFonctionSurAffichage(evt);
            }
        });

        btnLn.setBackground(new java.awt.Color(204, 204, 255));
        btnLn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLn.setText("Ln");
        btnLn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnLn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireFonctionSurAffichage(evt);
            }
        });

        btnArcTan.setBackground(new java.awt.Color(255, 51, 255));
        btnArcTan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnArcTan.setText("atan");
        btnArcTan.setToolTipText("");
        btnArcTan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnArcTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireFonctionSurAffichage(evt);
            }
        });

        btnCos.setBackground(new java.awt.Color(153, 0, 153));
        btnCos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCos.setText("cos");
        btnCos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireFonctionSurAffichage(evt);
            }
        });

        btnTan.setBackground(new java.awt.Color(153, 0, 153));
        btnTan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnTan.setText("tan");
        btnTan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireFonctionSurAffichage(evt);
            }
        });

        btnAns.setBackground(new java.awt.Color(143, 245, 196));
        btnAns.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAns.setText("Ans");
        btnAns.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));

        btnArcCos.setBackground(new java.awt.Color(255, 51, 255));
        btnArcCos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnArcCos.setText("acos");
        btnArcCos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnArcCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireFonctionSurAffichage(evt);
            }
        });

        btnE.setBackground(new java.awt.Color(255, 255, 0));
        btnE.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        btnE.setText("e");
        btnE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btnArcSin.setBackground(new java.awt.Color(255, 51, 255));
        btnArcSin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnArcSin.setText("asin");
        btnArcSin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnArcSin.setMargin(new java.awt.Insets(2, 0, 3, 14));
        btnArcSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireFonctionSurAffichage(evt);
            }
        });

        btnSin.setBackground(new java.awt.Color(153, 0, 153));
        btnSin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSin.setText("sin");
        btnSin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireFonctionSurAffichage(evt);
            }
        });

        btnPi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPi.setText("π");
        btnPi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btnLog.setBackground(new java.awt.Color(204, 204, 255));
        btnLog.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLog.setText("log");
        btnLog.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireFonctionSurAffichage(evt);
            }
        });

        btnRacineCubique.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRacineCubique.setText("³√");
        btnRacineCubique.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnRacineCubique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireFonctionSurAffichage(evt);
            }
        });

        btnPlus.setBackground(new java.awt.Color(0, 0, 255));
        btnPlus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPlus.setText("+");
        btnPlus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btnEgal.setBackground(new java.awt.Color(102, 255, 0));
        btnEgal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEgal.setText("=");
        btnEgal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));

        btnMoins.setBackground(new java.awt.Color(0, 0, 255));
        btnMoins.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMoins.setText("-");
        btnMoins.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnMoins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btnFois.setBackground(new java.awt.Color(0, 0, 255));
        btnFois.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnFois.setText("*");
        btnFois.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnFois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btnDiv.setBackground(new java.awt.Color(0, 0, 255));
        btnDiv.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDiv.setText("/");
        btnDiv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btnPuissance.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPuissance.setText("x^y");
        btnPuissance.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnPuissance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuissanceActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 0, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClear.setText("C");
        btnClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnFactorielle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnFactorielle.setText("x!");
        btnFactorielle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnFactorielle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorielleActionPerformed(evt);
            }
        });

        btnVirgule.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVirgule.setText(".");
        btnVirgule.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnVirgule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(102, 255, 255));
        btn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn2.setText("2");
        btn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(102, 255, 255));
        btn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn6.setText("6");
        btn6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(102, 255, 255));
        btn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn5.setText("5");
        btn5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(102, 255, 255));
        btn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn9.setText("9");
        btn9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(102, 255, 255));
        btn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn1.setText("1");
        btn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(102, 255, 255));
        btn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn4.setText("4");
        btn4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(102, 255, 255));
        btn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn8.setText("8");
        btn8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(102, 255, 255));
        btn0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn0.setText("0");
        btn0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(102, 255, 255));
        btn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn7.setText("7");
        btn7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(102, 255, 255));
        btn3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn3.setText("3");
        btn3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        modeSombre.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        modeSombre.setText("Mode Sombre");
        modeSombre.setMargin(new java.awt.Insets(2, 0, 3, 14));

        btnRad.setBackground(new java.awt.Color(0, 0, 0));
        btnRad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRad.setForeground(new java.awt.Color(0, 255, 255));
        btnRad.setText("Rad");

        btnDeg.setBackground(new java.awt.Color(0, 0, 0));
        btnDeg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeg.setForeground(new java.awt.Color(0, 255, 255));
        btnDeg.setSelected(true);
        btnDeg.setText("Deg");

        affichageHeure.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        affichageHeure.setForeground(new java.awt.Color(255, 255, 255));
        affichageHeure.setText("HH:");

        affichageMinute.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        affichageMinute.setForeground(new java.awt.Color(255, 255, 255));
        affichageMinute.setText("MM:");
        affichageMinute.setToolTipText("");

        affichageSecondes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        affichageSecondes.setForeground(new java.awt.Color(255, 255, 255));
        affichageSecondes.setText("SS");

        btnShift.setText("Shift");
        btnShift.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnShift.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnShift.setIconTextGap(2);
        btnShift.setMargin(new java.awt.Insets(2, 5, 3, 14));

        btnExposant.setBackground(new java.awt.Color(255, 0, 255));
        btnExposant.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExposant.setText("E");
        btnExposant.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(160, 154, 154), null, null));
        btnExposant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireSurAffichage(evt);
            }
        });

        historiqueCalcule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "ViderHistorique" }));
        historiqueCalcule.setToolTipText("Historique");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(affichage, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVirgule, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnDeg)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAns, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnExposant, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnRad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(affichageHeure, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(affichageMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(affichageSecondes, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(197, 197, 197))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFactorielle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnArcSin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnArcCos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnArcTan, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRacineCarre, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnRacineCubique, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPuissance, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnMoins, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnPar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFois, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEgal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCarre, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnShift)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(historiqueCalcule, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modeSombre, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logoMalick, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnShift)
                        .addComponent(historiqueCalcule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(modeSombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logoMalick, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(affichage, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEgal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFois, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMoins, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPuissance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRacineCubique, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArcSin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArcTan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArcCos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFactorielle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRacineCarre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAns, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVirgule, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExposant, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRad)
                    .addComponent(btnDeg)
                    .addComponent(affichageHeure)
                    .addComponent(affichageMinute)
                    .addComponent(affichageSecondes))
                .addGap(107, 107, 107))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ecrireSurAffichage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecrireSurAffichage
        int positionCurseur=getAffichage().getCaretPosition();
            String contenuAffichage=getAffichage().getText();
            //Enlever les espace comme ( ) sera ()
            String textBoutton=((JButton)evt.getSource()).getText().replace(" ", "");
            String textBouttonInserer=contenuAffichage.substring(0,positionCurseur)+textBoutton+contenuAffichage.substring(positionCurseur,contenuAffichage.length());
            getAffichage().setText(textBouttonInserer);
            getAffichage().requestFocus();
            getAffichage().setCaretPosition(positionCurseur+textBoutton.length());
    }//GEN-LAST:event_ecrireSurAffichage

    private void ecrireFonctionSurAffichage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecrireFonctionSurAffichage
        ecrireSurAffichage(evt);
        getBtnPar().doClick();
    }//GEN-LAST:event_ecrireFonctionSurAffichage

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        getAffichage().setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParActionPerformed
        ecrireSurAffichage(evt);
        getAffichage().requestFocus();
        getAffichage().setCaretPosition(getAffichage().getCaretPosition()-1);
    }//GEN-LAST:event_btnParActionPerformed

    private void btnCarreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarreActionPerformed
        ecrireSurAffichage("^(2)");
    }//GEN-LAST:event_btnCarreActionPerformed

    private void btnPuissanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuissanceActionPerformed
        ecrireSurAffichage("^()");
    }//GEN-LAST:event_btnPuissanceActionPerformed

    private void btnFactorielleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorielleActionPerformed
        ecrireSurAffichage("!");
    }//GEN-LAST:event_btnFactorielleActionPerformed
    public void ecrireSurAffichage(String text) {                                    
            int positionCurseur=getAffichage().getCaretPosition();
            String contenuAffichage=getAffichage().getText();
            String textBouttonInserer=contenuAffichage.substring(0,positionCurseur)+text+contenuAffichage.substring(positionCurseur,contenuAffichage.length());
            getAffichage().setText(textBouttonInserer);
            getAffichage().requestFocus();
            getAffichage().setCaretPosition(getAffichage().getCaretPosition()-1);
    }   
    public JRadioButton getBtnDeg() {
        return btnDeg;
    }

    public void setBtnDeg(JRadioButton btnDeg) {
        this.btnDeg = btnDeg;
    }

   
    public JRadioButton getBtnRad() {
        return btnRad;
    }

    public void setBtnRad(JRadioButton btnRad) {
        this.btnRad = btnRad;
    }

    public JLabel getAffichageHeure() {
        return affichageHeure;
    }

    public void setAffichageHeure(JLabel affichageHeure) {
        this.affichageHeure = affichageHeure;
    }

    public JLabel getAffichageMinute() {
        return affichageMinute;
    }

    public JToggleButton getBtnShift() {
        return btnShift;
    }

    public void setBtnShift(JToggleButton btnShift) {
        this.btnShift = btnShift;
    }

    public void setAffichageMinute(JLabel affichageMinute) {
        this.affichageMinute = affichageMinute;
    }

    public JLabel getAffichageSecondes() {
        return affichageSecondes;
    }

    public void setAffichageSecondes(JLabel affichageSecondes) {
        this.affichageSecondes = affichageSecondes;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField affichage;
    private javax.swing.JLabel affichageHeure;
    private javax.swing.JLabel affichageMinute;
    private javax.swing.JLabel affichageSecondes;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAns;
    private javax.swing.JButton btnArcCos;
    private javax.swing.JButton btnArcSin;
    private javax.swing.JButton btnArcTan;
    private javax.swing.JButton btnCarre;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCos;
    private javax.swing.JRadioButton btnDeg;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEgal;
    private javax.swing.JButton btnExposant;
    private javax.swing.JButton btnFactorielle;
    private javax.swing.JButton btnFois;
    private javax.swing.JButton btnLn;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMoins;
    private javax.swing.JButton btnPar;
    private javax.swing.JButton btnPi;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPuissance;
    private javax.swing.JButton btnRacineCarre;
    private javax.swing.JButton btnRacineCubique;
    private javax.swing.JRadioButton btnRad;
    private javax.swing.JToggleButton btnShift;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnTan;
    private javax.swing.JButton btnVirgule;
    private javax.swing.JComboBox<String> historiqueCalcule;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoMalick;
    private javax.swing.JToggleButton modeSombre;
    // End of variables declaration//GEN-END:variables
    
    public JTextField getAffichage() {
        return affichage;
    }

    public void setAffichage(JTextField affichage) {
        this.affichage = affichage;
    }
    public JButton getBtnAns() {
        return btnAns;
    }

    public void setBtnAns(JButton btnAns) {
        this.btnAns = btnAns;
    }

    public JButton getBtnArcCos() {
        return btnArcCos;
    }

    public void setBtnArcCos(JButton btnArcCos) {
        this.btnArcCos = btnArcCos;
    }

    public JButton getBtnArcSin() {
        return btnArcSin;
    }

    public void setBtnArcSin(JButton btnArcSin) {
        this.btnArcSin = btnArcSin;
    }

    public JButton getBtnArcTan() {
        return btnArcTan;
    }

    public void setBtnArcTan(JButton btnArcTan) {
        this.btnArcTan = btnArcTan;
    }
    public JButton getBtnCos() {
        return btnCos;
    }

    public void setBtnCos(JButton btnCos) {
        this.btnCos = btnCos;
    }
    public JButton getBtnEgal() {
        return btnEgal;
    }

    public void setBtnEgal(JButton btnEgal) {
        this.btnEgal = btnEgal;
    }
    public JButton getBtnPar() {
        return btnPar;
    }

    public void setBtnPar(JButton btnPar) {
        this.btnPar = btnPar;
    }
    public JButton getBtnSin() {
        return btnSin;
    }

    public void setBtnSin(JButton btnSin) {
        this.btnSin = btnSin;
    }

    public JButton getBtnTan() {
        return btnTan;
    }

    public void setBtnTan(JButton btnTan) {
        this.btnTan = btnTan;
    }
    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JLabel getLogoMalick() {
        return logoMalick;
    }

    public void setLogoMalick(JLabel logoMalick) {
        this.logoMalick = logoMalick;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JToggleButton getModeSombre() {
        return modeSombre;
    }

    public void setModeSombre(JToggleButton modeSombre) {
        this.modeSombre = modeSombre;
    }
    public JComboBox<String> getHistoriqueCalcule() {
        return historiqueCalcule;
    }

    public void setHistoriqueCalcule(JComboBox<String> historiqueCalcule) {
        this.historiqueCalcule = historiqueCalcule;
    }

    
}
