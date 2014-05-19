/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicobjects.tools;

import java.util.Vector;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListManager implements ListSelectionListener {

    private JList list1, list2;
    private Vector<String> data1, data2;
    private int selectedData1[];
    private int selectedData2[];

    public ListManager(JList list1, JList list2, Vector<String> data1, Vector<String> data2) {
        this.list1 = list1;
        this.list2 = list2;
        this.data1 = data1;
        this.data2 = data2;
        list1.setListData(data1);
        list1.addListSelectionListener(this);
        list2.setListData(data2);
        list2.addListSelectionListener(this);
    }
    
    public ListManager(JList list1,JList list2){
       this.list1 = list1;
       this.list2 = list2;
       list1.addListSelectionListener(this);
       list2.addListSelectionListener(this);
    }

     public void setData1(Vector<String> data1) {
        this.data1 = data1;
         list1.setListData(data1);        
    }

    public void setData2(Vector<String> data2) {
        this.data2 = data2;
        list2.setListData(data2);       
    }
    
    
    private void updateLists() {
        list1.setListData(data1);
        list2.setListData(data2);
    }

    public void clearDuplicateList2() {
        data2.removeAll(data1);
        updateLists();
    }
    
     public void clearDuplicateList1() {
        data1.removeAll(data2);
        updateLists();
    }

    public void moveDataInList2() {
        data2.addAll(data1);
        data1.clear();
        updateLists();
    }

    public void moveDataInList1() {
        data1.addAll(data2);
        data2.clear();
        updateLists();
    }

    public void moveSelectionDataInList2() {
        Vector<String> deleteList = new Vector<String>();
      if(selectedData1!=null){
          System.out.println("test");
          System.out.println("data lengs"+selectedData1.length);
        for (int i = 0; i < selectedData1.length; i++) {
            data2.add(data1.get(selectedData1[i]));
            deleteList.add(data1.get(selectedData1[i]));
        }

        for (String mambers : deleteList) {
            data1.remove(mambers);
        }
       deleteList.clear();
       selectedData1 =null; 
      }
        updateLists();
    }
    
    
     
    public void moveSelectionDataInList1() {
        Vector<String> deleteList = new Vector<String>();
      if(selectedData2!=null){
        for (int i = 0; i < selectedData2.length; i++) {
            data1.add(data2.get(selectedData2[i]));
            deleteList.add(data2.get(selectedData2[i]));
        }

        for (String mambers : deleteList) {
            data2.remove(mambers);
        }
       deleteList.clear();
       selectedData2 =null; 
      }
        updateLists();
    }
    

    @Override
    public void valueChanged(ListSelectionEvent e) {

        if (e.getSource().equals(list1)) {
            if (e.getValueIsAdjusting()) {
                selectedData1 = list1.getSelectedIndices();
            }
        }
        
         if (e.getSource().equals(list2)) {
            if (e.getValueIsAdjusting()) {
                selectedData2 = list2.getSelectedIndices();              
            }
        }
        
    }
}