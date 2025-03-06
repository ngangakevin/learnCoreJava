package dataTypes;

public class Book {
    private int id;
    private String title;

    public Book(int id, String title){
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString(){
        return this.id + ":" + title;
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Book && this.id == ((Book) o).id;
    }

    @Override
    public int hashCode(){
        return id;
    }
}
