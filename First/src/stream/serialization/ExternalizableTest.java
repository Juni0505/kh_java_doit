package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog myDog = new Dog();
		myDog.name = "멍멍이";
		
		FileOutputStream fos = new FileOutputStream("external.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try(fos;oos){
			oos.writeObject(myDog);
		}catch(IOException e) {
			e.printStackTrace();
		}
		FileInputStream fis = new FileInputStream("external.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog dog = (Dog)ois.readObject();
		System.out.println(dog);
	}

}
