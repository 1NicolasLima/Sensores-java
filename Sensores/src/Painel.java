public class Painel {
    public static void main(String[] args) throws InterruptedException {
        /*
         * AQUI SERÁ PUXADA A INFORMAÇÃO DO OUTRO ARQUIVO, É COMO UMA PONTE PARA ACESSAR
         * AS CLASSES
         */
        Sensores painel = new Sensores();
        painel.AtivadorTemperatura();
        painel.sensorTemperatura();
        painel.AtivadorUmidade();
        painel.sensorUmidade();
        painel.AtivadorCarbonico();
        painel.sensorCarbonico();

    }
}
