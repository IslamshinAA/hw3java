//Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.*;
public class hw1 {
    public static void main(String args[]) {
      ArrayList<Integer> list = new ArrayList();
  for(int i = 0; i < 20; i++) {
      list.add(i);
  }
  Collections.shuffle(list);
     System.out.println(list);
     ArrayList<Integer> list1 = new ArrayList();
     for(int i =0; i < list.size(); i++) {
         if(list.get(i) % 2 == 0) {
             list1.add(list.get(i));
             
         }
     }
     System.out.println(list1);
    }
}