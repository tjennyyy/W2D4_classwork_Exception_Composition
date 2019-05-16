public class Main_A1 {

    public static void main(String[] args) {

        try{
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally {
            System.out.println("try catch finished");
        }
    }

}
