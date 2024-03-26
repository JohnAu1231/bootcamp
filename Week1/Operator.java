public class Operator{
  public static void main(String[] args) {
    //increment
    int x = 1;
    x = x + 1; //x + 1 -> 1 + 1
    x = x + 1; //x + 1 -> 2 + 1

    int y = 1;
    y++; //2
    y++; //3
    System.out.println(y);
    ++y; //4
    y = y + 1; //5
    y += 1; //6, equal to y = y + 1

    int e = 10;
    e--;//9
    --e;//8
    e -= 1;//7
    e = e - 1;//6
    System.out.println(e);

    //predecrement = value change first, then variable get the value
    int predecrement = --e; //5 , e-1 first,so predecrement = 5
    System.out.println(predecrement); //5 拎完VALUE先運算
    //postdecrement = variable get the value first, then value change
    int postdecrement = e--; //postdecrement = 5; postdecrement get the e value first, so = 5, then e -1
    System.out.println(postdecrement); //5 運算完先拎VALUE
    System.out.println(e); //4, e-1 in "int postdecrement = e--;" after postdecrement get the value 5

    int f = 20;
    int f1 = f--; // Start f = 20 -> f1 = f = 20 -> f-- = f-1 = 19 -> End f = 19
    System.out.println(f1);
    int f2 = --f; // Start f = 19 -> --f -> f - 1 = 18 -> f2 = f =18 -> End f - 18
    System.out.println(f2);

    int a = 10;
    int a2 = ++a; 
    System.out.println(a2); //11
    System.out.println(a);//11

  
  }
}