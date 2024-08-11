package Ex_15072024;

public class Lab005 {
    public static void main(String[] args) {
        //Can we have two main methods with same labels
        System.out.println("No");
    }
        public void main(){
        //It is possible as it is not the entry point main method, it counts as different

        }
//        private int main(){
//            //It is not possible as the name of method 2 is same as this one
//            return 0;
//        }
        public static void main(String args){
            //It is not the entry level main method [] are missing
        }
        public static void main (int[] args){
        // Tjis is possible as the parameters are different and it is not the entry level main method

        }
}
