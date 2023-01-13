package DataStructure;
import javax.swing.*;
import java.util.*;

public class DataStructureDemo {
    public static void main(String[] args) {
        setInterface();
    }

    // Collection
    // List(I) : Implemented by ArrayList(C), LinkedList(C)
    // Set(I) : Implemented by Hashset(C), LinkedHashSet(C)
    // Queue(I) : Implemented by PriorityQueue(C), LinkedList(C)

    public static void setInterface(){
        // Duplicate(X), Insertion Order(x), Hashcode concept used when inserting data, Heterogeneous (0)
      HashSet hashSet = new HashSet();
      hashSet.add(100);
      hashSet.add("Welcome");
      hashSet.add(16.4);

      System.out.println(hashSet);
        System.out.println(hashSet.contains("Welcome"));
        System.out.println(hashSet.isEmpty());

        for (Object e:hashSet){
            System.out.println(e);
        }

        Iterator it = hashSet.iterator();
        while   (it.hasNext()){
            System.out.println(it.next());
        }

        HashSet<Integer> evenNumber = new HashSet<Integer>();

        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);

        System.out.println("Hashset: "+evenNumber);

        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.addAll(evenNumber);

        // Operation available: Union, Intersection, difference
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Union
        set1.addAll(set2);

        // Intersection
        set1.retainAll(set2);
        System.out.println("Intersections: "+set1);

        // Difference
        set1.removeAll(set2);
        System.out.println("Difference: "+set1);

        // Subset (all elements of set2 are contained in set1)
        System.out.println(set1.containsAll(set2));
    }

    public static void queueInterface(){
        // FIFO

        // Method
        // add(): Return true or Exception & offer(): Return true or null value
        // element(): Return head element if head is empty, return Exception & peak(): Return null value
        // remove() & poll()

        // child interface of queue interface
        // Deque(I)
        // BlockingQueue(I)

        // Implementation 2 Classes
        // PriorityQueue(C) - Insertion Order(O), Duplicate(O), Heterogeneous (X)
        // LinkedList(C) - Insertion Order(O), Duplicate(O), Heterogeneous (O)

        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add(100);

        System.out.println("Linkedlist is: "+linkedList);

        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add("A");
        priorityQueue.add("B");
        priorityQueue.add("C");
        priorityQueue.add("C");
//        priorityQueue.add(100);

        System.out.println(priorityQueue); // [A, B, C, C]
        System.out.println(priorityQueue.element()); // A
        System.out.println(priorityQueue.peek()); // A
        System.out.println(priorityQueue.poll()); // remove head
        System.out.println(priorityQueue); // [B, C, C]

        Iterator itr = priorityQueue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        for (Object obj:priorityQueue){
            System.out.println(obj);
        }
    }

    public static void hashMap(){
        // Underlying DS is Hashtable
        // Insertion order(X)
        // n ull key allowed once, multiple null value is allowed

        // HashMap m = new HashMap();
        HashMap <Integer, String> m= new HashMap<Integer,String>();
        m.put(101, "John");
        m.put(102, "David");
        m.put(103, "Mary");
        m.put(104, "Miso");
        System.out.println(m.get(103));
        System.out.println(m.containsKey(103));
        System.out.println(m.isEmpty());
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());

        for(Object i:m.keySet()){
            System.out.println(i+" "+m.get(i));
        }
        for(Object i:m.values()){
            System.out.println(i);
        }
        for(Map.Entry entry:m.entrySet()){
             System.out.println(entry.getKey()+" "+entry.getValue());
         }

        Set s =m.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()){
           Map.Entry entry= (Map.Entry) itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public void hashTable(){
        // Hashtable(Non synchronized)& Hashmap = Map Interface Implementation class, both have same data structure "Hashtable"

        // Default capacity is 11, load factor 0.75
        // Hashtable t = new Hashtable(initial capacity, fill ration/load factor);
        Hashtable<Integer, String> t = new Hashtable<Integer, String>();
        t.put(101, "Miso");
        t.put(102, "Biso");
        t.put(103, "Ciso");
        t.put(104, "Diso");
        // No Null key value is allowed
        System.out.println(t);
        System.out.println(t.get(103)); // Ciso
        t.remove(101);
        System.out.println(t.containsKey(101));
        System.out.println(t.containsValue("Ciso"));
        System.out.println(t.isEmpty());
        System.out.println(t.keySet()); // [102,103,104] returned as set object
        System.out.println(t.values()); // [Diso, Ciso, Biso] returned as collection object

        for (int k:t.keySet()){
            System.out.println(k+" "+t.get(k));
        }

        for (Map.Entry entry:t.entrySet()) // entry = key + value set
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        // To use Iterator
        Set s = t.entrySet();
        Iterator itr = s.iterator();

        while (itr.hasNext()){
            Map.Entry entry= (Map.Entry) itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}
