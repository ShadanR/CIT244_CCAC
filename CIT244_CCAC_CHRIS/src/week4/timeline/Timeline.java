/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.timeline;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import week4.timeline.components.Component;

/**
 *
 * @author christopher.eckles
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Timeline {
    int startYear;
    String author;
    String Description;
    ArrayList<Component> components = new ArrayList<>();
    
        public int generateYearSince(int currYear) {
        return currYear - startYear;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<Component> components) {
        this.components = components;
    }
        
    public void exportTimeline(){
        for(Component component: components){
            component.export();
        }
    }    
    
    public void loadTimeline(){
        
      //  this.components.add(component);
    }            
}
