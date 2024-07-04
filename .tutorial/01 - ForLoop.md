# For Loop

Loop allow you to repeat the code and a for loop allows you choose how many times to loop it


👉 Copy this code into your coding editor in `main.py` and see what happens when you hit `run`:


```java
public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }
}
```

Try using things we learn yesterday and change the Logical Conditions or conditions

```java
public class Main {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i = i + 2) {
      System.out.println(i);
    }
  }
}
```

You can even nest them to do everything in the loop, loop again! Just change the variable name

```java
public class Main {
  public static void main(String[] args) {
    for (int a = 1; a <= 2; a++) { // run 2 times
      System.out.println(" Number " + a); 
      for (int b = 1; b <= 2; b++) { // run 4 times
        System.out.println(" Again " + b);
      }
    }
  }
}  
```

This multiply the amount inside the nest is excuated by the amount of the the first one runs