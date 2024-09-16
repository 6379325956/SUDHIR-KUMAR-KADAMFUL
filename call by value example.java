public class CallByValueExample {

    // Method to modify primitive data type
    public static void modifyPrimitive(int x) {
        x = x + 10;
        System.out.println("Inside modifyPrimitive method: x = " + x);
    }

    // Method to modify non-primitive data type
    public static void modifyObject(MyObject obj) {
        obj.value = obj.value + 10;
        System.out.println("Inside modifyObject method: obj.value = " + obj.value);
    }

    public static void main(String[] args) {
        // Example with primitive data type
        int num = 5;
        System.out.println("Before modifyPrimitive method: num = " + num);
        modifyPrimitive(num);
        System.out.println("After modifyPrimitive method: num = " + num);
        
        // Example with non-primitive data type
        MyObject myObj = new MyObject();
        myObj.value = 5;
        System.out.println("Before modifyObject method: myObj.value = " + myObj.value);
        modifyObject(myObj);
        System.out.println("After modifyObject method: myObj.value = " + myObj.value);
    }
}

// Non-primitive class
class MyObject {
    int value;
}
