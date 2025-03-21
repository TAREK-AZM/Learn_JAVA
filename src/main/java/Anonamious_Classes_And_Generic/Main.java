package Anonamious_Classes_And_Generic;

import java.util.Scanner;
public class Main {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        User user = new User();

//        System.out.println("please enter your name : \n");
//        user.setName(scanner.nextLine());
//        System.out.println("please enter your last name : \n");
//        user.setLastName(scanner.nextLine());
//
//        System.out.println(" User Details: "+user.toString());

//        switch (user.getName().trim()){
//            case "tarek":
//                System.out.println("hellow tarek from switch\n");
//                break;
//            default:
//                System.out.println(" you are not tarek go and try again\n");
//        }


        Node<Integer> head = new Node<>(1);
        head.Next = new Node<>(2);
        head.Next.Next = new Node<>(3);
        head.Next.Next.Next = new Node<>(4);
        head.Next.Next.Next .Next = new Node<>(5);
        head.Next.Next.Next .Next.Next = head.Next; // Create a cycle (5 points back to 2)

        // Find the start of the cycle
        Boolean cycleStart = Node.hasCycle(head);
        if (cycleStart) {
            System.out.println(" yes the list has cycle " ); // Output: 2
        } else {
            System.out.println("No cycle found.");
        }



    }


    public static class User{
        private String Name;
        private String LastName;
        public User(){

        }
        public User(String name, String lastName){
            this.Name=name;
            this.LastName=lastName;
        }

        public String getName(){return  Name;};
        public void setName(String name){
            this.Name = name;
        }

        public String getLastName(){return  Name;};
        public void setLastName(String lastName){
            this.LastName = lastName;
        }

        @Override
        public String toString(){
            return "name : "+ Name + " lastName : "+LastName;
        }
    }


    public static class Node<T>{
        public T val;

        Node<T> Next;
        public Node(T val){this.val=val;}

        @Override
        public String toString(){
            return "Node is "+val.toString();
        }

        // reverse the linked list method
        public static Node reverseLinkedList(Node head){
          Node prev = null;
          Node curr = head;

          while(curr != null){
              Node tempNextNode = curr.Next;
              curr.Next = prev;
              prev = curr;
              curr = tempNextNode;
          }
          return prev;
        }


        // Detect Cycle in LinkedList GENERIC type
        public static <T> Boolean hasCycle(Node<T> head){
            if(head == null || head.Next == null){
                return false;
            }
            // two nodes
            if(head == head.Next){
                return true;
            }
            // any where
            Node<T> curr = head;
            Node<T> slow = head;
            Node<T> fast = head;

            while (curr != null){
                slow = slow.Next;
                fast = fast.Next.Next;

                if(slow == fast){
                    return true;
                }
            }
            return  false;
        }
    }

}
