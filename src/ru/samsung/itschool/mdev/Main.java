package ru.samsung.itschool.mdev;

import java.util.*;

class City implements Comparable<City>{
    public String name;
    public int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public int compareTo(City o) {
        return this.population-o.population;
    }
}

public class Main {
    public static void main(String[] args) {
        List<City> cites = new ArrayList<>();
        cites.add(new City("Moscow",9999999));
        cites.add(new City("St.Peter",666666));
        cites.add(new City("Kazan",777777));

        Comparator<City> sort_by = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Collections.sort(cites);
      //  for(City c: cites) System.out.println(c.name + "=> "+c.population);

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList.add(0,i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList add to begin: "+(endTime-startTime));

        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList.add(0,i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList add to begin: "+(endTime-startTime));

// -------------------------------------------------------------------------------

        startTime = System.nanoTime();
        for(int i=30000;i<70000;i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList get from middle: "+(endTime-startTime));

        startTime = System.nanoTime();
        for(int i=30000;i<70000;i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList get from middle: "+(endTime-startTime));

        // --------------------------------------------------------------

        startTime = System.nanoTime();
        for(int i=0;i<30000;i++) {
            arrayList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList remove from begin:  "+(endTime-startTime));

        startTime = System.nanoTime();
        for(int i=0;i<30000;i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList remove from begin: "+(endTime-startTime));

        // Stack - LIFO - Last in - first out
        // Queue - FIFO - First in - first out


        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] str  = {"1","2","3","4","5"};
        for(String s: str) {
            stack.push(s);
            queue.offer(s);
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // печает значение элемента и удаляет его
        }
        System.out.println();
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " "); // удаляем и печатаем
        }




    }
}
