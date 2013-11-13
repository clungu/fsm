package com.xetten;

/**
 * Author: Cristian Lungu
 * Email: lungu.cristian@gmail.com
 * Date: 11/13/13
 */
enum States implements State {
    Init {
        @Override
        public State next(Input word) {
            switch(word.read()) {
                case 'a': return A;
                default: return FinalStates.Failed;
            }
        }
    },
    A {
        @Override
        public State next(Input word) {
            switch(word.read()) {
                case 'a': return A;
                case 'b': return B;
                case 'c': return C;
                case '\0': return FinalStates.Ok;
                default: return FinalStates.Failed;
            }
        }
    },
    B {
        @Override
        public State next(Input word) {
            switch(word.read()) {
                case 'b': return B;
                case 'c': return C;
                case '\0': return FinalStates.Ok;
                default: return FinalStates.Failed;
            }
        }
    },
    C {
        @Override
        public State next(Input word) {
            switch(word.read()) {
                case 'c': return C;
                case '\0': return FinalStates.Ok;
                default: return FinalStates.Failed;
            }
        }
    };

    public abstract State next(Input word);
}
