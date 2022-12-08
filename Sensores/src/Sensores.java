import java.util.Date;
import java.util.Random;

public class Sensores {

    // declaração do nome das classes.
    public int sensorTemperatura;
    public int sensorUmidade;
    public int sensorCarbonico;
    public int sensorManual;

    // ABERTURA DA CLASSE
    public void sensorTemperatura() {
        int[] vet; // DECLARAÇÃO DO TIPO DE VETOR;
        Random r = new Random();// DECLARAÇÃO DO METÓDO ALEATORIO
        Date date = new Date();// DECLARAÇÃO METODO DE DATA
        int aux = 0; // VARIÁVEL QUE VAI SER USADA PARA AJUDAR NO ALGORITMO DE ORDENAÇÃO.
        vet = new int[48];// DEFINIÇÃO DO TAMANHO DO VETOR, QUE É 16

        // ALGORITMO DE NUMEROS ALEATORIOS
        // vet.legth -> vet é o nome que deu para a variável do vetor, e legth é o
        // tamanho definido no vetor.
        for (int i = 0; i < vet.length; i++) {// REPETIÇÃO E LEITURA DE CADA LINHA DETERMINADA NO VETOR
            vet[i] = r.nextInt(70);// GERAÇÃO E INCLUSAO DE UM NUMERO ALEATORIO EM CADA UMA DAS LINHAS
        }
        // ALGORITMO DE ORDENAÇÃO
        for (int i = 0; i <= vet.length; i++) {// LEITURA DE LINHAS DETERMINADAS NO VETOR
            for (int j = 0; j < vet.length - 1; j++)// VERIFICAÇÃO DO NUMERO EM CADA LINHA
                if (vet[j] >= vet[j + 1]) {// CONDIÇÃO PARA COMEÇAR A ORDENAÇÃO
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
        }
        // IMPRESSAO NA TELA
        for (int j = 0; j < vet.length; j++) {// ALGORITMO PARA REPETIR AS FUNÇÕES DENTRO DO LAÇO
            date = new Date(date.getTime() + 30 * 60 * 1000); // METODO PARA CHAMAR A DATA ATUAL E IR SOMANDO MEIA HORA
                                                              // NA DATA ATUAL QUE É 30*60*1000.
            System.out.printf("Temperatura: " + vet[j] + "°C");// CHAMANDO OS NUMÉROS JÁ ORDENADOS NO ALGORITMO DE
                                                               // ORDENAÇÃO
            System.out.printf(" - Data/Hora: " + date);// CHAMANDO A VARIÁVEL DATA, QUE JÁ ESTÁ SOMANDO MEIA EM MEIA
                                                       // HORA.
            System.out.println("");
        }
    }

    public void sensorUmidade() {
        int[] vet;
        Date date = new Date();
        int aux = 0;
        vet = new int[48];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (Math.random() * 53) + 17;// DEFINI O INTERVALO DE NÚMEROS QUE IRIA SER GERADOS.

        }
        for (int i = 0; i <= vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++)
                if (vet[j] <= vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
        }
        for (int j = 0; j < vet.length; j++) {
            date = new Date(date.getTime() + 30 * 60 * 1000);
            System.out.printf("Umidade: " + vet[j] * 0.25 + " %%");
            System.out.printf(" - Data/Hora: " + date);
            System.out.println("");
        }
    }

    public void sensorCarbonico() throws InterruptedException {
        int[] vet;
        Date date = new Date();
        int aux = 0;
        vet = new int[48];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (Math.random() * 30) + 20;
        }
        for (int i = 0; i <= vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++)
                if (vet[j] >= vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
        }
        for (int j = 0; j < vet.length; j++) {
            date = new Date(date.getTime() + 30 * 60 * 1000);
            System.out.printf("GÁS CARBONICO: " + vet[j] + " CO²");
            System.out.printf(" - Data/Hora: " + date);
            System.out.println("");
        }
    }

    public void AtivadorTemperatura() throws InterruptedException {
        System.out.println("-------------------------");
        System.out.println("INICIANDO COLETA DE DADOS AUTOMÁTICA DA TEMPERATUA...");
        System.out.println("-------------------------");
        Thread.sleep(5000);

    }

    public void AtivadorUmidade() throws InterruptedException {
        System.out.println("-------------------------");
        System.out.println("INICIANDO COLETA DE DADOS AUTOMÁTICA DA UMIDADE...");
        System.out.println("-------------------------");
        Thread.sleep(5000);
    }

    public void AtivadorCarbonico() throws InterruptedException {
        System.out.println("-------------------------");
        System.out.println("INICIANDO COLETA DE DADOS AUTOMÁTICA DO GÁS CARBÔNICO...");
        System.out.println("-------------------------");
        Thread.sleep(5000);
    }
}