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
public class Folklore {
    protected String name = "";
    protected String type = "";
    protected String region = "";
    protected String size = "";
    protected String steps = "";
    
    public Folklore(String name, String type, String region){
        name = name;
        type = type;
        region = region;
    }

    public FolkloreDatas SaveFolkloreData(){
        FolkloreDatas folkloreData = new FolkloreDatas(name, type, region, size, steps);
        folkloreData.name = name;
        folkloreData.type = type;
        folkloreData.region = region;

        return folkloreData;
    }
}
