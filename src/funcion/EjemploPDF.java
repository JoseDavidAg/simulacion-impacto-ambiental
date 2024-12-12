package funcion;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class EjemploPDF {

    
    public static void exportTableToPDF(JTable jTable, JPanel panel, JPanel panel2, String filePath) {
    // Crear un JFileChooser para seleccionar la ruta del archivo
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Guardar PDF");
    fileChooser.setSelectedFile(new File(filePath)); // Nombre inicial del archivo

    int userSelection = fileChooser.showSaveDialog(null);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        filePath = selectedFile.getAbsolutePath();

        // Verificar que la extensión sea .pdf
        if (!filePath.toLowerCase().endsWith(".pdf")) {
            filePath += ".pdf";
        }

        try {
            // Crear un documento PDF (tamaño A4)
            Document document = new Document(PageSize.A4);
            PdfWriter.getInstance(document, new FileOutputStream(filePath));

            // Abrir el documento
            document.open();

            // Crear una tabla PDF con el mismo número de columnas que el JTable
            TableModel model = jTable.getModel();
            PdfPTable pdfTable = new PdfPTable(model.getColumnCount());

            // Añadir los encabezados
            for (int i = 0; i < model.getColumnCount(); i++) {
                PdfPCell header = new PdfPCell(new Phrase(model.getColumnName(i)));
                header.setHorizontalAlignment(Element.ALIGN_CENTER);
                header.setBackgroundColor(Color.LIGHT_GRAY);
                pdfTable.addCell(header);
            }

            // Añadir las filas de datos
            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    Object value = model.getValueAt(row, col);
                    pdfTable.addCell(value != null ? value.toString() : "");
                }
            }

            // Añadir la tabla al documento
            document.add(pdfTable);
            document.add(new Paragraph("")); // Añade un renglón en blanco

            // Renderizar el primer panel a una imagen
            BufferedImage panelImage = new BufferedImage(
                    panel.getWidth(),
                    panel.getHeight(),
                    BufferedImage.TYPE_INT_RGB
            );
            Graphics2D g2d = panelImage.createGraphics();
            panel.paint(g2d);
            g2d.dispose();

            // Convertir la imagen en un objeto iText
            com.lowagie.text.Image pdfImage = com.lowagie.text.Image.getInstance(panelImage, null);
            pdfImage.setAlignment(Element.ALIGN_CENTER);

            // Añadir la primera imagen al documento
            document.add(pdfImage);
            document.add(new Paragraph("")); // Añade un renglón en blanco

            // Renderizar el segundo panel a una imagen
            BufferedImage panelImage2 = new BufferedImage(
                    panel2.getWidth(),
                    panel2.getHeight(),
                    BufferedImage.TYPE_INT_RGB
            );
            Graphics2D g2 = panelImage2.createGraphics();
            panel2.paint(g2);
            g2.dispose();

            // Convertir la segunda imagen en un objeto iText
            com.lowagie.text.Image pdfImage2 = com.lowagie.text.Image.getInstance(panelImage2, null);
            pdfImage2.setAlignment(Element.ALIGN_CENTER);

            // Añadir la segunda imagen al documento
            document.add(pdfImage2);

            // Cerrar el documento
            document.close();

            // Notificar al usuario que el archivo fue guardado
            JOptionPane.showMessageDialog(null, "PDF guardado correctamente en: " + filePath);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrió un error al generar el PDF: " + e.getMessage(),
                                          "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "La operación fue cancelada.", "Cancelado", JOptionPane.WARNING_MESSAGE);
    }
}


    
}
