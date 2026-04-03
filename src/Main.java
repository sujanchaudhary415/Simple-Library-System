import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Library library=new Library();
        Scanner sc=new Scanner(System.in);
        int choice;

        do{
            System.out.println("\nSimple Library System");
            System.out.println("--------------------------------------------");
            System.out.println("1. Show Books");
            System.out.println("2. Add Book");
            System.out.println("3. Add Member");
            System.out.println("4. Show members");
            System.out.println("5. Issue book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();


            switch(choice){
                case 1 -> library.showBooks();
                case 2 -> {
                          sc.nextLine();
                          System.out.println("Enter book name: ");
                          String name = sc.nextLine();
                          System.out.println("Enter author: ");
                          String author = sc.nextLine();
                          System.out.println("Enter id: ");
                          int id = sc.nextInt();
                          if(library.bookExist(id))
                          {
                              System.out.println("BookID already Exist ❌❌❌");
                              break;
                          }
                          library.addBook(name,author,id);
                          }
                case 3 -> {
                    sc.nextLine();
                    System.out.println("Enter member name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    if(library.memberExist(id))
                    {
                        System.out.println("MemberID already Exist ❌❌❌");
                        break;
                    }
                    System.out.println("Enter Grade: ");
                    String grade = sc.nextLine();
                    library.addStudent(name,id,grade);
                }
                case 4 -> {
                    library.showMembers();

                }
                case 5-> {
                    System.out.println("Enter bookId: ");
                    int bookId=sc.nextInt();

                    System.out.println("Enter memberId");
                    int memberId=sc.nextInt();
                    library.issueBook(bookId,memberId);
                }
                case 6 ->{
                    System.out.println("Enter book id: ");
                    int id=sc.nextInt();
                    library.returnBook(id);
                }
                case 7 -> System.out.println("Exiting....");
                default-> System.out.println("Enter the valid choice ❌❌❌");
            }
        }while(choice!=7);
    }
}