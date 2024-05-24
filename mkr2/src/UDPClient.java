import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {
        try {
            // Створення сокету для відправлення даних
            DatagramSocket clientSocket = new DatagramSocket();

            // IP адреса та порт сервера
            InetAddress serverIP = InetAddress.getByName("localhost");
            int serverPort = 1111;

            // Створення об'єкта для зчитування введення користувача
            Scanner scanner = new Scanner(System.in);

            // Створення пакету для отримання даних від сервера
            DatagramPacket receivePacket;

            // Цикл для введення та відправлення двох повідомлень
            for (int i = 0; i < 2; i++) {
                // Введення повідомлення користувачем
                System.out.print("Введіть повідомлення: ");
                String message = scanner.nextLine();
                byte[] sendData = message.getBytes();

                // Відправлення повідомлення на сервер
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverIP, serverPort);
                clientSocket.send(sendPacket);

                // Отримання відповіді від сервера
                byte[] receiveData = new byte[1024];
                receivePacket = new DatagramPacket(receiveData, receiveData.length);
                clientSocket.receive(receivePacket);
                String response = new String(receivePacket.getData(), 0, receivePacket.getLength());

                // Виведення кількості символів отриманого повідомлення
                System.out.println("Number of symbols: " + response);
            }

            // Закриття ресурсів
            scanner.close();
            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
