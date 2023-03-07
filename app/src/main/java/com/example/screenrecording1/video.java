package com.example.screenrecording1;

public class video {
    public video(String videoUrl, String title, String desc) {
        this.videoUrl = videoUrl;
        this.title = title;
        this.desc = desc;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    private String videoUrl , title , desc;

}
