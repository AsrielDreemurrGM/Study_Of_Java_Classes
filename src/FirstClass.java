/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 30/04/2025
 */

public class FirstClass {

	public static void main(String[] args) {
		System.out.println("Olá Eduardo");

		Client client = new Client();
		client.registerAddress("Rua 1");
		client.setCode(1);

		System.out.println(client.getCode());
		// client.printAddress();
		System.out.println(client.returnClientAddress());
		System.out.println(client.getTotalValue());
	}
}
