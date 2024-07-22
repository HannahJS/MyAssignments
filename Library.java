package assignment.week1.methodsandobjects;

public class Library {//class name declared during creation

	//method1- To add books into library management system
	
	public String addBook(String bookTitle)
	
	{
		System.out.println("Book- " +bookTitle +" - added successfully");// executes successfully
		
		return bookTitle;
		
		
	}
	
	
	
	//method 2- Books issued message
	
	public void issueBook()
	{
		
		System.out.println("Book issued successfully");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Library book1=new Library();
book1.addBook("The Growth mindset");
book1.issueBook();
		
		
	}

}
