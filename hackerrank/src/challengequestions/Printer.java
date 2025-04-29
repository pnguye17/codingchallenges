package challengequestions;

public class Printer<T> {

    T objT;

    public <T> void printArray(){
        System.out.println(this.objT.toString());
    }

}
