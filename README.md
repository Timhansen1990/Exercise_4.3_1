# Øvelse Dato
## Kode Amerikansk Format
```java
    public static void PrintAmerican (String day, int date, String month, int year )
    {
        System.out.print("American format: ");
        System.out.printf("%s, %s, %d, %d", day, month,date,year);
        System.out.print("\n");
    }
```
### Kode Europærisk Format
  ```java
       public static void PrintEurope (String day, String month, int date, int year )
    {
        System.out.print("Europe Format: ");
        System.out.printf("%s, %d, %s, %d", day, date,month,year);
    }
   ```
#### Kode Kalder Metode
  ```java
       public static void main(String[] args) {

        PrintAmerican("wednesday", 8, "september", 2021);
        PrintEurope("wednesday", "September", 8, 2021);
    }
   ```
#### Forklaring af kode
  ##### Linje 4 
vi definerer først klassen og at den ikke skal sende en værdi tilbage når den har kørt koden, derefter definerer vi variablerne den skal tage og navngivning af dem.

  #### Linje 6  
her printes hvilket format vi har med at gøre i dette tilfælde taler vi om det Amerikanske format.




  
    
