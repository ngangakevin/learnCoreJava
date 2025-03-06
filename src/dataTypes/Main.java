package dataTypes;

class Parent {
        void show() {
            System.out.println("dataTypes.Parent's show()");
        }
    }
    class Child extends Parent {
        @Override
        void show() {
            System.out.println("dataTypes.Child's show()");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Parent obj = new Child(); // Runtime polymorphism
            obj.show(); // Calls dataTypes.Child's show()
        }
    }


