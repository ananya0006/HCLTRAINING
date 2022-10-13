class Book1
{
	private int bookID;
	private String bookName;
	private String bookAuthor;
	private String bookDueDate;

	Book1()
	{
	}
	Book1(int bookID)
	{
		this.bookID=bookID;
	}
	Book1(int bookID,String bookName)
	{
		this(bookID);
		this.bookName=bookName;
	}

	Book1(int bookID,String bookName,String bookAuthor)
	{
		this(bookID,bookName);
		this.bookAuthor=bookAuthor;
	}
	Book1(int bookID,String bookName,String bookAuthor,String bookDueDate)
	{
		this(bookID,bookName,bookAuthor);
		this.bookDueDate=bookDueDate;
	}
		public void BookDetails()
	{
		System.out.println("The book id is:"+bookID);
		System.out.println("The book name is:"+bookName);
		System.out.println("The book author is:"+bookAuthor);
		System.out.println("The book id is:"+bookDueDate);
	}
	public String getName()
		{
			return bookName;
		}

	
}