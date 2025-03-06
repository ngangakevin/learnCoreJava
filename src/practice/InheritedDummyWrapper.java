package practice;

import java.util.Objects;

public class InheritedDummyWrapper <T> implements Cloneable{
    private T value;
    public InheritedDummyWrapper(T value){
        this.value = value;
//        super();
    }

    public boolean equals(Object obj){
      if(this == obj) return true;
      if(obj == null || getClass() != obj.getClass()) return false;
      InheritedDummyWrapper<?> other = (InheritedDummyWrapper<?>) obj;
      return Objects.equals(this.value, other.value);
    }

    @Override
    public InheritedDummyWrapper<T> clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (InheritedDummyWrapper<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public InheritedDummyWrapper<T> testMethod(){
        return this;
    }
}
