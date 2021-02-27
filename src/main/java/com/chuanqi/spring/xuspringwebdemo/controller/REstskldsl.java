package com.chuanqi.spring.xuspringwebdemo.controller;

import net.coobird.thumbnailator.Thumbnails;

import java.io.IOException;


public class REstskldsl {
    public static final String FILE_PATH = "C:\\Users\\lenovo\\Desktop\\";

    public static void main(String[] args) throws IOException {
        /*
         * 其中的scale是可以指定图片的大小，值在0到1之间，1f就是原图大小，0.5就是原图的一半大小，这里的大小是指图片的长宽。
         *
         * 而outputQuality是图片的质量，值也是在0到1，越接近于1质量越好，越接近于0质量越差。
         *
         * 对于压缩图片来说上面就已经足够了。
         * PS：经过使用后的反馈，这个工具无法正确压缩出png格式的图片
         *
         * 因为png本身就是一种无损的图片格式，而jpg是一种压缩的图片格式；
         * 当前方法目的是为了在尽可能不丢失图片质量的情况下进行的压缩；
         * 建议将图片压缩后的格式设置成jpg来解决；
         */
        String fileName = "123.gif";
        Thumbnails.of(FILE_PATH + fileName)
                .scale(1f)
                .outputQuality(0.5f)
                .toFile(FILE_PATH + fileName + ".jpg");
    }
}
