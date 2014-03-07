package br.com.gmp.utils.export;

import br.com.gmp.utils.test.Test;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Objeto de exportação de lista para o formato PDF
 *
 * @author kaciano
 * @version 1.0
 */
public class PDFExporter {

    /**
     * Exporta os dados da lista para o formato PDF
     *
     * @param list <code>List<?></code> Lista contendo os dados
     * @param filename <code>String</code> Nome do arquivo exportado
     * @throws FileNotFoundException
     * @throws DocumentException
     * @throws IOException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    public void export(final List<?> list, final String filename) throws FileNotFoundException, DocumentException, IOException, IllegalArgumentException, IllegalAccessException {
        export(list, list.get(0).getClass(), filename);
    }

    /**
     * Exporta os dados da lista para o formato PDF
     *
     * @param list <code>List<?></code> Lista contendo os dados
     * @param objClass <code>Class<?></code> Classe dos objetos exportados
     * @param filename <code>String</code> Nome do arquivo exportado
     * @throws FileNotFoundException
     * @throws DocumentException
     * @throws IOException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    public void export(List<?> list, Class<?> objClass, String filename) throws FileNotFoundException, DocumentException, IOException, IllegalArgumentException, IllegalAccessException {
        try (OutputStream os = new FileOutputStream(filename + ".pdf")) {
            Document doc = new Document(PageSize.A4, 36, 36, 36, 36);
            PdfWriter.getInstance(doc, os);
            doc.open();
            PdfPTable table = new PdfPTable(objClass.getDeclaredFields().length);

            //------------------------------------------------------------------
            // Preenche o cabeçalho
            for (String name : getFieldNames(objClass)) {
                PdfPCell header = new PdfPCell(new Paragraph(name));
                header.setBackgroundColor(Color.lightGray);
                header.setBorderWidth(1f);
                table.addCell(header);
            }
            //------------------------------------------------------------------
            // Preenche os dados
            for (Object obj : list) {
                for (Field field : obj.getClass().getDeclaredFields()) {
                    field.setAccessible(true);
                    table.addCell(String.valueOf(field.get(obj)));
                }
            }

            doc.add(table);
            doc.close();
        }
    }

    /**
     * Retorna os nomes das propriedades da classe indicada
     *
     * @param cl <code>Class<?></code> Classe dos objetos exportados
     * @return <code>String</code> Nomes das propriedades
     */
    private String[] getFieldNames(Class<?> cl) {
        List<String> list = new ArrayList<>();
        for (Field field : cl.getDeclaredFields()) {
            field.setAccessible(true);
            list.add(field.getName());
        }
        return list.toArray(new String[]{});
    }

    public static void main(String[] args) {
        List<Test> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Test("Name" + i, i, (i % 2 == 0)));
        }
        try {
            new PDFExporter().export(list, "exportt");
        } catch (DocumentException | IOException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(PDFExporter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}