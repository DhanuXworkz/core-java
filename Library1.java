class Library1 {
	
	int libraryId;
	String name;
	String location;
	int noOfBooks;
	String librarian;
	
	public Library1(int libraryId,String name,String location,int noOfBooks,String librarian){
		this.libraryId=libraryId;
		this.name=name;
		this.location=location;
		this.noOfBooks=noOfBooks;
		this.librarian=librarian;
		
		System.out.println("ID :"+libraryId);
		System.out.println("Name :"+name);
		System.out.println("location :"+location);
		System.out.println("Numbers of books :"+noOfBooks);
		System.out.println("librarian Name :"+librarian);
		
		
	}
}