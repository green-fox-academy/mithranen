package DataStructures;

import java.util.HashMap;
import java.util.Map;

/**
 # Map introduction 2

 !- Create a map where the keys are strings and the values
 are strings with the following initial values

 | Key               | Value                   |
 | :---------------- | :---------------------- |
 | 978-1-60309-452-8 | A Letter to Jo          |
 | 978-1-60309-459-7 | Lupus                   |
 | 978-1-60309-444-3 | Red Panda and Moon Bear |
 | 978-1-60309-461-0 | The Lab                 |

 !- Print all the key-value pairs in the following format
 ```text
 A Letter to Jo (ISBN: 978-1-60309-452-8)
 Lupus (ISBN: 978-1-60309-459-7)
 Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
 The Lab (ISBN: 978-1-60309-461-0)
 ```
 !- Remove the key-value pair with key 978-1-60309-444-3
 !- Remove the key-value pair with value The Lab
 !- Add the following key-value pairs to the map

 | Key               | Value                 |
 | :---------------- | :-------------------- |
 | 978-1-60309-450-4 | They Called Us Enemy  |
 | 978-1-60309-453-5 | Why Did We Trust Him? |

 !- Print whether there is an associated value with
 key 478-0-61159-424-8 or not
 - Print the value associated with key 978-1-60309-453-5
 */
public class MapIntroduction2 {

  public static void main(String[] args) {

    Map<String, String> myMap = new HashMap<>();
    myMap.put("978-1-60309-452-8", "A Letter to Jo");
    myMap.put("978-1-60309-459-7", "Lupus");
    myMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    myMap.put("978-1-60309-461-0", "The Lab");

//    for (String currentKey : myMap.keySet()){
//      for (String currentValue: myMap.values())
//        System.out.println(myMap.get(currentKey) + myMap.values());
//    }
    System.out.println(myMap);
    System.out.println(myMap.keySet());
    System.out.println(myMap.values());

    System.out.println("*******************************");

    for (String currentKey : myMap.keySet()) {
      String a = myMap.get(currentKey);
      String b = currentKey;
      System.out.println(a + " (ISBN: " + b + ")");
    }
    System.out.println("--------------------------------");
    //TODO törlöm, ellenőrzöm, és mégis benne van... miért???
    myMap.remove("978-1-60309-444-3");
    System.out.println(myMap.containsKey("978-1-60309-444-3"));
    System.out.println(myMap);

    System.out.println("**********************************");
    //myMap.remove(myMap.get("978-1-60309-461-0"));     //TODO remove key-nek értelmezi az értéket, így nem lehet törölni érték alapján!!!!
    //System.out.println(myMap.containsValue("The Lab"));
    //System.out.println(myMap.containsKey("978-1-60309-461-0"));
    //System.out.println(myMap);

    for (String key : myMap.keySet()) {
      if (myMap.get(key).equals("The Lab")) {
        myMap.remove(key);
      }
    }
    System.out.println(myMap.containsValue("The Lab"));

    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    myMap.put("978-1-60309-450-4", "They Called Us Enemy");
    myMap.put("978-1-60309-453-5", "Why Did We Trust Him?");
    System.out.println(myMap.containsKey("478-0-61159-424-8"));
    System.out.println(myMap.get("978-1-60309-453-5"));

  }
}
