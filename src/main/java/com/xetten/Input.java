package com.xetten;

/**
 * Author: Cristian Lungu
 * Email: lungu.cristian@gmail.com
 * Date: 11/13/13
 */
class Input {
    private String input;
    private int current;
    public Input(String input) {this.input = input;}
    char read() { return current>=input.length() ? 0 : input.charAt(current++); }
}
