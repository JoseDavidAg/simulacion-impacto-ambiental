/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author ambro
 */
public class ExportCsv {
    
    public void ExportarTodos(JTable table, JTable tablaDos, JComboBox combo) throws IOException{
    JFileChooser newFile = new JFileChooser();
    newFile.setDialogTitle("Guardar como");
    int userSelection=newFile.showSaveDialog(null);
    
    if(userSelection==JFileChooser.APPROVE_OPTION){
        File file = newFile.getSelectedFile();
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file+".csv"))){
            TableModel model =table.getModel();
            TableModel modeloDos =tablaDos.getModel();
            
            for(int i=0; i<model.getColumnCount();i++){
                bw.write(model.getColumnName(i)+(i<model.getColumnCount()-1?",":""));
            }
            
            bw.newLine();
            
            for(int i=0;i<model.getRowCount();i++){
                for(int j=0; j<model.getColumnCount();j++){
                    bw.write(model.getValueAt(i,j)+(j<model.getColumnCount()-1?",":""));
                }
                bw.newLine();
            }
            
            //desde aqui  
            for(int i=10-combo.getSelectedIndex();i<modeloDos.getRowCount();i++){
                    bw.write(modeloDos.getValueAt(i,0)+ ","); //año
                    bw.write(",");
                    bw.write(modeloDos.getValueAt(i,7)+","); // esperanza con
                    bw.write(modeloDos.getValueAt(i,2)+","); // esperanza sin
                    bw.write(","); // no lo puso
                    bw.write(modeloDos.getValueAt(i,6)+","); // tasa con
                    bw.write(modeloDos.getValueAt(i,1)+","); // tasa sin
                    bw.write(",");
                    bw.write(modeloDos.getValueAt(i,3)+","); // RDC simulado
                    bw.write(",");
                    bw.write(modeloDos.getValueAt(i,4)+ ""); // OI simulada
                    
                bw.newLine();
            }
            
            // hasta aqui
            JOptionPane.showMessageDialog(null, "Archivo CSV guardado con éxito");
            
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo: "+ e.getMessage());
        }
    }
    }
    
    public void exportarSimulados (JTable table) throws IOException{
    JFileChooser newFile = new JFileChooser();
    newFile.setDialogTitle("Guardar como");
    int userSelection=newFile.showSaveDialog(null);
    
    if(userSelection==JFileChooser.APPROVE_OPTION){
        File file = newFile.getSelectedFile();
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file+".csv"))){
            TableModel model =table.getModel();
            
            for(int i=0; i<model.getColumnCount();i++){
                bw.write(model.getColumnName(i)+(i<model.getColumnCount()-1?",":""));
            }
            
            bw.newLine();
            
            for(int i=0;i<model.getRowCount();i++){
                for(int j=0; j<model.getColumnCount();j++){
                    bw.write(model.getValueAt(i,j)+(j<model.getColumnCount()-1?",":""));
                }
                bw.newLine();
            }
            
            //desde aqui
 
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Object valor = model.getValueAt(i, j);
                    bw.write(valor != null ? valor.toString() : ""); // Escribir valor o celda vacía
                    if (j < model.getColumnCount() - 1) {
                        bw.write(","); // Separador
                    }
                }
                bw.newLine(); // Nueva línea al final de la fila
            }
            
            // hasta aqui
            JOptionPane.showMessageDialog(null, "Archivo CSV guardado con éxito");
            
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo: "+ e.getMessage());
        }
    }
    }
    
}
