public class App {
    public static void main(String[] args) {
        try {
            IO.menu();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}