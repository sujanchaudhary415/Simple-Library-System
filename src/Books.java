import java.time.LocalDate;


public class Books {
    private int id;
    private String name;
    private String author;
    private boolean issued=false;
    private Member issuedTo=null;
    private LocalDate issueDate=null;

    //constructor
    Books(String name,String author,int id)
    {
        this.name=name;
        this.author=author;
        this.id=id;
    }

    //getters and setters
    public String getName(){
        return name;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getId()
    {
        return id;
    }

    public boolean isIssued()
    {
        return issued;
    }

    public void issueTo(Member member)
    {
        this.issued=true;
        this.issuedTo=member;
        this.issueDate= LocalDate.now();
    }

    public void returnBook() {
       if(!issued)
       {
           System.out.println("Book is not issued ❌❌❌");
       }
        this.issued = false;
        this.issuedTo = null;
        this.issueDate = null;
    }


    public String toString()
    {
        if(issued)
        {
            return "📖 " + name + " By " + author +
                    " | Issued to: " + issuedTo.getName()+ " | Date: " +issueDate;
        }
        return "📖 " + name + " By " + author + " | Available" ;
    }

}
