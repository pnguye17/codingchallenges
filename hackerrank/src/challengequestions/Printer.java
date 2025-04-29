package challengequestions;

public class Printer<T> {

    T objT;

    @SuppressWarnings("hiding")
    public <T> void printArray(T[] obT){
        for (T ele: obT){
            System.out.println(ele);
        }
    }

}
