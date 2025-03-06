package dataTypes;

public class MyArrayTest {
    public static void main(String[] args) {
        MyArrayList strLst = new MyArrayList();
        strLst.add("Peter");
        strLst.add("John");
        strLst.add("Andrew");
        strLst.add(4321.11f);
        System.out.println(strLst);

        for(int i=0; i< strLst.size(); i++){
            String str = (String) strLst.get(i);
            System.out.println(str);
        }

        strLst.add(1234);
        String str = (String) strLst.get(2);
        System.out.println(strLst);
    }
}
