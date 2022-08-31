package MAIN.LINES;

public class App {
    public static void main( String[] args ){
    CommandLines c1,c2,c3;
    
    c1 = new CommandLines ("10");
    c2 = new CommandLines ("20");
    c3 = new CommandLines ("30");
    
    System.out.println("App: Main: c1.getCommandLines()="+ c1.getCommandLines());
    System.out.println("App: Main: c2.getCommandLines()="+ c2.getCommandLines());
    System.out.println("App: Main: c3.getCommandLines()="+ c3.getCommandLines());
    }
}
