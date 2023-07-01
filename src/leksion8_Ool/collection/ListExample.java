package leksion8_Ool.collection;

import java.util.*;

public class ListExample {
    static class Pairs{
        int key;
        String value;

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Pairs(int key, String value) {
            this.key = key;
            this.value = value;
        }
        public Pairs() {
            this.key = key;
            this.value = value;
        }
        @Override
        public String toString(){
            return "{key: "+ key + ", value: " + value + "}";
        }

        @Override
        public boolean equals(Object obj) {
            Pairs p=(Pairs) obj;
         //   return key==((Pairs)obj).key && value.equals(((Pairs)obj).value);
            return key==p.key && value.equals(p.value);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(0, 6);

        System.out.println(arr);
        for (Integer e : arr) {
            System.out.print(e + "  ");
        }
        System.out.println();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 10; i < 20; i++) {
            arr2.add(i);
        }
        arr.addAll(Arrays.asList(1, 2, 3, 4, 5));
        arr2.addAll(arr);
        System.out.println("Arr1: " + arr);
        System.out.println("Arr2: " + arr2);
        System.out.println("arr[2] " + arr.get(2));
        System.out.println("arr has 20 " + arr.contains(20));
        arr2.remove(2);
        System.out.println("Arr2 " + arr2);
        //arr2.remove(new Integer(12));
        //System.out.println("Arr2: "+ arr2);
        ArrayList<String> stringArray = new ArrayList<>();
        ArrayList<String> stringArray1 = new ArrayList<>(List.of("Afrim", "Patalaku"));
        ArrayList<String> stringArray2 = new ArrayList<>(Arrays.asList("Afrim", "Patalaku"));
        stringArray.add("Klaus");
        stringArray.add("Anonymous");
        stringArray.add("Word");
        System.out.println(stringArray);
        System.out.println(stringArray1);
        System.out.println("stringArray has Word: " + stringArray.contains("Word"));
        System.out.println("stringArray: " + stringArray);
        stringArray.remove("Word");
        System.out.println("stringArray: " + stringArray);
        stringArray.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("stringArray" + stringArray);
        System.out.println("Index of Word in stringArray: " + stringArray.indexOf("Word"));

        System.out.println("-------------- Linked List---------------------------------");
        //Note: it is better than arrayList for removing and adding elements
        //But is worse than arrayList for accessing elements at specified index
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(2);
        list1.add(5);
        list1.addFirst(8);
        list1.addLast(10);
        list1.add(2, 20);
        System.out.println("List1: " + list1);
        boolean el = list1.offerFirst(7);
        System.out.println(el);
        System.out.println(list1);
        Integer element1 = list1.element();
        System.out.println("element1: " + element1);
        list1.remove(2);
        System.out.println("Hoqem elementin me index 2 nga list1 " + list1);

        //Stack analogy is LIFO (Last in First Out)
        System.out.println("---------------STACK------------------------");
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(2);
        stack1.push(3);
        stack1.push(7);
        System.out.println("Stack1: " + stack1);
        int a = stack1.pop();
        System.out.println("a: " + a);
        System.out.println("Stack1: " + stack1);
        System.out.println("Peeking: " + stack1.peek());
        System.out.println("Stack1: " + stack1);
        System.out.println("index 0: " + stack1.get(0));
        System.out.println(stack1.search(2));

        //
        System.out.println("--------------------------QUEUE-------------------------------");
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        Pairs p1 = new Pairs();
        p1.key = 2;
        p1.value = "Hello";
        Pairs p2 = new Pairs(3, "Word");

        queue1.add(4);
        queue1.add(7);
        queue1.add(10);
        PriorityQueue<Pairs> pairsQueue = new PriorityQueue<>(new Comparator<Pairs>() {
            @Override
            public int compare(Pairs o1, Pairs o2) {
                return o1.value.compareTo(o2.value);
            }
        });  // vendoset rregulli per prioritetin (sorting) duke perdorur funksioni interface Compare
        pairsQueue.add(new Pairs(8, "JAVA"));
        pairsQueue.addAll(List.of(p1,p2)); //add list of elements, [(2,"Hello"),(3,"Word")]
        //pairsQueue.add(p1);
        System.out.println("pairsQueue: " + pairsQueue);
        pairsQueue.add(new Pairs(12,"something")); //[(2,"Hello"),(3,"Word"), (12,"something")]
        System.out.println("pairsQueue: " + pairsQueue);
        System.out.println("pairsQueue: " + pairsQueue.remove(p1)); //[(3,"Word"), (12,"something")]
        System.out.println("pairsQueue: " + pairsQueue);
        System.out.println("pairsQueue: " + pairsQueue.poll()); //[(12,"something")]
        pairsQueue.offer(new Pairs(8, "Klaus")); //[(8,"Klaus"), (12,"something")]
        System.out.println("pairsQueue:  " + pairsQueue);

        System.out.println(p1.equals(new Pairs(2,"Hello")));

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(List.of(3,5,6));
        arrayDeque.add(12);
        System.out.println("arrayDeque: " + arrayDeque);
        System.out.println("Peeking: " + arrayDeque.peek());
        System.out.println("Poll: " + arrayDeque.poll());
        System.out.println("arrayDeque: " + arrayDeque);
        System.out.println("Pop: " + arrayDeque.pop());
        System.out.println("Poll Last: " + arrayDeque.pollLast());
        arrayDeque.addLast(15);
        System.out.println("arrayDeque: " + arrayDeque);

    }
}