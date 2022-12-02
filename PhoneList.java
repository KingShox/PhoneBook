package PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneList {
    private List<Person> phoneList = new ArrayList<>();

    public PhoneList() {
    }

    public PhoneList(List<Person> phoneList) {
        this.phoneList = phoneList;
    }

    public List<Person> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Person> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public String toString() {
        return "PhoneList [phoneList=" + phoneList + "]";
    }
    

    
}
