package org.example.utils;

import java.io.IOException;

/**
 * flv转mp4
 * @author 燧枫
 * @date 2023/5/19 16:52
*/
public class VideoConverter {

    public static void convertFlvToMp4(String inputPath, String outputPath) {
        ProcessBuilder processBuilder = new ProcessBuilder("ffmpeg", "-i", inputPath, "-codec", "copy", outputPath);
        try {
            Process process = processBuilder.start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}