package com.xetten;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: Cristian Lungu
 * Email: lungu.cristian@gmail.com
 * Date: 11/13/13
 */
public class StatesTest {
    @Test
    public void testValid() throws Exception {
        State s = validate(new Input("aabbbbcc"));
        assertEquals(s, FinalStates.Ok);
    }

    @Test
    public void testVaildLonger() throws Exception {
        State s = validate(new Input("aaaaaaaaaaaaaabbbbcccccccccccccccccccccc"));
        assertEquals(s, FinalStates.Ok);
    }

    @Test
    public void testInvalid() throws Exception {
        State s = validate(new Input("abcdef"));
        assertEquals(s, FinalStates.Failed);
    }


    /**
     * Runs the FSM until a FinalState is reached
     * @param in the Input
     * @return the final state the validator has reached
     */
    private State validate(Input in) {
        State s = States.Init;
        while (!(s instanceof FinalState)) {s = s.next(in);}
        return s;
    }
}
