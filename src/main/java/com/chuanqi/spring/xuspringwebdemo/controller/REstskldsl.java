package com.chuanqi.spring.xuspringwebdemo.controller;

import net.coobird.thumbnailator.Thumbnails;

import java.io.IOException;

public class REstskldsl {
    public static final String FILE_PATH = "C:\\Users\\lenovo\\Desktop\\";

    public static void main(String[] args) throws IOException {
        Thumbnails.of(FILE_PATH + "123.jpg")
                .scale(1f)
                .outputQuality(0.5f)
                .toFile(FILE_PATH + "1234.jpg");
    }
}
