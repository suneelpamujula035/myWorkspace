package serializationAndDeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationAndDeserialization_01 implements Serializable {


		String name;
		int num;
		
		public SerializationAndDeserialization_01(String name, int num) {
			super();
			this.name = name;
			this.num = num;
		}

		public static void main(String[] args) throws IOException {
		
			SerializationAndDeserialization_01 s = new SerializationAndDeserialization_01("suneel", 101);
			FileOutputStream fout = new FileOutputStream("E:\\catia\\suneel.txt");//We can also use .ser, .txt extension
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s);
			out.close();
			fout.close();
			
			
	}

}
//Serialization is a process of converting the state of object into a byte stream
//Byte stream is a platform independent
//We use Serializable interface

//Object-------->Byte stream---------->ObjectOutputStream writeObject()
//Byte stream ---------->Object--------->ObjectInputStream readObject()
