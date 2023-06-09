package com.PracticeSet_1;

public class Practical3 {
    public static void main(String[] args) {
        int waveLength = 50; // Number of characters per wave
        int amplitude = 38; // Amplitude of the wave

        for (int i = 0; i < waveLength; i++) {
            double angle = (double) i / waveLength * 2 * Math.PI;
            int offset = (int) (amplitude * Math.sin(angle));

            // Print spaces before the sine wave
            for (int j = 0; j < offset + amplitude; j++) {
                System.out.print(" ");
            }

            // Print the wave character
            System.out.println("16");
        }
    }
    
}
