package ru.itmo.backend_2021;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordCountJava {
  public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer(args[0]);
    Map<String, Integer> map = new HashMap<>();
    while (st.hasMoreTokens()) {
      String word = st.nextToken();
      Integer count = map.get(word);
      if (count == null)
        map.put(word, 1);
      else
        map.put(word, count + 1);
    }
    System.out.println(map);
  }
}


