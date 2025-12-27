package CalculatriceModel;

import CalculatriceController.LogiqueCalculatrice;
import CalculatriceView.FormeCalculatrice;
import calculatrice.scientifique.CalculatriceHistorique;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.Timer;

/**
 * @author Ould_Hamdi
 */
public class ModelCalculatrice {
    private final FormeCalculatrice view;
    private final LogiqueCalculatrice controller;
    private CalculatriceHistorique historique;
    private ArrayList<String> histtoriquePrecedent;
    private double ans;
    private boolean modeShiftActiver=false;
    private boolean modeNuitActiver;
    public ModelCalculatrice(FormeCalculatrice view,LogiqueCalculatrice controller,double ans){
        
        this.view=view;
        this.controller=controller;
        this.ans=ans;
        modeNuitActiver=(view.getjPanel1().getBackground()==Color.black);
        initialiserBoutton();
    }
    public void demarrer(){
        historique=new CalculatriceHistorique();
        histtoriquePrecedent=historique.chargerHistorique();
        for(String expression:histtoriquePrecedent){
            view.getHistoriqueCalcule().addItem(expression);
        }
        view.getModeSombre().doClick();
        Timer montreTemps=new Timer(1000,e->{
            Date temps=new Date();//laisser ici svp
            montreTemps(temps, "0", "0", "0");
        });
        montreTemps.start();
        view.setVisible(true);
    }
    private void montreTemps(Date temps,String heure,String minute,String seconde){
            heure+=temps.getHours()+":";
            minute+=temps.getMinutes()+":";
            seconde+=temps.getSeconds();
            if(heure.length()>3)heure=heure.substring(1);
            if(minute.length()>3)minute=minute.substring(1);
            if(seconde.length()>2)seconde=seconde.substring(1);
            view.getAffichageHeure().setText(heure);
            view.getAffichageMinute().setText(minute);
            view.getAffichageSecondes().setText(seconde);
    }
    private void initialiserBoutton(){
        view.getBtnAns().addActionListener((e) -> {
            view.ecrireSurAffichage(ans+"");
        });
        view.getBtnShift().addActionListener((e) -> {
            if(modeShiftActiver){
                shift();
            }else{
                deShift();
            }
            modeShiftActiver=!modeShiftActiver;
        });
        view.getBtnDeg().addActionListener((e) -> {
            if(view.getBtnRad().isSelected())view.getBtnRad().doClick();
            controller.setUniteAngle("deg");
        });
        view.getBtnRad().addActionListener((e) -> {
            if(view.getBtnDeg().isSelected())view.getBtnDeg().doClick();
            controller.setUniteAngle("rad");
        });
        view.getBtnEgal().addActionListener((e) -> {
            egale();
        });
        view.getHistoriqueCalcule().addActionListener((e) -> {
            historique(e);
        });
        //Gerer le bouton du mode sombre
        view.getModeSombre().addActionListener((e) -> {
            modeSombre(e);
        });
        
    }
    //fonction s'occupant de la gestion d'historique de calcule 
    private void historique(ActionEvent e){
        String selection=(String)((JComboBox)e.getSource()).getSelectedItem();
            if(selection.equals("ViderHistorique")){
                ((JComboBox)e.getSource()).removeAllItems();
                ((JComboBox)e.getSource()).addItem("0");
                ((JComboBox)e.getSource()).addItem("ViderHistorique");
                historique.effacerHistorique();
                return;
            }
            
            view.getAffichage().setText(selection);
    }
    //fonction generale liant la logique de calcule a l;interface utilisateur
    private void egale(){
        if(view.getAffichage().getText().isEmpty())return ;
            String aCalculer=view.getAffichage().getText();
            view.getAffichage().setText(controller.calculer(aCalculer).replace("NaN", "Impossible"));
            try{
                ans=Double.parseDouble(view.getAffichage().getText());
                if(histtoriquePrecedent.contains(aCalculer) || aCalculer.equals("0"))return;
                histtoriquePrecedent.add(aCalculer);
                view.getHistoriqueCalcule().addItem(aCalculer);
                historique.insererExpression(aCalculer);
            }catch(NumberFormatException ex){
                
            }
    }
    //active/desactive le mode sombre de l'interface
    private void modeSombre(ActionEvent e){
        modeNuitActiver=!modeNuitActiver;
            ((JToggleButton)e.getSource()).setText(modeNuitActiver?"Mode Clair":"Mode Sombre");
            view.getjPanel1().setBackground(modeNuitActiver?Color.black:Color.white);
            view.getLogoMalick().setForeground(modeNuitActiver?Color.white:Color.black);
            view.getAffichageHeure().setForeground(modeNuitActiver?Color.white:Color.black);
            view.getAffichageMinute().setForeground(modeNuitActiver?Color.white:Color.black);
            view.getAffichageSecondes().setForeground(modeNuitActiver?Color.white:Color.black);
            view.getBtnDeg().setBackground(modeNuitActiver?Color.black:Color.white);
            view.getBtnRad().setBackground(modeNuitActiver?Color.black:Color.white);
    }
    //Fonctions shift pour plus de fonction
    private void deShift(){
        view.getBtnArcCos().setText("acosh");
        view.getBtnArcSin().setText("asinh");
        view.getBtnArcTan().setText("atanh");
        view.getBtnCos().setText("cosh");
        view.getBtnSin().setText("sinh");
        view.getBtnTan().setText("tanh");
    }
    private void shift(){
        view.getBtnArcCos().setText("acos");
        view.getBtnArcSin().setText("asin");
        view.getBtnArcTan().setText("atan");
        view.getBtnCos().setText("cos");
        view.getBtnSin().setText("sin");
        view.getBtnTan().setText("tan");
    }
}
