
import java.util.ArrayList;

public class Library {
    private ArrayList<Books>books=new ArrayList<>();
    private ArrayList<Member> members=new ArrayList<>();

    public Library() {
        // Sample data
        books.add(new Books("Harry Potter", "JK Rowling",1));
        books.add(new Books("Java Book", "John",2));
        System.out.println("📚 Ready!");
    }
    public void addBook(String name,String author,int id)
    {
        books.add(new Books(name,author,id));
        System.out.println("Books added Succesfully ✅✅✅");

    }
    public boolean bookExist(int id)
    {
        return books.stream().anyMatch(b->b.getId()==id);
    }

    public void addStudent(String name,int id,String grade)
    {
        members.add(new Student(name,id,grade));
        System.out.println("Members added Successfully ✅✅✅");
    }

    public boolean memberExist(int id)
    {
        return members.stream().anyMatch(m->m.getId()==id);
    }

    public void showBooks()
    {
        System.out.println("📚 Books");
        for(Books b :books)
        {
            System.out.println(b);
        }
    }

    public void showMembers()
    {
        System.out.println("👤 Members");
        for(Member m:members)
        {
            System.out.println(m);
        }
    }

    public void issueBook(int bookId,int memberId)
    {
        Books book=null;
        Member member=null;

        for(Books b:books){
            if(b.getId()==bookId){
               book=b;
               break;
            }

        }

        for(Member m:members)
        {
            if(m.getId()==memberId)
            {
                member=m;
                break;
            }
        }

        if(book==null)
        {
            System.out.println("Book not found ❌❌❌");
            return;
        }

        if(member==null)
        {
            System.out.println("member not found ❌❌❌");
        }

        if(book.isIssued())
        {
            System.out.println("Book already issued");
            return;
        }

        book.issueTo(member);
        System.out.println("Book issued succesfully to: "+member.getName());
    }

    public void returnBook(int id){
        Books book=null;

        for(Books b:books)
        {
            if(b.getId()==id)
            book=b;
            break;
        }
        if(book==null)
        {
            System.out.println("Book not found ❌❌❌");
            return;
        }
        book.returnBook();
        System.out.println("Book returned Succesfully");
    }


}
