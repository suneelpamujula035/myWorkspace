package serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationAndDeserialization_02 implements Serializable {


		String name;
		int num;
		
		public SerializationAndDeserialization_02(String name, int num) {
			super();
			this.name = name;
			this.num = num;
		}

		public static void main(String[] args) throws IOException, ClassNotFoundException {
		
			FileInputStream fin = new FileInputStream("E:\\catia\\suneel.ser");//We can also use .ser, .txt extension
			ObjectInputStream in = new ObjectInputStream(fin);
			SerializationAndDeserialization_02 s1 = (SerializationAndDeserialization_02) in.readObject();
			in.close();
			fin.close();
			System.out.println(s1.name+"  "+s1.num);
			
			
	}

}
//Serialization is a process of converting the state of object into a byte stream
//Byte stream is a platform independent
//We use Serializable interface

//Object-------->Byte stream---------->ObjectOutputStream writeObject()
//Byte stream ---------->Object--------->ObjectInputStream readObject()
