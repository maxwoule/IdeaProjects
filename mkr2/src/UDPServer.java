import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        try {
            // Створення сокету для прийому даних
            DatagramSocket serverSocket = new DatagramSocket(1111);

            // Буфер для отриманих даних
            byte[] receiveData = new byte[1024];

            while (true) {
                // Отримання даних від клієнта
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);

                // Конвертація отриманих даних у рядок
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                // Визначення довжини отриманого повідомлення
                int length = message.length();

                // Перетворення довжини у рядок та конвертація у масив байтів для відправки
                byte[] sendData = Integer.toString(length).getBytes();

                // Створення пакету для відправлення відповіді клієнту
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), receivePacket.getPort());
                serverSocket.send(sendPacket);
            }
        } catch (Exception e) {
            // Обробка винятків
            e.printStackTrace();
        }
    }
}
