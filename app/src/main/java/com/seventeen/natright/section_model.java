package com.seventeen.natright;

public class section_model {
    String section_name;
    int section_image;

    public section_model(String section_name, int section_image) {
        this.section_name = section_name;
        this.section_image = section_image;
    }

    public String getSection_name() {
        return section_name;
    }

    public int getSection_image() {
        return section_image;
    }
}
