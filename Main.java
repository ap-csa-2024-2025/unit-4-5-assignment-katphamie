import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNTimes("love", 2);
    printNums(3);
    uprightNumberTriangle(5);
    starTree(3);
    multTable();
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)
    {
      for (int j = 0; j < N; j++)
      {
        String letter = word.substring(i,i+1);
        System.out.print(letter);
      }
    }
    System.out.println();
  }

  public static void printNums(int num)
  {
    for (int N = num; N > 0; N--)
    {
      for (int i =0; i==num; i++)
      {
        System.out.println(N + " ");
      }
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    String newTri = "";
    for (int i = 0; i < N; i++)
    {
      for (int j = i; j<N; j++)
      {
        newTri += N;
        System.out.println(newTri);
      }
    }
  }

  public static void starTree(int num)
  { //width is 9 height is 9
  
    for (int i = 0; i<=num ; i++)
    {
      //print the spaces
      for (int j = 0; j <= i; j++)
      {
        System.out.print(" ");
      }

      for (int s = num; s>i; s--)
      {
        System.out.print("* ");
      }

      System.out.println(); //new line
    }
  }

  public static void multTable()
  {
    for (int row = 1; row<=10 ; row++)
    {
      for (int col = 1; col <= 10; col++)
      {
        System.out.print((row*col) + "\t");
      }
    System.out.println();
    }
  }
}
