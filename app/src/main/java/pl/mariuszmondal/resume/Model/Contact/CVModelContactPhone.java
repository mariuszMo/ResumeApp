package pl.mariuszmondal.resume.Model.Contact;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import pl.mariuszmondal.resume.Model.Contact.CVModel;
import pl.mariuszmondal.resume.R;


/**
 * Created by Mondi on 14.04.2017.
 */

public class CVModelContactPhone extends CVModel {


    private int phoneNr = 793201199;


    public CVModelContactPhone(int iconId, String infoField, String textField, int phoneNr) {

        super(iconId, infoField, textField);
        this.phoneNr=phoneNr;
    }

    @Override
    public void performAction(Context context) {

        Uri callNr = Uri.parse("tel:"+phoneNr);
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(callNr);
        context.startActivity(intent);
    }


}
