public class Demo{
   public static void main(String args[]){
      String str = "Hello World";
      String anotherString = "hello world";
      Object objStr = str;
	System.out.println("4th Stage Auto Run");	
	System.out.println("3rd Stage Auto Run..");
	System.out.println("Mahadev Vyavahare Doing Changes...");
      System.out.println( str.compareTo(anotherString) );
      System.out.println( str.compareToIgnoreCase(anotherString) );
   String toggle = System.getenv("toggle");
System.out.println("Toggle from Environment var : "+toggle);
	   System.out.println( str.compareTo(objStr.toString()));
   }
}
