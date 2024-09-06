public class App {
    public static void main(String[] args) throws Exception {

        int age = 10;
        int n1 = 1;
        
        //Q3

        if (age > 0 && age < 18) {
            System.out.println("You are underage");
        }
        else if (age >= 65) {
            System.out.println("You are retired");
        }
        else 
        System.out.println("You are an adult");
        

        //Q5
        // 5a. You can drive a car

        // if (age == 18) {
        // System.out.println("You )an drive a car");

        //5b. Anniversary Party!!
    
        // if (age >= 10 && age%10 == 0) {
        //     System.out.println("Anniversary Part!!");
        // }
        
       // 5c. Congratulations!!!

        if (age == 100 && n1<=3) {
            for (n1 = 1; n1<=3; n1++)
            System.out.println("Congratulations!!!");
        }

        //5d. Happy mid-life

        // if (age > 40 && age < 50) {
        //     System.out.println("Happy Mid-life");
        //  }
     
    }
}
