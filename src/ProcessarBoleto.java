import java.util.List;

public class ProcessarBoleto {

    LeituraRetorno leituraRetorno = new LeituraBoletoBancoBrasil();

    public void processar(String nomeArquivo){
        List<Boleto> boletos = leituraRetorno.lerArquivo(nomeArquivo);

        System.out.println("_____________________________________");
        System.out.println("Boletos Processados:");
        for(Boleto boleto: boletos){
            System.out.println(boleto);
        }


    }

    public ProcessarBoleto(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
}
