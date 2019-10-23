package com.hexa.model;
import java.io.Serializable;
import java.util.UUID;

import javax.annotation.ManagedBean;

import org.primefaces.event.SelectEvent;
import org.primefaces.model.mindmap.DefaultMindmapNode;
import org.primefaces.model.mindmap.MindmapNode;

@javax.faces.bean.ManagedBean
public class MindmapView implements Serializable {
     
    private MindmapNode root;
     
    private MindmapNode selectedNode;
     
    public MindmapView() {
        root = new DefaultMindmapNode("Hexaware", "Hexaware Chennai", "FFCC00", false);
         
        MindmapNode ATM = new DefaultMindmapNode("ATM", "ATM Competency", "6e9ebf", true);
        MindmapNode DA = new DefaultMindmapNode("DA", "DA Competency", "6e9ebf", true);
        MindmapNode BI = new DefaultMindmapNode("BI", "BI Competency", "6e9ebf", true);
         
        root.addNode(ATM);
        root.addNode(DA);
        root.addNode(BI);
    }
 
    public MindmapNode getRoot() {
        return root;
    }
 
    public MindmapNode getSelectedNode() {
        return selectedNode;
    }
    public void setSelectedNode(MindmapNode selectedNode) {
        this.selectedNode = selectedNode;
    }
 
    public void onNodeSelect(SelectEvent event) {
        MindmapNode node = (MindmapNode) event.getObject();
         
        //populate if not already loaded
        if(node.getChildren().isEmpty()) {
            Object label = node.getLabel();
 
            if(label.equals("ATM")) {
                for(int i = 0; i < 25; i++) {
                    node.addNode(new DefaultMindmapNode("Atm " + i, false));
                }
            }
            else if(label.equals("BI")) {
            	node.addNode(new DefaultMindmapNode("BI - Business Intelligence", false));
            	node.addNode(new DefaultMindmapNode("BI - Null", false));
            	node.addNode(new DefaultMindmapNode("BI - Null", false));
            	node.addNode(new DefaultMindmapNode("BI - Null", false));
            }
            else if(label.equals("DA")) {
                    node.addNode(new DefaultMindmapNode("DA 1 - Testing", false));
                    node.addNode(new DefaultMindmapNode("DA 2 - Automatio", false));
                    node.addNode(new DefaultMindmapNode("DA 3 - Manual", false));
                    node.addNode(new DefaultMindmapNode("DA 4 - Mobile App Testing", false));
            }
        }   
    }
     
    public void onNodeDblselect(SelectEvent event) {
        this.selectedNode = (MindmapNode) event.getObject();        
    }
}