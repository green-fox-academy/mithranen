package DataStructures;

//# Telephone book
//
//    !We are going to represent our contacts in a map where the keys are going to be
//    strings and the values are going to be strings as well.
//
//    !- Create a map with the following key-value pairs.
//
//    | Name (key)          | Phone number (value) |
//    | :------------------ | :------------------- |
//    | William A. Lathan   | 405-709-1865         |
//    | John K. Miller      | 402-247-8568         |
//    | Hortensia E. Foster | 606-481-6467         |
//    | Amanda D. Newland   | 319-243-5613         |
//    | Brooke P. Askew     | 307-687-2982         |
//
//    !- Create an application which solves the following problems.
//    !- What is John K. Miller's phone number?
//    !- Whose phone number is 307-687-2982?
//    - Do we know Chris E. Myers' phone number?

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {

  public static void main(String[] args) {
    Map<String, String> contacts = new HashMap<>();
    contacts.put("William A. Lathan", "405-709-1865");
    contacts.put("John K. Miller", "402-247-8568");
    contacts.put("Hortensia E. Foster", "606-481-6467");
    contacts.put("Amanda D. Newland", "319-243-5613");
    contacts.put("Brooke P. Askew", "307-687-2982");

    System.out.println("John K. Miller's number: " + contacts.get("John K. Miller"));

    for (String key : contacts.keySet()) {
      if (contacts.get(key).equals("307-687-2982")) {
        System.out.println("307-687-2982 belongs to: " + key);
      }
    }

    System.out.println(
        "Mr. Chris E. Myers' number is in the phonebook: " + contacts
            .containsKey("Chris E. Myers"));
  }
}

