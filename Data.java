/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 *
 * @author hristova
 */
public class Data extends Observable{
    private Map<String, FolkloreDatas> folkloresData;
    private FolkloreDatas fd;
    
    public Data(){
        this.folkloresData = new HashMap<String, FolkloreDatas>();
    }
    
    public Data(Map<String, FolkloreDatas> folkloreData, FolkloreDatas fd) {
        this.folkloresData = folkloreData;
        this.fd = fd;
    }

       public Map<String, FolkloreDatas> getFolkloreData() {
        return folkloresData;
    }

    public FolkloreDatas getFd() {
        return fd;
    }

    public void addData(FolkloreDatas d) {
        boolean flag = folkloresData.containsKey(d.getName());
        folkloresData.put(d.getName(), d);
        fd = d;
        if(!flag){
            this.setChanged();
            this.notifyObservers();
        }
    }

}
