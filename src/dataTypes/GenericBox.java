package dataTypes;

public class GenericBox<E> {
    private E content;

    public GenericBox(E content){
        this.content = content;
    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "dataTypes.GenericBox[" +
                "content=" + content +
                ']';
    }
}
