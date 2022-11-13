package com.yorwerth;

//entry point for the programme
public class Coordinator {
    public static void main(String[] args) {
        //define the pieces we have in the set within an attempt
        Attempt attempt = new Attempt();
        getToWork(attempt);
    }

    static void getToWork(Attempt attempt){
        int x=1000;
        while(x>0) {
            attempt.randomise();
            if (Validator.validate(attempt)){
                System.out.println("SOLVED");
                attempt.print();
                break;
            }
            x--;
        }
        System.out.println("programme finished");
    }
}
