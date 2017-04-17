package pl.mariuszmondal.resume.Model.Contact;

import java.util.ArrayList;

import pl.mariuszmondal.resume.R;

/**
 * Created by Mondi on 14.04.2017.
 */

public class CVModelRepository {


        public static ArrayList<CVModel> defaultValuesArraylist(){


        ArrayList<CVModel> defaultValuesArraylist=new ArrayList<CVModel>();

//        defaultValuesArraylist.add(new CVModel(R.drawable.contact_fragment_icon_name, " ", "Mariusz Mondal"));
        defaultValuesArraylist.add(new CVModelContactPhone(R.drawable.contact_fragment_icon_telephone, "Mobile: ", "793 20 11 99",793201199));
//        defaultValuesArraylist.add(new CVModel(R.drawable.contact_fragment_icon_mail, "E-mail: ", "mariusz.mondal@gmail.com"));
//        defaultValuesArraylist.add(new CVModel(R.drawable.contact_fragment_icon_www, "Strona WWW: ", "www.mariuszmondal.pl"));

        return  defaultValuesArraylist;
    }

}
