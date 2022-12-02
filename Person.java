package PhoneBook;

public class Person {
     private String id;
     private String firstName;
     private String lastname;
     private String phoneNum;
     private String streetName;
     private String cityName;
     private String stateName;
     private String zipCode;
     
     public Person() {
     }

     public Person(String id, String firstName, String lastname, String phoneNum, String streetName, String cityName,
               String stateName, String zipCode) {
          this.id = id;
          this.firstName = firstName;
          this.lastname = lastname;
          this.phoneNum = phoneNum;
          this.streetName = streetName;
          this.cityName = cityName;
          this.stateName = stateName;
          this.zipCode = zipCode;
     }

     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public String getLastname() {
          return lastname;
     }

     public void setLastname(String lastname) {
          this.lastname = lastname;
     }

     public String getPhoneNum() {
          return phoneNum;
     }

     public void setPhoneNum(String phoneNum) {
          this.phoneNum = phoneNum;
     }

     public String getStreetName() {
          return streetName;
     }

     public void setStreetName(String streetName) {
          this.streetName = streetName;
     }

     public String getCityName() {
          return cityName;
     }

     public void setCityName(String cityName) {
          this.cityName = cityName;
     }

     public String getStateName() {
          return stateName;
     }

     public void setStateName(String stateName) {
          this.stateName = stateName;
     }

     public String getZipCode() {
          return zipCode;
     }

     public void setZipCode(String zipCode) {
          this.zipCode = zipCode;
     }

     @Override
     public String toString() {
          return "Contact ID: " + id + ", Name: " + firstName + " " + lastname + ", Phone Number: "
                    + phoneNum + ", Addess: " + streetName + " " + cityName  + ",  " +stateName + " " + zipCode + "";
     }

}
