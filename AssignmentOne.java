public class AssignmentOne {
    public static void main(String [] args) {

        double sum = 0;

        for(String s : args) {
            try {
                int i = Integer.parseInt(s);
                sum += i;
            } catch(Exception e) {
                try {
                    double d = Double.parseDouble(s);
                    sum+= d;
                } catch(Exception r) {
                    try {
                        long l = Long.parseLong(s);
                        sum+=l;
                    } catch(Exception g) {
                        System.out.println(s+" is not a numeric value, and will not be used to calculate the sum.");
                        
                    }
                }
            }
        }
        
        

        System.out.println("The sum of the values entered was: "+sum);
        
    }

}