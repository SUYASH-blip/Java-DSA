package TwoDimensional_Arraylists.java;
import java.util.ArrayList;
import java.util.List;
public class Basic_STL_Functions {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
         a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50); b.add(60);
        List<Integer> c = new ArrayList<>();
        c.add(70); c.add(80); c.add(90);

        List<List<Integer>> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);

// How to access Individual Lists Elements:-

        for(int i = 0 ; i < a.size(); i++){
            System.out.println(a.get(i)+" ");
        }

// Printing Whole 2-D Arraylists in Two ways:-

 //1.

    for(int i = 0 ; i < l.size(); i++){
        System.out.println(l.get(i)+" ");  // Prints in square Brackets Form
    }

 //2.Without Square Brackets
    for(int i = 0 ; i < l.size(); i++){
        List<Integer> x = l.get(i);
        for (int j = 0; j < x.size(); j++) {
            System.out.println(x.get(j) + " ");
        }
        System.out.println();
    }
        // Accessing a specific Element:-

            System.out.println(l.get(1).get(1));


        }
    }



