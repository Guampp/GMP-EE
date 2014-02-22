package br.com.gmp.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Coleção de métodos utilitários para trabalhar Datas
 *
 * @author kaciano
 * @version 1.0
 */
public class DateUtil {

    /**
     * Retorna um array contendo todos ultimos 100 anos
     *
     * @return <code>String[]</code> Array de anos
     */
    public String[] getYears() {
        int actual = new Date().getYear() + 1900;
        int initial = actual - 100;
        int dif = 100;
        String[] yearList = new String[dif];
        int j = 0;
        for (int i = actual; i != initial; i--) {
            if (j <= 100) {
                yearList[j] = String.valueOf(i);
                j++;
            } else {
                break;
            }
        }
        return yearList;
    }

    /**
     * Retorna um List contendo todos ultimos 100 anos
     *
     * @return <code>List<String></code> Lista dos anos
     */
    public List<String> getYearList() {
        return Arrays.asList(getYears());
    }

    /**
     * Retorna a quantidade de dias entre uma data e outra. Formato da data
     * (dd/MM/yyyy)
     *
     * @param begin <code><b>String</b></code> Data inicial
     * @param end <code><b>String</b></code> Data final
     * @return <code><b>Integer</b></code> Diferença em dias
     * @throws ParseException
     */
    public int daysBetween(String begin, String end) throws ParseException {
        GregorianCalendar ini = new GregorianCalendar();
        GregorianCalendar fim = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ini.setTime(sdf.parse(begin));
        fim.setTime(sdf.parse(end));
        long dt1 = ini.getTimeInMillis();
        long dt2 = fim.getTimeInMillis();
        return (int) (((dt2 - dt1) / 86400000) + 1);
    }

    /**
     * Retorna a quantidade de dias entre uma data e outra.
     *
     * @param begin <code><b>String</b></code> Data inicial
     * @param end <code><b>String</b></code> Data final
     * @param format <code><b>String</b></code> Formato das datas
     * @return <code><b>Integer</b></code> Diferença em dias
     * @throws ParseException
     */
    public int daysBetween(String begin, String end, String format) throws ParseException {
        GregorianCalendar ini = new GregorianCalendar();
        GregorianCalendar fim = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        ini.setTime(sdf.parse(begin));
        fim.setTime(sdf.parse(end));
        long dt1 = ini.getTimeInMillis();
        long dt2 = fim.getTimeInMillis();
        return (int) (((dt2 - dt1) / 86400000) + 1);
    }

    /**
     * Retorna a quantidade de dias entre uma data e outra
     *
     * @param begin <code><b>Date</b></code> Data inicial
     * @param end <code><b>Date</b></code> Data final
     * @return <code><b>Integer</b></code> Diferença em dias
     * @throws ParseException
     */
    public int daysBetween(Date begin, Date end) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return daysBetween(sdf.format(begin), sdf.format(end));
    }

    /**
     * Verifica se uma data está em um determinado periodo de tempo
     *
     * @param param <code><b>Date</b></code> Data parametro
     * @param first <code><b>Date</b></code> Data inicial
     * @param last <code><b>Date</b></code> Data final
     * @return <code>Boolean</code> Está no periodo?
     */
    public Boolean isBetween(Date param, Date first, Date last) {
        return param.after(first) && param.before(last);
    }

    /**
     * Verifica se uma data está em um determinado periodo de tempo. Formato da
     * data (dd/MM/yyyy)
     *
     * @param param <code><b>String</b></code> Data parametro
     * @param first <code><b>String</b></code> Data inicial
     * @param last <code><b>String</b></code> Data final
     * @return <code>Boolean</code> Está no periodo?
     * @throws java.text.ParseException
     */
    public Boolean isBetween(String param, String first, String last) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date p = sdf.parse(param);
        Date begin = sdf.parse(first);
        Date end = sdf.parse(last);
        return isBetween(p, begin, end);
    }

    /**
     * Verifica se uma data está em um determinado periodo de tempo. Formato da
     * data (dd/MM/yyyy)
     *
     * @param param <code><b>String</b></code> Data parametro
     * @param first <code><b>String</b></code> Data inicial
     * @param last <code><b>String</b></code> Data final
     * @param format <code><b>String</b></code> Formato das datas
     * @return <code>Boolean</code> Está no periodo?
     * @throws java.text.ParseException
     */
    public Boolean isBetween(String param, String first, String last, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date p = sdf.parse(param);
        Date begin = sdf.parse(first);
        Date end = sdf.parse(last);
        return isBetween(p, begin, end);
    }
}
