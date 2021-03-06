/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiskScheduling;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
/**
 *
 * @author Zero
 */
public class ResultingWindow extends javax.swing.JFrame {

    int[] nmbr = new int[1000]; 
    int LIMIT; 
    int SCALE = 300;
    int END;
    String DISPLAY = " ";
    int prevPos;
    int prevPosScale;
    int currPos;
    int currPosScale;
    
    public ResultingWindow() {
        getNumbers();
        setDisplay();
        getPrevPos();
        getCurrPos();
        setVisible(true);
        setSize(693, 386);
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ResultingPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Result");
        setResizable(false);

        ResultingPanel.setBackground(new java.awt.Color(0, 51, 51));
        ResultingPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        resultArea.setEditable(false);
        resultArea.setBackground(new java.awt.Color(0, 51, 51));
        resultArea.setColumns(20);
        resultArea.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        resultArea.setForeground(new java.awt.Color(255, 255, 255));
        resultArea.setRows(5);
        resultArea.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white), "Result", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jScrollPane1.setViewportView(resultArea);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GRAPH");

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ResultingPanelLayout = new javax.swing.GroupLayout(ResultingPanel);
        ResultingPanel.setLayout(ResultingPanelLayout);
        ResultingPanelLayout.setHorizontalGroup(
            ResultingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultingPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(ResultingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultingPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        ResultingPanelLayout.setVerticalGroup(
            ResultingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultingPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ResultingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ResultingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ResultingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public void paint(Graphics g)
    {	
	super.paint(g);
        g.setColor(Color.WHITE);
        int startx = 100, starty = 90,ctr = 0;	
	g.drawString(Integer.toString(0), startx, starty);
	g.drawString(Integer.toString(LIMIT), startx+SCALE, starty);
	g.drawLine( startx , starty, startx+SCALE, starty );
	starty+=40;
        g.drawString("Prev - " + Integer.toString(launchFrame.returnPreviousPosition()), setScale(prevPos)+startx, starty);
        g.drawLine( setScale(prevPos)+startx , starty, setScale(currPos)+startx, starty+10 );
        starty+=10;
        g.drawString("Cur - "+Integer.toString(launchFrame.returnCurrentPosition()), setScale(currPos)+startx+5, starty);
        g.drawLine( setScale(currPos)+startx , starty, setScale(nmbr[ctr])+startx, starty+10 );
        starty+=10;
        for(ctr = 0; ctr<END-1; ctr++)
        {
          g.drawString(Integer.toString(nmbr[ctr]), setScale(nmbr[ctr])+startx+5, starty);
          g.drawLine( setScale(nmbr[ctr])+startx , starty, setScale(nmbr[ctr+1])+startx, starty+10 );
          starty+=10;
        }
        if(launchFrame.returnChosenProcess()==5)
        g.drawString("a", ((setScale(nmbr[1])+setScale(nmbr[2]))/2)+startx, starty-10);
        g.drawString(Integer.toString(nmbr[ctr]), setScale(nmbr[ctr])+startx, starty);
        resultArea.setText(DISPLAY);
    }
    public final int setScale(int nmbr)
    {  
        float temp = nmbr;
        temp/=LIMIT;
        temp*=SCALE;
        return Math.round(temp);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel ResultingPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea resultArea;
    // End of variables declaration//GEN-END:variables
      
    
    private void getNumbers(){        
        if((launchFrame.returnChosenProcess() == 3)||(launchFrame.returnChosenProcess() == 4))
            END = 2;
        else if(launchFrame.returnChosenProcess() == 5)
            END = 3;
        else END = launchFrame.returnArrayCount();
        for(int ctr = 0; ctr<END;ctr++)
        {
            nmbr[ctr] = launchFrame.returnArray(ctr);

        }
        LIMIT = launchFrame.returnLimit();
    }
    
    public void setDisplay(){
        DISPLAY = launchFrame.returnDisplay();
    }
    
    public void getPrevPos(){
        prevPos = launchFrame.returnPreviousPosition();
    }
    
    public void getCurrPos() {
        currPos = launchFrame.returnCurrentPosition();
    }
}
