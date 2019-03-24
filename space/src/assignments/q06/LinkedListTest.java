package assignments.q06;

import io.zzax.jadeite.console.Console;

public class LinkedListTest {
    public static void main(String[] args) {
        new LinkedListTest().run();
    }

    public void run() {
        {
            LinkedList linkedList = new LinkedList();
            linkedList.buildDemo();
            Console.println();
        }
        {
            LinkedList linkedList = new LinkedList();
            linkedList.buildDemo();
            Console.println(linkedList.description());
        }
        {
            LinkedList linkedList = new LinkedList();
            Console.println(linkedList.description());
        }
    }
}
