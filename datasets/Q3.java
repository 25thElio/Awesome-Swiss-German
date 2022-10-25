import java.io.File;
import java.io.FileNotFoundException; import java.io.PrintStream;

public void main(String[] Args) {
  File file = new File("output.txt");
  PrintStream fileOutput = new PrintStream(file);
  for (int i = 0; i < 10; i++) {
    System.out.print("Hello World "); 
    System.out.print(i);
    System.out.println("!");
  }
}
