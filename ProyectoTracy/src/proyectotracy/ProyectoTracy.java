/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectotracy;

import java.io.File;



/**
 *
 * @author SimonValera
 */
public class ProyectoTracy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String rutaPDF = "\"E:\\pp\\Estudos de Caso\\1_F_AdvancedMining_OP_2 - RocheBay - (Nunavut-Canada) - (P005) - B.pdf\"";

        try (PDDocument Document = PDDocument.load(new File(rutaPDF))) {
            PDFTextStripper textStripper = new PDFTextStripper();
            String text = textStripper.getText(Document);

            String costOpex = extractData(text, "Cost opex: (\\d+(\\.\\d+)?)");
            String costCapex = extractData(text, "Cost capex: (\\d+(\\.\\d+)?)");
            String capacidadeProcessamento = extractData(text, "Capacidade de processamento: (\\d+(\\.\\d+)?)");
            String vidaUtilMina = extractData(text, "Vida útil estimada da mina: (\\d+)");
            String teorPrata = extractData(text, "Teor médio de prata: (\\d+(\\.\\d+)?)");
            String recuperacaoPrata = extractData(text, "Recuperação metalúrgica de prata: (\\d+(\\.\\d+)?)");
            String cicloRecuperacao = extractData(text, "Ciclo de recuperação de lixiviação: (\\d+(\\.\\d+)?)");
            String producaoMensalPrata = extractData(text, "Produção mensal estimada de prata: (\\d+(\\.\\d+)?)");
            String capacidadePlantaMerrillCrowe = extractData(text, "Capacidade da planta Merrill-Crowe: (\\d+(\\.\\d+)?)");
            String capacidadePlantaDesintoxicacao = extractData(text, "Capacidade da planta de desintoxicação de efluentes: (\\d+(\\.\\d+)?)");
            String potenciaInstalada = extractData(text, "Potência instalada estimada: (\\d+(\\.\\d+)?)");
            String potenciaMaximaTracao = extractData(text, "Potência máxima de tração: (\\d+(\\.\\d+)?)");
            String consumoCriticoEstimado = extractData(text, "Consumo crítico estimado: (\\d+(\\.\\d+)?)");
            String consumoEnergiaEstimado = extractData(text, "Consumo estimado de energia: (\\d+(\\.\\d+)?)");
            String geradoresDiesel = extractData(text, "Geradores a diesel: (\\d+)");
            String necessidadeAgua = extractData(text, "Necessidade de água: (\\d+(\\.\\d+)?)");
            String reservatorioAguasPluviais = extractData(text, "Reservatório de águas pluviais mínimo: (\\d+(\\.\\d+)?)");
            String custoDiretoInvestimento = extractData(text, "Custo direto estimado do investimento: (\\d+(\\.\\d+)?)");
            String custoIndiretoInvestimento = extractData(text, "Custo indireto estimado do investimento: (\\d+(\\.\\d+)?)");

            System.out.println("Cost opex: " + costOpex);
            System.out.println("Cost capex: " + costCapex);
            System.out.println("Capacidade de processamento: " + capacidadeProcessamento);
            System.out.println("Vida útil estimada da mina: " + vidaUtilMina);
            System.out.println("Teor médio de prata: " + teorPrata);
            System.out.println("Recuperação metalúrgica de prata: " + recuperacaoPrata);
            System.out.println("Ciclo de recuperação de lixiviação: " + cicloRecuperacao);
            System.out.println("Produção mensal estimada de prata: " + producaoMensalPrata);
            System.out.println("Capacidade da planta Merrill-Crowe: " + capacidadePlantaMerrillCrowe);
            System.out.println("Capacidade da planta de desintoxicação de efluentes: " + capacidadePlantaDesintoxicacao);
            System.out.println("Potência instalada estimada: " + potenciaInstalada);
            System.out.println("Potência máxima de tração: " + potenciaMaximaTracao);
            System.out.println("Consumo crítico estimado: " + consumoCriticoEstimado);
            System.out.println("Consumo estimado de energia: " + consumoEnergiaEstimado);
            System.out.println("Geradores a diesel: " + geradoresDiesel);
            System.out.println("Necessidade de água: " + necessidadeAgua);
            System.out.println("Reservatório de águas pluviais mínimo: " + reservatorioAguasPluviais);
            System.out.println("Custo direto estimado do investimento: " + custoDiretoInvestimento);
            System.out.println("Custo indireto estimado do investimento: " + custoIndiretoInvestimento);
    }
    
}
