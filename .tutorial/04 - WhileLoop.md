# While & Do

A while loop is like a for loop that continues as long as the the condition is True

```java
public class Main {
  int i = 0;
  while (i < 5) {
    System.out.println(i);
    i++;
  }
}
```
and 
```java
public class Main {
  int i = 0;
  while (i < 5) {
    System.out.println(i);
    i = i + 1;
  }
}
```
With the do loop being similar of the while loop. Just put the condition at the bottom instead. So run the code once before checking it still True

```java
public class Main {
  public static void main(String[] args) {
    int i = 0;
    do {
      System.out.println(i);
      i++;
    }
    while (i < 5);
  }
}
```
You can also add the Break and Continue to stop at or skip a number

```java
public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
      if (i == 4) {
        i++;
        break; // contunue
      }
      System.out.println(i);
      i++;
    }
  }
}
```
