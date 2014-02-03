/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.desktop.utils;

/**
 *
 * @author kaciano
 */
public class CommonUtils {

    public String[] getStates() {
        String[] estados = {"--", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES",
            "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR",
            "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC",
            "SE", "SP", "TO"};
        return estados;
    }

    public String[] getAddressPrefix() {
        String[] endereços = {"Nenhum", "Aerop.", "Alameda", "Área", "Avenida",
            "Campo", "Chácara", "Colônia", "Condom.",
            "Conjunto", "Distrito", "Esplanada", "Estação",
            "Estrada", "Favela", "Fazenda", "Feira", "Jardim",
            "Ladeira", "Lago", "Lagoa", "Largo", "Loteamento",
            "Morro", "Núcleo", "Parque", "Passarela", "Pátio",
            "Praça", "Quadra", "Recanto", "Residencial",
            "Rodovia", "Rua", "Setor", "Sítio", "Travessa",
            "Trecho", "Trevo", "Vale", "Vereda", "Via",
            "Viela", "Vila"};
        return endereços;
    }
}
