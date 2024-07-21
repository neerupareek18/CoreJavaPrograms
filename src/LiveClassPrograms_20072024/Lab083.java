package LiveClassPrograms_20072024;

public class Lab083 {
    public static void main(String[] args) {
        //Continue keyword:    -------------------- Check with Continue

        
        for(int i =0;i<10;i++){
            System.out.println(i);
            if(i==5){
                System.out.println(i);
                continue;
                //No Statement in this loop can be written after continue
                //if continue is there, there will be no execution of next line, again it will go to the loop
            }
            System.out.println("After!!"); //After will not be printed in case of After
        }

        //break -- breaking out of the loop
        //Continue -- skip the below statement and continue in loop
    }
}
