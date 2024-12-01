package Challenges.ArrayList;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){

        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        return true;
    }

    public boolean removeContact(Contact contact){
        return true;
    }


}
