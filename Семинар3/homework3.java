
class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;
    Node tail;

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public void reverse() {
        // Проверяем список на пустоту или наличие только одного элемента
        if (head == null || head.next == null)
            return; // список пуст или состоит из одного элемента

        Node current = head;
        Node temp;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        temp = head;
        head = tail;
        tail = temp;

    }
    // метод вывода списка в консоль
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("\n");
    }
}

public class homework3 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(0);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        

        System.out.print("\nИсходный список:     ");
        ll.print();

        ll.reverse();
        System.out.print("Перевернутый список: ");
        ll.print();
        
    }
}