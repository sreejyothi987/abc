



public class Sample5 {




	 public class Main {
		 static int c = 0;
		 public static void main(String[] args) {
		 Main a1 = c();
		 Main a2 = c(a1);
		 Main a3 = c(a2);
		 Main a4 = c(a3);
		 }
		 private Main() {
		 System.out.println("c = " + c + ";");
		 }
		 static Main c() {
		 return c++ > 0? new Main():null;
		 }
		 static Main c(Main m) {
		 return c++ == 1?new Main():null;
