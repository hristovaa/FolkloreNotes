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
public class Song extends Folklore{
    public Song(String name, String type, String region) {
        super(name, type, region);
    }

  
    public FolkloreDatas SaveFolkloreData(){
        FolkloreDatas folklore = new FolkloreDatas(name, type, region, size, steps);
        folklore.name = name;
        folklore.type = type;
        folklore.region = region;
        return folklore;
    }
}
