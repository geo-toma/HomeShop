package com.georges.homeshop;

public interface Writer {
    /**
     * start writer process
     */
    void start();

    /**
     * write on line
     * @param line contain all text to display.
     */
    void writeLine(String line);

    /**
     * stop the process
     */
    void stop();
}
