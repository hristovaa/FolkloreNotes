package project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hristova
 */
public class FolkloreDatas{
    String name = "";
    String type = "";
    String region = "";
    String size = "";
    String steps = "";

    public FolkloreDatas(String name, String type, String region, String size, String steps) {
       this.name = name;
       this.type = type;
       this.region = region;
       this.size = size;
       this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getRegion() {
        return region;
    }

    public String getSize() {
        return size;
    }

    public String getSteps() {
        return steps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }
}
