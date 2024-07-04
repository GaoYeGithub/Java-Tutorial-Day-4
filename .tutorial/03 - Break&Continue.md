# Break & Continue

While playing around with the for loop you might have notices that you can't use equal signs

```java
public class Main {
  public static void main(String[] args) {
    for (int i = 0; i == 5; i++) {
      System.out.println(i);
    }
  }
}
```

This can be fix using a if statment

```java
public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        break;
      }
      System.out.println(i);
    }
  }
}
```

This will stop the excution of code, however if you want to contiune the code just use continue. This can be used to skip over the number

```java
public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        continue;
      }
      System.out.println(i);
    }
  }
}
```


