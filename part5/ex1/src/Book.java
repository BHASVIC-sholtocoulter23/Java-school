public class Book{
    private string author;
    private string name;
    private int pages;
    Public Book(string initAuthor, string initName, int initPages){
        author = initAuthor;
        name = initName;
        pages = initPages;
    }
    public string getAuthor(){
        return(author)
    }
    public string getName(){
        return(name)
    }
    public int getPages(){
        return(pages)
    }
    public string toString(){
        return(author+", "+name+", "+String.valueOf(pages))
    }



}
