public class Book{
    private String author;
    private String name;
    private int pages;
    public Book(String initAuthor, String initName, int initPages){
        author = initAuthor;
        name = initName;
        pages = initPages;
    }
    public String getAuthor(){
        return(author);
    }
    public String getName(){
        return(name);
    }
    public int getPages(){
        return(pages);
    }
    public String toString(){
        return(author+", "+name+", "+String.valueOf(pages));
    }



}
