/*
 * created by max$
 */


package lesson038.HomeWork;

import com.sun.source.tree.NewArrayTree;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class HomeWork0382 {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println(union(set1,set2));
        System.out.println(intersection(set1,set2));
        System.out.println(difference(set1,set2));
    }

    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        return set3;
    }
    public static Set<String> intersection(Set<String> set1, Set<String> set2){
        Set<String> set3 = new HashSet<>(set1);
        set3.retainAll(set2);
        return set3;
    }

public static Set<String> difference(Set<String> set1, Set<String> set2){
    Set<String> set3 = new HashSet<>(set1);
    set3.removeAll(set2);
    return set3;
}

}
