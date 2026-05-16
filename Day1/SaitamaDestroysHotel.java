package Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SaitamaDestroysHotel {

    static class Pair {
        int f, t;
 
        Pair(int f, int t) {
            this.f = f;
            this.t = t;
        }
    }
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int passengers = sc.nextInt();
        int floors = sc.nextInt();
        solution1(passengers, floors);
        solution2(passengers, floors);
    }

    public static void solution1(int passengers, int floors) {
        int max = 0;
        for(int i = 0; i < passengers; i++) {
            int f = sc.nextInt();
            int t = sc.nextInt();
            max = Math.max(max, f+t);
        }
        
        if(max < floors) {
            max = floors;
        }
        System.out.println(max);
    }

    public static void solution2(int passengers, int floors) {
        List<Pair> list = new ArrayList<>();
 
        for (int i = 0; i < passengers; i++) {
            int f = sc.nextInt();
            int t = sc.nextInt();
            list.add(new Pair(f, t));
        }
 
        Collections.sort(list, (a, b) -> b.f - a.f);
 
        int time = 0;
        int currentFloor = floors;
 
        for (Pair p : list) {
            time += (currentFloor - p.f);
            time = Math.max(time, p.t);
            currentFloor = p.f;
        }
 
        time += currentFloor;
 
        System.out.println(time);
    }
}
