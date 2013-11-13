package com.xetten;

/**
 * Author: Cristian Lungu
 * Email: lungu.cristian@gmail.com
 * Date: 11/13/13
 */
public class Main {
    public static void main(String[] args) {
        State s = States.Init;
        Input in = new Input("aabbbbcc");
        for(; !(s instanceof FinalState); s = s.next(in)) {}
        switch((FinalStates)s) {
            case Failed: System.out.println("Failed..."); break;
            case Ok: System.out.println("Valid!"); break;
            default: System.out.println("Undefined"); break;
        }
    }
}
