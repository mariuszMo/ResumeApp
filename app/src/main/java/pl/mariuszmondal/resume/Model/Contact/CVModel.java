package pl.mariuszmondal.resume.Model.Contact;

import android.content.Context;
import android.view.View;

import java.util.ArrayList;

import pl.mariuszmondal.resume.R;

/**
 * Created by Mondi on 11.04.2017.
 */

public abstract class CVModel {
    private int iconId;
    private String infoField;
    private String textField;



    public CVModel(int iconId, String infoField, String textField) {
        this.iconId = iconId;
        this.infoField = infoField;
        this.textField = textField;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getInfoField() {
        return infoField;
    }

    public void setInfoField(String infoField) {
        this.infoField = infoField;
    }

    public String getTextField() {
        return textField;
    }

    public void setTextField(String textField) {
        this.textField = textField;
    }

    public abstract void performAction(Context context);

//    public static ArrayList<CVModel> defaultValuesArraylist(){
//
//
//        ArrayList<CVModel> defaultValuesArraylist=new ArrayList<CVModel>();
//
//        defaultValuesArraylist.add(new CVModel(R.drawable.contact_fragment_icon_name, " ", "Mariusz Mondal"));
//        defaultValuesArraylist.add(new CVModel(R.drawable.contact_fragment_icon_telephone, "Mobile: ", "793 20 11 99"));
//        defaultValuesArraylist.add(new CVModel(R.drawable.contact_fragment_icon_mail, "E-mail: ", "mariusz.mondal@gmail.com"));
//        defaultValuesArraylist.add(new CVModel(R.drawable.contact_fragment_icon_www, "Strona WWW: ", "www.mariuszmondal.pl"));
//
//        return  defaultValuesArraylist;
//    }


}
