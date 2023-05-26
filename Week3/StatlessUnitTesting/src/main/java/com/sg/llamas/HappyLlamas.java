package com.sg.llamas;

public class HappyLlamas {
    /**
     * A method to determine if the provided trampolines will result in happy llamas.
     *
     * When llamas get together they like to bounce on trampolines.
     * However, llamas are very particular about the proper number of trampolines,
     * and are usually only happy if there are between 24 to 42 (inclusive!).
     * This only changes if the trampolines are made of ultra-bouncey NASA fabric.
     * In those cases, while they still require at LEAST 24, the llamas figure
     * the more trampolines the better!
     *
     * return true if the llamas will be happy with their trampolines,
     * or false otherwise.
     *
     * @param ultraBouncy True if trampolines are made of UltraBouncy NASA fabric.
     * @param trampolines The number of trampolines
     * @return boolean indicating if the llamas are happy
     */
    public static boolean areTheLlamasHappy(boolean ultraBouncy, int trampolines) {
        if(ultraBouncy){
            if(trampolines >= 24) {
                return true;
            } else {
                return false;
            }
        } else {
            if(trampolines >= 24 && trampolines<=42) {
                return true;
            } else {
                return false;
            }
        }
    }
}