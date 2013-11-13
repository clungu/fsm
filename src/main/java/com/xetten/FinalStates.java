package com.xetten;

/**
 * Author: Cristian Lungu
 * Email: lungu.cristian@gmail.com
 * Date: 11/13/13
 */
enum FinalStates implements FinalState {
    Failed {
        @Override
        public State next(Input word) {
            return Failed;
        }
    },
    Ok {
        @Override
        public State next(Input word) {
            return Ok;
        }
    }
}
