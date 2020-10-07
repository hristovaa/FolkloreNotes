/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author hristova
 */
public class Horo extends Folklore{
    private String size = "";
    private String steps = "";
    
    public Horo(String name, String type, String region, String size, String steps) {
      super(name, type, region);
        this.size = size;
        this.steps = steps;
    }

    public FolkloreDatas SaveFolkloreData(){
        FolkloreDatas folkloreData = new FolkloreDatas(name, type, region, size, steps);
        folkloreData.name = name;
        folkloreData.type = type;
        folkloreData.region = region;
        folkloreData.size = size;
        folkloreData.steps = steps;

        return folkloreData;
    }
}
