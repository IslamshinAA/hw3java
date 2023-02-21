//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

import java.util.*;
public class hw2 {
    public static void main(String args[]) {
      ArrayList<Integer> list = new ArrayList();
  for(int i = 1; i < 20; i++) {
      list.add(i);
      
  }
  System.out.println(list);
  System.out.println("Значение максимального значения в списке равно: " + Collections.max(list));
  System.out.println("Значение минимального значения в списке равно: " + Collections.min(list));
  int res = 0;
  for (int n : list) {
    res += n;
  }
  System.out.println("Значение среднего арифметического равно: " + res / list.size());
}
}