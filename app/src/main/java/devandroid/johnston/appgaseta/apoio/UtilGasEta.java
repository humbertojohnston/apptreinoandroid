package devandroid.johnston.appgaseta.apoio;

public class UtilGasEta {

    public void metodoEstatico() {}

    public static void metodoNaoEstatico (){}

    public static String mensagem () {

        return "Qualquer mensagem...";
    }

    public static double preco(){

        return 9.99;
    }

    public static String calcularMelhorOpcao(double gasolina, double etanol) {

        // PREÇO DA GASOLINA: R$ 5.12
        // PREÇO DO ETANOL: R$ 3.99
        //PREÇO IDEAL: GASOLINA * 0.70 = R$ 3.548

        double precoIdeal = gasolina * 0.70;
        String mensagemDeRetorno;

        if(etanol <= precoIdeal) {

            mensagemDeRetorno = "Abastecer com Etanol";

        } else {

          mensagemDeRetorno = "Abastecer com Gasolina";
        }

        //SE O PREÇO DO ETANOL FOR IGUAL OU MENOR QUE O PREÇO IDEAL,
        //MELHOR ABASTECER COM ETANOL, CASO CONTRÁRIO, A GASOLINA É
        //MAIS VANTAGEM.

        return mensagemDeRetorno; //ABASTECER COM GASOLINA OU ABASTECER COM ETANOL
    }

}
