public class AssignmentTwo {

    public static void main(String [] args) {
        int[][] A = {
            {1, 5, 7},
            {2, 3, 9},
            {10, 5, 2},
        };
        
        int max = 0;
        int posa = 0;
        int posb = 0;

        for(int i = 0; i<3; i++){
            for(int k = 0; k<3; k++){
                if (A[i][k] > max) {
                    max = A[i][k];
                    posa = i;
                    posb = k;
                }
            }
        }

        System.out.println("The max value in A was "+max+" at position "+posa+", "+posb+".");
    }
    
}
