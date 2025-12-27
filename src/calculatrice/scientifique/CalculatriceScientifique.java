package calculatrice.scientifique;

import CalculatriceController.LogiqueCalculatrice;
import CalculatriceModel.ModelCalculatrice;
import CalculatriceView.FormeCalculatrice;
/**
 * @author Ould_Hamdi
 */
public class CalculatriceScientifique {

    public static void main(String[] args) {
        FormeCalculatrice view=new FormeCalculatrice();
        LogiqueCalculatrice controller=new LogiqueCalculatrice();
        ModelCalculatrice model=new ModelCalculatrice(view,controller,0);
        model.demarrer();
        
    }

}
