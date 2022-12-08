public class Painel {
    public static void main(String[] args) throws InterruptedException {
        // AQUI SERÁ PUXADA A INFORMAÇÃO DO OUTRO ARQUIVO, É COMO UMA PONTE PARA ACESSAR
        // AS CLASSES
        // Sensores é para acessar o arquivo ande está as classes
        // temperatura é nome que criei para esse método.
        // new Sensores() é a criação no novo sensor dentro desse arquivo.
        // agora temperatura pode acessar o outro arquivo Sensoares
        // então eu uso o temperatura. sensorTemperatura, que é a classe que criei no
        // Sensores.java
        Sensores painel = new Sensores();
        // painel.sensorManual();
        painel.AtivadorTemperatura();
        painel.sensorTemperatura();
        painel.AtivadorUmidade();
        painel.sensorUmidade();
        painel.AtivadorCarbonico();
        painel.sensorCarbonico();

    }
}
