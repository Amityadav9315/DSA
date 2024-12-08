package singly;

import java.util.Scanner;

public class Main {
    public static  void printMenu(){
        System.out.println("************MENU*********");
        System.out.println("Enter 1 to insert");
        System.out.println("Enter 2 to delete");
        System.out.println("Entre 3 to search");
        System.out.println("Entre 4 to exit");
        System.out.println("Entre your choice");
        System.out.println("******************");


    }
    public  static  void printInsertMenu(){
        System.out.println("Press 1 to insert at Head");
        System.out.println("Press 2 to insert at Tail");
        System.out.println("Press 3 to insert at Specific position");
    }
    public static  void printDeleteMenu(){
        System.out.println("Press 1 to delete from Head");
        System.out.println("Press 2 to delete from Tail");
        System.out.println("Press 3 to delete from specific position");
    }


    public static void main(String[] args) {

//        LinkedList linkedList = new LinkedList(); // Use your custom LinkedList class
//        linkedList.insertAtBeginning(12);
//        linkedList.insertAtBeginning(20);
//        linkedList.insertAtEnd(34);
//        linkedList.insertAtSpecific(90,2);
//        linkedList.insertAtSpecific(100,3);
//        // Correct method name
//        linkedList.printData();                  // Print the linked list
        System.out.println("Welcome to linklist app");
        LinkedList linkedList=new LinkedList();
        Scanner scanner=new Scanner(System.in);

        while(true){

            try{

                printMenu();
                //read the choice
                int choice =scanner.nextInt();
                if(choice==1){

                }
                else if(choice==2){
                    //delete op
                    dele

                }
                else if(choice==3){
                    //search
                    System.out.println("Enter the data to search");
                    int data=scanner.nextInt();
                    boolean result=linkedList.searchData(data);
                    if(result){
                        System.out.println("Dtra is present");
                    }
                    else{
                        System.out.println("Dta does not present in the list ");
                    }



                }
                else if(choice==4){
                //exit
                    System.out.println("thanks for using app");
                    break;
                }
                else{
                    System.out.println("Envalid choice");
                }

            }
            catch (Exception ex){
                System.out.println(ex.getMessage());

            }

        }

    }
    private  static  void deleteFromLinkedList(LinkedList linkedList){

        printDeleteMenu();
         Scanner scanner=new Scanner(System.in);
        System.out.println("Entre the  delete choice");
        int deleteChoice= scanner.nextInt();
        if(deleteChoice==1){
            linkedList.deleteFirst();
        }
        else if(deleteChoice==2){
            linkedList.deleteLast();
        }
        else if(deleteChoice==3){
            System.out.println("Entre the position");
            int position=scanner.nextInt();
        }

    }

}
