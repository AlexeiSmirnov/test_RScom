package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {}

  public static void function(String[] strings) {
    HashMap<String, StringBuilder> map = new HashMap<>();
    if (strings.length == 0) {
      System.out.print("Неверный ввод");
    }

    for (int i = 0; i < strings.length; i++) {
      if (strings[i].equals("")) {
        continue;
      }
      char[] chars = strings[i].toCharArray();
      Arrays.sort(chars);
      String temp = new String(chars);
      if (!map.containsKey(temp)) {
        String number = String.valueOf(i);
        map.put(temp, new StringBuilder(number));
      } else {
        map.get(temp).append("," + i);
      }
    }
    for (String str : map.keySet()) {
      if (map.get(str).length() > 1) {
        System.out.print(str + "=" + map.get(str).toString() + " ");
      }
    }
  }
}
