package leerXml_Clientes;

import java.util.List;

public class leerXml {
	public static void main(String args[]) {
        StaXParser read = new StaXParser();
        List<Item> readConfig = read.readConfig("C:\\sergio\\Clientes.xml");
        for (Item item : readConfig) {
            System.out.println(item);
        }
    }
}
