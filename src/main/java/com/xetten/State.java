package com.xetten;

/**
 * Author: Cristian Lungu
 * Email: lungu.cristian@gmail.com
 * Date: 11/13/13
 */
interface State {
    public State next(Input word);
}